import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		int x, a, b, c, d, e;
		System.out.printf("�п�J����ơG");
		x = scanner.nextInt();
		if(x > 99999 || x < 10000) {
			System.out.printf("error");
		}
		else {
			a = x / 10000;			//�����
			b = (x / 1000)%10;		//�|���
			d = (x / 10)% 10;	 	//�G���
			e = x % 10 ;				//�@���
			if(a == e && b == d){
				System.out.printf("Yes");
			}
			else {
				System.out.printf("No");
			}
		}
	}
}
