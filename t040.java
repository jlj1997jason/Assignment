import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		String[] a = new String[3];
		for(int i = 0;i < a.length; i++) {
			int num = 1;
			num += i;
			System.out.print("�п�J��"+num+"�өm�W: ");
			String b = scanner.next();
			a[i] = b;
			
		}
		for(int i = 0;i < a.length;i++) {
			char[] charArray = a[i].toCharArray();
			for(int j = 0; j < a[i].length();j++) {
				System.out.print(charArray[j]);
			}
			System.out.println();
		}
	}

}
