
import java.util.Scanner;
public class IntegerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�@�Ӧr��:");
		
		char a = scanner.next().charAt(0);
		System.out.print("�п�J�@�Ӧr��:");
		char b = scanner.next().charAt(0);
		int a1 = (int) a;
		int b1 = (int) b;
		
		if(a1 > 96 && a1 < 123) {
			int a2 = a1 - 32;
			char a3 = (char) a2;
			System.out.println( a + "���p�g�A��j�g��" + a3);
		}
		if(a1 > 64 && a1 < 91) {
			int a2 = a1 + 32;
			char a3 = (char) a2;
			System.out.println( a + "���j�g�A��p�g��" + a3);
		}
		if(b1 > 96 && b1 < 123) {
			int b2 = b1 - 32;
			char b3 = (char) b2;
			System.out.println( b + "���p�g�A��j�g��" + b3);
		}
		if(b1 > 64 && b1 < 91) {
			int b2 = b1 + 32;
			char b3 = (char) b2;
			System.out.println( b + "���j�g�A��p�g��" + b3);
		}
	}
}
