import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int option;
		int m, n, result;
		System.out.printf("�B��G1�^��,2�^-,3�^*,4�^/,-1�^Quit�G");
		option = scanner.nextInt();
		
		if(option <=0 || option >= 5) {
			//�פ�{��
			System.out.printf("End!");
		}
		else if(option == -1){
			System.out.printf("Error");
		}
		else {
			System.out.printf("�Ʀr1�G\n");
			System.out.printf("�Ʀr2�G\n");
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
					System.out.printf("���~�A���Ƭ��s");
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
