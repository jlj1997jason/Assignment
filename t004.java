import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		int x, day, hour, min, sec;				//�ŧi�ܼ�
		System.out.print("��J���:\n");			
		x = scanner.nextInt();					//���y��J��
		
		day = x / 86400;						//�p��Ѽ�
		hour = (x % 86400)/3600;				//�p��p��
		min = (x % 86400) % 3600 / 60;			//�p�����
		sec = (x % 86400) % 3600 % 60;			//�p����
		
		System.out.printf(" day:" + day + " hour: " + hour + " min:"+ min +" sec:"+sec);
		
		
		
	}
}
