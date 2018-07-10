import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		double m, n, a1, a2, a3, a4;
		System.out.print(" 請輸入兩個浮點數: ");
		m = scanner.nextDouble();
		n = scanner.nextDouble();
					
		a1 = m + n;
		a2 = m - n;
		a3 = m * n;
		a4 = m / n;
		
		System.out.printf(" 您的輸入相加為  %.2f\n", a1 );
		System.out.printf(" 您的輸入相減為 %.2f\n", a2 );
		System.out.printf(" 您的輸入相乘為  %.2f\n", a3 );
		
		if(n == 0) {
			System.out.print("您的輸入相除為錯誤，除數為零");
		}
		else {
			System.out.printf(" 您的輸入相除為%.2f\n" , a4);
		}
	}

}
