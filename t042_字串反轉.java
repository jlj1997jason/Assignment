import java.util.Scanner;

public class �r����� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�@��r����:");
		String a = scanner.nextLine();
		char[] temp = a.toCharArray();
		
		for(int i = 0;i <= a.length()/2;i++) {
			char tmp = temp[i];
			temp[i] = temp[a.length()-i-1];
			temp[a.length()-i-1] = tmp;
			
		}
		System.out.print(temp);
		
		
	}

}
