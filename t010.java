import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Size: ");
		S = scanner.nextInt();


		//i = 1~5
		for(int i = 0; i < S; i++) {//01234
			for(int j = 0; j < S - i - 1; j++) {//43210
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 + 1; j++) {//13579
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//i = 6~9
		for(int i = S -1; i > 0; i--) {  //4321
			for(int j = 0; j < S - i ; j++) { //1234
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++) {//7531
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

