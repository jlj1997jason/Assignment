import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		int x, day, hour, min, sec;				//宣告變數
		System.out.print("輸入秒數:\n");			
		x = scanner.nextInt();					//掃描輸入值
		
		day = x / 86400;						//計算天數
		hour = (x % 86400)/3600;				//計算小時
		min = (x % 86400) % 3600 / 60;			//計算分鐘
		sec = (x % 86400) % 3600 % 60;			//計算秒數
		
		System.out.printf(" day:" + day + " hour: " + hour + " min:"+ min +" sec:"+sec);
		
		
		
	}
}
