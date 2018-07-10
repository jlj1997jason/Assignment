import java.util.Scanner;

public class TestPalindrome
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			System.out.print("Option: 1) Test Palindrome. -1) Quit:");
			
			int option = scanner.nextInt();
			if(option == -1)
			{
				System.out.println("End!");
				break;
			}
			if(option == 1)
			{
				System.out.print("Input a string:");
				scanner.nextLine();
				char[] inputString = scanner.nextLine().toCharArray();
				
				if(TestPalindrome(inputString, 0, inputString.length - 1) == 1)
					System.out.println("The input string is a palindrome.");
				else
					System.out.println("The input string is not a palindrome.");
			}
		}
	}
	public static int TestPalindrome (char a[], int leftEnd, int rightEnd)
	{
		if(leftEnd > rightEnd)
			return 1;
		if(a[leftEnd] == ' ')
			return TestPalindrome (a, leftEnd + 1, rightEnd);
		if(a[rightEnd] == ' ')
			return TestPalindrome (a, leftEnd, rightEnd - 1);
		if(a[leftEnd] == a[rightEnd])
			return TestPalindrome (a, leftEnd + 1, rightEnd - 1);
		else
			return 0;
	}
}
