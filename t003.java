import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		int m, n, a1, a2, sum;
		System.out.print(" 請輸入兩個整數： ");
		m = scanner.nextInt();
		n = scanner.nextInt();
		
		a1 = m*m;
		a2 = n*n;
		sum = a1 + a2;
				
		System.out.printf("%d", sum);
						
		}

}
