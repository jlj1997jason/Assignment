import java.util.Scanner;
public class five_c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		int S, SN[] = new int[100];
		int E, ENG[] = new int[100];
		int M, MATH[] = new int[100];
		int AVE[] = new int[100];
		int i = 0, j;
		int temp = 0, temp1 = 0;
		int pos = 0;
		int len = SN.length;
		int OP;
		int count0 = 0,count = 0, count1 = 0, count2 = 0, count3 = 0;
		while(true) {
			if(temp == 0) {
				while(true){
					if(temp1 == 0)
						System.out.print("Insert new data (SN/ENGLISH/MATH): ");
					S = scanner.nextInt();
					E = scanner.nextInt();
					M = scanner.nextInt();
					temp1 = 1;
					if(temp1 ==1) {
						for(j = 0; j < len; j++){
							if ( SN[j] == S) {
								System.out.println("輸入錯誤請重新輸入");
								temp1 = 0;
								break;
							}
							else {
								temp1 = 2;
							}
						}
					}
					if(temp1 == 2) {
						if(S > -1 && S <= 100 && E > -1 && E <= 100 && M > -1 && M <= 100 ) {
							SN[i] = S;
							ENG[i] = E;
							MATH[i] = M;
							AVE[i] = (E + M) / 2 ;
							i++;
							temp1 = 0;
							count0++;
						}
						else if(S == -1 && E == -1 && M == -1) {
							temp = 1;
							break;
						}
						else {

							System.out.println("成績介於0~100，請重新輸入!");
							temp1 = 0;
						}
					}
				}
			}
			if(temp == 1) {
				System.out.print("Option: 1) Add. 2) Histogram. -1) Quit: ");
				OP = scanner.nextInt();
				if(OP == 1) {
					temp1 = 0;
					temp = 0;
				}
				else if(OP == 2) {
					temp = 2;
				}
				else {
					System.out.print("Bye!");
					break;
				}
			}
			if(temp == 2) {
				for(i = 1; i < len; i++) {
					for(j = 0; j < len - i ; j++) {
						if(AVE[j] < AVE[j+1]) {
							count = AVE[j];
							AVE[j] = AVE[j + 1];
							AVE[j + 1 ] = count;

							count1 = SN[j];
							SN[j] = SN[j + 1];
							SN[j + 1] = count1;

							count2 = ENG[j];
							ENG[j] = ENG[j + 1];
							ENG[j + 1] = count2;

							count3 = MATH[j];
							MATH[j] = MATH[j + 1];
							MATH[j + 1] = count3;
						}
					}
				}

				System.out.println("SN	ENG.	MATH.	AVG.");
				System.out.println("-----------------------------");
				for(i = 0; i < count0; i++) {
					System.out.print(SN[i] + "	" + ENG[i] + "	" + MATH[i] + "	" + AVE[i] +"\n");
				}
				temp = 1;
			}
		}
	}
}
