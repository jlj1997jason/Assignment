import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.lang.*;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		char [] ch = new char[10];
		int [] ch2 = new int[10];
		System.out.println("請輸入10個字元:");
		for(int index = 0;index < 10;index++) 
		{
		char a = scanner.next().charAt(0);
		ch[index] = a;
		ch2[index] = (int)ch[index];
			if((ch2[index] > 64 && ch2[index] < 91) || (ch2[index] > 96 && ch2[index] < 123))
			{
				System.out.println(ch[index] + "是字母");
			}
			else {
				System.out.println(ch[index] + "是數字");
			}
			
		}
	}
	
}
