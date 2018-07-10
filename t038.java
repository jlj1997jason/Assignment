
import java.util.Scanner;
public class IntegerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一個字元:");
		
		char a = scanner.next().charAt(0);
		System.out.print("請輸入一個字元:");
		char b = scanner.next().charAt(0);
		int a1 = (int) a;
		int b1 = (int) b;
		
		if(a1 > 96 && a1 < 123) {
			int a2 = a1 - 32;
			char a3 = (char) a2;
			System.out.println( a + "為小寫，其大寫為" + a3);
		}
		if(a1 > 64 && a1 < 91) {
			int a2 = a1 + 32;
			char a3 = (char) a2;
			System.out.println( a + "為大寫，其小寫為" + a3);
		}
		if(b1 > 96 && b1 < 123) {
			int b2 = b1 - 32;
			char b3 = (char) b2;
			System.out.println( b + "為小寫，其大寫為" + b3);
		}
		if(b1 > 64 && b1 < 91) {
			int b2 = b1 + 32;
			char b3 = (char) b2;
			System.out.println( b + "為大寫，其小寫為" + b3);
		}
	}
}
