import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J���:");
		String a = scanner.next();
		String[] strArray = a.split("-");
		int num = Integer.parseInt(strArray[0]);
		System.out.printf("���� %d"+ " �~ "+strArray[1] + " �� "+ strArray[2] + " �� ",num-1911);
		
	}
}
