import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		double m, n, a1, a2, a3, a4;			//�ŧi�ܼ�
		System.out.print(" �п�J��ӯB�I�ơG ");
		m = scanner.nextDouble();				//���y�B�I��
		n = scanner.nextDouble();
		
		a1 = m+n;
		a2 = m-n;
		a3 = m*n;
		a4 = m/n;
		
		System.out.printf("%.2f" , a1);
		System.out.printf("%.2f" , a2);
		System.out.printf("%.2f" , a3);
		System.out.printf("%.2f" , a4);
		
		}

}
