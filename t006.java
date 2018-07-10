import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int option;
		int m, n, result;
		System.out.printf("運算：1）＋,2）-,3）*,4）/,-1）Quit：");
		option = scanner.nextInt();
		
		if(option <=0 || option >= 5) {
			//終止程式
			System.out.printf("End!");
		}
		else if(option == -1){
			System.out.printf("Error");
		}
		else {
			System.out.printf("數字1：\n");
			System.out.printf("數字2：\n");
			m = scanner.nextInt();
			n = scanner.nextInt();
			
			switch(option) {
			case 1:
				result = m + n;
				System.out.printf("" + result);
				break;
			case 2:
				result = m - n;
				System.out.printf("" + result);
				break;
			case 3:
				result = m * n;
				System.out.printf("" + result);
				break;
			case 4:
				if(n == 0) {
					System.out.printf("錯誤，除數為零");
				}
				else{
					result = m / n;
				System.out.printf("" + result);
				}
				break;
			
			}
			
		}
		
		
		
		
	}

}
