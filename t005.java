import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		double m, n, a1, a2, a3, a4;
		System.out.print(" �п�J��ӯB�I��: ");
		m = scanner.nextDouble();
		n = scanner.nextDouble();
					
		a1 = m + n;
		a2 = m - n;
		a3 = m * n;
		a4 = m / n;
		
		System.out.printf(" �z����J�ۥ[��  %.2f\n", a1 );
		System.out.printf(" �z����J�۴ %.2f\n", a2 );
		System.out.printf(" �z����J�ۭ���  %.2f\n", a3 );
		
		if(n == 0) {
			System.out.print("�z����J�۰������~�A���Ƭ��s");
		}
		else {
			System.out.printf(" �z����J�۰���%.2f\n" , a4);
		}
	}

}
