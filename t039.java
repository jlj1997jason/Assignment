import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("�п�J�@�Ӧr��");
			String a = scanner.next();
			System.out.println("�п�J�@�Ӧr��");
			String b = scanner.next();
			try{
				int test = Integer.parseInt(a); 
				System.out.println("�r��:" + a + "�O���");
			}
			catch(Exception e)
			{
				System.out.println("�r��:"+ a.toString() + "���O���");
			}
			try{
				int test2 = Integer.parseInt(b); 
				System.out.println("�r��:" + b + "�O���");
			}
			catch(Exception e)
			{
				System.out.println("�r��:" + b.toString() + "���O���");
			}
			
			
		}

	}

}
