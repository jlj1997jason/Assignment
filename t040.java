import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		String[] a = new String[3];
		for(int i = 0;i < a.length; i++) {
			int num = 1;
			num += i;
			System.out.print("請輸入第"+num+"個姓名: ");
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
