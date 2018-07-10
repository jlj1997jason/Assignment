import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int temp = 1, i = 0;
		int[] grades = new int[10];
		while(true) 
		{
			if(temp == 1) {
				System.out.print("Option: 1) Add. 2) Binary Search. -1) Quit:");
				int option = scanner.nextInt();
				if(option == -1) 
				{
					System.out.println("End!");
					break;
				}
				else if(option == 1) 
				{
					temp = 2;
				}
				else if(option == 2) 
				{
					temp = 3;
				}
			}
			else if(temp == 2) {
				System.out.print("Insert grade (-1 to end):");
				int grade = scanner.nextInt();
				if(grade >=0 && grade < 101) {
					grades[i++] = grade;
					
					if(i==grades.length) {
						grades = Arrays.copyOf(grades, grades.length*2);
					}
				}
				else if(grade == -1) {
					temp = 1;
				}
				else {
					System.out.println("Error!");
					temp = 2;
				}
			}
			else if(temp == 3) {
				for(int n = 1 ;n < i+1;n++) {
					for(int j = 0; j <=i-2;j++) {
						if(grades[j]>grades[j+1]) {
					int tmp = grades[j];
					grades[j]= grades[j+1];
					grades[j+1] = tmp;
						}
					}
				}
				System.out.print("Key:");
				int key = scanner.nextInt();
				if(binarySearch(grades,key,0,i)==1) {
					System.out.println("'"+ key+ "'" +" is found!");
					temp = 1;
				}
				else {
					System.out.println("'"+ key+ "'" +" is not found!");
					temp = 1;
				}
			}
		}
	}
	public static int binarySearch(int a[], int key,int start,int end)
	{
		int middle=(end+start)/2;
		if(end>=start)
		{
			if(key==a[middle])
			{
				return 1;
			}
			else if(key<a[middle])
			{
				end=middle-1;
				return binarySearch(a,key,start,end);
			}

			else
			{ 
				start=middle+1;
				return binarySearch(a,key,start,end);
			}

		}

		return 0;
	}
}
