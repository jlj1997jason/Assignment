import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.lang.*;

public class c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��J�@�Ӽƭ�(�d��:30~122):");
		int AsciiCode = scanner.nextInt();
		char Asciicode2 = (char) AsciiCode;
		System.out.println("��XAscii Code�r�� = " + Asciicode2);
		
		System.out.println("Graphics:");
		char c = scanner.next().charAt(0);
		int A = (int) c;
		
		System.out.println("��XAscii Code�ƭ� = " + A);

	}
}
