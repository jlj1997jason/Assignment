import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		int x, a, b, c, d, e;
		System.out.printf("叫块き计");
		x = scanner.nextInt();
		if(x > 99999 || x < 10000) {
			System.out.printf("error");
		}
		else {
			a = x / 10000;			//き计
			b = (x / 1000)%10;		//计
			d = (x / 10)% 10;	 	//计
			e = x % 10 ;				//计
			if(a == e && b == d){
				System.out.printf("Yes");
			}
			else {
				System.out.printf("No");
			}
		}
	}
}
