
import java.util.Scanner;
public class IntegerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("��J�@��r��^��p�g��r:");
			String a = scanner.next();
			int no = 0;
			char a1[] = a.toCharArray();
			for(int i = 0;i <= a1.length/2;i++) {
				if(a1[i]!=a1[a1.length-i-1]) {
					no++;
				}
			}
			if(no == 0) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
	}
}
