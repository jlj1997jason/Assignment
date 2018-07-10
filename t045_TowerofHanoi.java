import java.util.Scanner;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("��J�@�ӼƦrn�N��@�}�l�n���ʪ��L�l�`��:");
		int n = scanner.nextInt();
		towersOfHanoi(n,1,3,2);

	}
	public static void towersOfHanoi(int no, int from, int to, int temp) {
		if(no == 1) {
			System.out.println("�s�� "+ no +" from " + from + " to " + to);
		}
		else {
			towersOfHanoi( no-1, from, temp, to);
			System.out.println("�s�� "+ no +" from " + from + " to " + to);
			
			towersOfHanoi( no-1, temp, to, from);
		}
	}
}
