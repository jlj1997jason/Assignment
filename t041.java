import java.util.Scanner;

public class c {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入日期:");
		String a = scanner.next();
		String[] strArray = a.split("-");
		int num = Integer.parseInt(strArray[0]);
		System.out.printf("民國 %d"+ " 年 "+strArray[1] + " 月 "+ strArray[2] + " 日 ",num-1911);
		
	}
}
