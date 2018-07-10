import java.util.Scanner;

public class qwer {

	public static void main(String[] args) {
		int temp = 1, i = 0;
		Scanner scanner = new Scanner(System.in);
		int[] b = new int[10];
		while(true) 
		{
			if(temp == 1) 
			{
				System.out.print("Option: 1) Add. 2) Search. -1) Quit:");
				int option = scanner.nextInt();
				if(option == 1) 
					temp = 2;
				else if(option == 2) 
				{
					System.out.print("Key:");
					int key = scanner.nextInt();
					if(LinearSearch(b , key, i)==-1) {
						System.out.println(key + " is not found!");
					}
					else
						System.out.println(key + " is found!");
				}
				else if(option == -1) 
				{
					System.out.println("End!");
					break;
				}
			}
			else if(temp == 2) 
			{
				System.out.print("Insert grade (-1 to end):");
				int g = scanner.nextInt();
				if(g >= 0 && g <101) {
					b[i] = g;
					++i;
				}
				else if(g == -1) {
					temp = 1;
				}
				else {
					System.out.println("Input Error!");
					temp = 2;
				}
			}
		}
	}
	public static int LinearSearch (int a[], int key, int n) 
	{
		if(n == 0) 
		{
			return -1;
		}
		if(key == a[n-1]) {
			return n-1;
		}
		return LinearSearch (a, key, n-1);
			
	}
}
