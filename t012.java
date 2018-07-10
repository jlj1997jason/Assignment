import java.util.Scanner;
public class IntegerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int S ;
		System.out.print("Size: ");
		S = scanner.nextInt();
		
		// 1~5
		for(int i = 0; i < S; i++) {					//01234
			if(i == 0) {
				for(int j = 0; j < S * 2 - 1; j++) {	//0123
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else {										//i = 1234
				for(int j = 0; j < S - i - 1; j++) {	//012   01 0 //321
					System.out.print("*");
				}
				for(int j = 0; j < 1; j++) {			//01 01 01 01 //2222
					System.out.print("*");
					for(int k = 0; k < i * 2 - 1; k++) {//i=1,j=2,k=0,1,3,5,7
						System.out.print(" ");
					}
					System.out.print("*");
				}
				for(int j = 0; j < S - i - 1; j++) {	//012   01 0 //321
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		
		// 6~9
		for(int i = S -1; i >= 1; i--) {  				//4321
			if(i <= S - 1 && i > 1) {
				for(int j = 0; j < S - i ; j++) { 		//1234
					System.out.print("*");
				}
				for(int j = 0; j < 1; j++) {
					System.out.print("*");
					for(int k = 0; k < i * 2 -3; k++) {//i=1,j=2,k=0,1,3,5,7
						System.out.print(" ");
					}
					System.out.print("*");
				}
				for(int j = 0; j < S - i ; j++) {		 //1234
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else {										//i =1
				for(int j = 0; j < S * 2 - 1; j++) {	//0123
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}	
	}

}

