import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int N = 0, max = 0, min = 2147483647;
		double[] Array = new double[3];
		double[] B = new double[3];
		System.out.println("請輸入一個整數");
		N = scanner.nextInt();
				
		B = Cal(N);
		System.out.println("Maximum =" + (int)B[0]);
		System.out.println("Minimum =" + (int)B[1]);
		System.out.printf("Mean = %.3f\n", B[2]/N);
	}

	public static double[] Cal(int N) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0, max = 0, min = 2147483647;
		int total = 0;
		double[] Array = {0,2147483647,0};
		while(counter < N) {
			int A = scanner.nextInt();
			total += A;
			Array[0] = Math.max(Array[0], A);
			if(A < min) {
				Array[1] = A;
			}
			counter ++;
			Array[2] =  total;
		}
		return Array;
	}
	
}