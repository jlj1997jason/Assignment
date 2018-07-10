import java.util.Scanner;

public class 字串反轉 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一行字串資料:");
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
