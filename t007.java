import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		int x, a, b, c;
		System.out.printf("叫块计");
		x = scanner.nextInt();
		if(x > 999 || x <100) {
			System.out.printf("error");
		}
		else {
			a = x / 100;		//κ计
			b = (x % 100)/10;	//计
			c = x % 10;			//计
			if(x == a*a*a+b*b*b+c*c*c) {
				System.out.printf("Yes");
			}
			else {
				System.out.printf("No");
			}
		}
	}
}
