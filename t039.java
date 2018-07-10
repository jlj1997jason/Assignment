import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("請輸入一個字串");
			String a = scanner.next();
			System.out.println("請輸入一個字串");
			String b = scanner.next();
			try{
				int test = Integer.parseInt(a); 
				System.out.println("字串:" + a + "是整數");
			}
			catch(Exception e)
			{
				System.out.println("字串:"+ a.toString() + "不是整數");
			}
			try{
				int test2 = Integer.parseInt(b); 
				System.out.println("字串:" + b + "是整數");
			}
			catch(Exception e)
			{
				System.out.println("字串:" + b.toString() + "不是整數");
			}
			
			
		}

	}

}
