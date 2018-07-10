import java.util.Arrays;
import java.util.Scanner;

public class qwe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] b = new int[10]; 
		int temp = 1, i = 0;
		while(true) 
		{
			if(temp == 1) 
			{
				System.out.print("Option: 1) Add. 2) Minimum. -1) Quit:");
				int option = scanner.nextInt();
				if(option == 1) {
					temp = 2;
				}
				else if(option == 2) {
					temp = 3;
				}
				else if(option == -1) {
					System.out.println("End!");
					break;
				}
			}
			else if(temp == 2) 
			{
				System.out.print("Insert grade (-1 to end):");
				int g = scanner.nextInt();
				if(g >= 0 && g <101) 
				{
					b[i++] = g;
					if(i == b.length) {
						b = Arrays.copyOf(b, b.length*2);
					}
				}
				else if(g == -1) 
				{
					temp = 1;
				}
				else {
					System.out.println("Error!");
					temp = 2;
				}
			}
			else if(temp == 3) 
			{				
				System.out.println("Minimum: "+RecursiveMinimum(b,i));
				temp = 1;
			}
		}
		

	}
	public static int RecursiveMinimum(int a[], int n)
	{ 
		if(n == 1) 
			return 
					a[0]; 
		else 
		{ 
			int x= RecursiveMinimum(a,n-1); 
			return 
					a[n-1]<x?a[n-1]:x; 
		} 
	} 
}
