import java.util.Scanner;

public class IntegerExample 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int counter = 1,total = 0, sum = 0;
		while(counter <=10) {
			int x = scanner.nextInt();
			if(x >= 0 && x <= 100) {
				sum += x;
				counter++;
			}
			else
				System.out.println("Error");
		}
		int average = sum/10;
		System.out.println("average =" + average);
		System.out.println("Sum = " + sum);
	}

}
