import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int temp = 1, i = 0;
		int b[] = new int[10];
		while(true) 
		{
			if(temp == 1) 
			{
				System.out.print("Option: 1) Add. 2) Insert Sort. -1) Quit:");
				int option = scanner.nextInt();
				if(option == 1) 
					temp = 2;
				else if(option == 2) 
				{
					temp = 3;
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
				int grade = scanner.nextInt();
				if(grade>=0 && grade <101) 
				{
					b[i++] = grade;
					if(i == b.length) 
					{
						Arrays.copyOf(b, b.length * 2);
					}
				}
				else if(grade == -1) 
				{
					temp = 1;
				}
				else 
				{
					System.out.println("Error!");
					temp = 2;
				}
			}
			else if(temp == 3) 
			{
				
				System.out.println("Before sorting:");
				for(int k1 = 0;k1 < i ; k1++)
				System.out.print(b[k1]+" ");
				
				insertionSort(b,i);
				System.out.println("\nAfter sorting:");
				for(int k2 = 0;k2 < i ; k2++)
					System.out.print(b[k2]+" ");
				System.out.println();
				temp = 1;
			}
		}
	}
	public static void insertionSort(int a[], int n) 
	{
		if(n<=1) {
			;
		}
		else {
			insertionSort(a,n-1);
			
			for(int i = n -1; i >= 1;i--) 
			{
				if(a[i] <= a[i-1]) 
				{
					int tmp = a[i];
					a[i] = a[i-1];
					a[i-1] = tmp;
				}
			}
			
		}
	}

}
