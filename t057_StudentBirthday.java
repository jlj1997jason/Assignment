import java.util.Scanner;

public class StudentBirthday {

	public static Birthday[] b = new Birthday[100];
	static int i = 0, count = 0;
	public static void main() {
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print("請輸入出生年月日  (-1 -1 -1即停止):");
			int tmp1 = scan.nextInt();
			int tmp2 = scan.nextInt();
			int tmp3 = scan.nextInt();
			if(tmp1 != -1 && tmp2 != -1 && tmp3 != -1) {
				b[count] = new Birthday(tmp1,tmp2,tmp3);
				count++;
			}
			else {
				for(int pass = 1;pass<count;pass++) {
					for(int k = 0;k < count-pass ; k++) {
						int a = Birthday.compare(b[k],b[k+1]);
						if(a == -1 ) {
							Birthday temp = b[k];
							b[k] = b[k+1];
							b[k+1] = temp;
						}
					}
				}
				for(int j = 0;j<count;j++) {
					b[j].printOut();
				}
			}
		}
	}
}
class Birthday{
	private int year, month, day, i = 0;

	public Birthday(int tmp1, int tmp2, int tmp3) {
		year = tmp1;
		month = tmp2;
		day = tmp3;
	}

	public void printOut() {

		System.out.println(year+"年" + month + "月" + day + "日");
	}

	public static int compare(Birthday b1 , Birthday b2) {
		if( b1.year >= b2.year) {
			if(b1.month >= b2.month) {
				if(b1.day >= b2.day) {
					return -1;
				}
				return -1;
			}
			return -1;
		}
		return 0;
	}
}