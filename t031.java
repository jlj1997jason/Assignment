import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		int GCD = 0;
		while(true) {

			int numerator = numerator();
			if(numerator <= 0) {
				System.out.println("Error!");
			}
			int denominator = denominator();
			if(denominator <= 0) {
				System.out.println("Error!");
			}
			for(int i = 1;i < numerator && i < denominator;i++) {
				if(numerator % i == 0 && denominator % i == 0) {
					GCD = i;
				}
			}
			if(numerator > 0 && denominator > 0) {
			System.out.println("Answer: " + GCD);
			break;
			}
		}
	}
	public static int numerator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numerator:");
		int num = scanner.nextInt();
		return num;
	}
	public static int denominator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter denominator:");
		int den = scanner.nextInt();
		return den;
			
	}
}
