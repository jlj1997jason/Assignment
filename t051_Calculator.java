import java.util.Scanner;

public class CCalculatorDriver {

	public static CCalculator obj;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int temp = 0, amount = 0, num1, num2, num3;

		while(true) {
			if(temp == 0) {
				System.out.print("10���w���ӼơG");
				num1 = scanner.nextInt();
				if(num1 < 0)
					continue;
				System.out.print("5���w���ӼơG");
				num2 = scanner.nextInt();
				if(num2 < 0)
					continue;
				System.out.print("1���w���ӼơG");
				num3 = scanner.nextInt();
				if(num3 < 0)
					continue;
				obj = new CCalculator(num1, num2, num3);
				temp = 1;
			}
			else if(temp == 1) {
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("���s�� 1)�O 2)�_?");
				int option = scanner.nextInt();
				if(option == 1) {
					temp = 2;
				}
				else if(option == 2) {
					System.out.println("End!");
					break;
				}
				else {
					System.out.println("Error!");
				}
			}
			else if(temp == 2) {
				System.out.print("�Ч�J�{���G 1) 50�� 2) 100�� 3) 500�� 4) 1000�� 5)���� -1)����:");
				int optionmoney = scanner.nextInt();
				if(optionmoney == 1) {
					amount += 50;
				}
				if(optionmoney == 2) {
					amount += 100;
				}
				if(optionmoney == 3) {
					amount += 500;
				}
				if(optionmoney == 4) {
					amount += 1000;
				}
				if(optionmoney == 5) {
					temp = 3;
				}
				if(optionmoney == -1) {
					System.out.println("End!");
					break;
				}
			}
			else if(temp == 3) {
				System.out.println("�I��" + amount + "��");
				int[] tmp = obj.change(amount);
				obj.printOut(tmp);
				amount = 0;
				temp = 1;
			}
		}
	}
}
class CCalculator{
	private int coin10, coin5, coin1;

	public CCalculator(int num10, int num5, int num1) {
		if(num10 >= 0 )
			coin10 = num10;
		if(num5 >= 0)
			coin5 = num5;
		if(num1 >= 0 )
			coin1 = num1;
	}

	public int[] change(int amount){
		int[] A = new int[4];
		int i , j , k ,temp1 = 0 , temp2 = 0 , temp3 = 0;

		for(i = 0; i <= coin10 && i * 10 <= amount; i++) {
			temp1 = i;
		}
		for(j = 0; j <= coin5 && j * 5 <= amount - temp1 * 10; j++) {
			temp2 = j;
		}
		for(k = 0 ; k <= coin1 && k * 1 <= amount - temp1 * 10 - temp2 * 5;k++) {
			temp3 = k;
		}
		A[0] = temp1;
		A[1] = temp2;
		A[2] = temp3;
		A[3] = amount - temp1 * 10 - temp2 * 5 - temp3*1;
		if(A[3] <= 0) {
			coin10 -= temp1;
			coin5 -= temp2;
			coin1 -= temp3;
		}
		return A;
	}
	public void printOut (int[] coins) {
		if(coins[3] > 0){
			System.out.println("�{�������A�L�k��s");
		}
		else {
			if(coins[0] > 0)
				System.out.print("�h�^10���w��"+coins[0]+"�ӡC");
			if(coins[1] > 0)
				System.out.print("�h�^5���w��"+coins[1]+"�ӡC");
			if(coins[2] > 0)
				System.out.println("�h�^1���w��"+coins[2]+"�ӡC");
		}
	}

}
