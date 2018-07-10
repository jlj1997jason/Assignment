import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		Double U, S, L, H, a1, a2, a3, sum;
		System.out.print(" 請輸入U/L/H的參數： ");
		U = scanner.nextDouble();
		L = scanner.nextDouble();
		H = scanner.nextDouble();
		
		S = 0.75*L;
		a1 = (U+S)*H/2;
		a2 = L * H;
		a3 = (H/2)*(H/2) * 3.1416 * 2;
		sum = a1 + a2 + a3;
		
		
		
				
		System.out.printf("%.2f", sum);
						
		}

}
