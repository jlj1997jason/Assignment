import java.util.Scanner;

public class ���K2 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		String p1 = "�x�_",p2 = "�x��",p3 = "����";
		String s1 = "", s2 = "";
		int temp = 0, money = 0, x = 0;

		while(true) {
			if(temp == 0) {
				System.out.println("�ʲ� 1)�O 2)�_?");
				int a = scanner.nextInt();

				if(a == 2) {
					System.out.println("�����ʲ��I");
					break;
				}
				else if(a == 1) 
					temp ++;
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 0;
				}
			}
			else if(temp == 1) {
				System.out.println("�}�l�ʲ��I");
				System.out.println("��ܰ_���G1)" + p1 + " 2) " + p2 + "  3)" + p3 +" 4)����:");
				int b = scanner.nextInt();
				if(b == 1) {
					s1 = p1;
					temp ++;
				}
				else if(b == 2) {
					s1 = p2;
					temp ++;
				}
				else if(b == 3) {
					s1 = p3;
					temp ++;
				}
				else if(b == 4) {
					System.out.println("�����ʲ��I");
					break;
				}
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 1;
				}
			}
			else if(temp == 2) {
				System.out.println("��ܰW���G1)" + p1 + " 2) " + p2 + " 3)" + p3 + " 4)�^�W�@�B 5)����:");
				int c = scanner.nextInt();
				if(c == 1) {
					if(s1 == p1) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 2;
					}
					else {
						s2 = p1;
						temp ++;
					}
				}
				else if(c == 2) {
					if(s1 == p2) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 2;
					}
					else {
						s2 = p2;
						temp ++;
					}
				}
				else if(c == 3) {
					if(s1 == p3) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 2;
					}
					else {
						s2 = p3;
						temp ++;
					}
				}
				else if(c == 4) 
					temp = 1;
				else if(c == 5) {
					System.out.println("�����ʲ��I");
					break;
				}
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 2;
				}
			}
			else if(temp == 3) {
				System.out.println("��ܱi�ơG1) 1 �i 2) 2 �i 2) 3 �i 4)�^�W�@�B 5)����:");
				int d = scanner.nextInt();
				if(d >= 1 && d <=3) {
					if((s1 == p1 || s1 == p2) && (s2 == p1 || s2 == p2)) {
						x = 536 * d;
						System.out.println("�f�� " + s1 + "��" + s2 + "�C���A�y��@" + d + " �i�A���� " + x + "���C");
						temp++;
					}
					else if((s1 == p1 || s1 == p3)&&(s2 == p1 || s2 == p3)) {
						x = 927 * d;
						System.out.println("�f�� " + s1 + "��" + s2 + "�C���A�y��@" + d + " �i�A���� " + x + "���C");
						temp ++;
					}
					else {
						x = 391 * d;
						System.out.println("�f�� " + s1 + "��" + s2 + "�C���A�y��@" + d + " �i�A���� " + x + "���C");
						temp ++;
					}
				}
				else if(d == 4) {
					temp = 2;
				}
				else if(d == 5) {
					System.out.println("�����ʲ��I");
					break;
				}
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 3;
				}
			}
			else if(temp == 4) {
				if(money <= x) {
					System.out.println("�Ч�J�{���G 1) 50�� 2) 100�� 3) 500��4) 1000�� 5)����:");
					int e = scanner.nextInt();
					if(e == 1) {
						money += 50;
						temp = 4;
					}
					else if(e == 2){
						money += 100;
						temp = 4;
					}
					else if(e == 3){
						money += 500;
						temp = 4;
					}
					else if(e == 4) {
						money += 1000;
						temp = 4;
					}
					else if(e == 5) {
						System.out.println("�h�z" + money + "��");
						temp = 0;
					}
					else {
						System.out.println("��J���~�A�Э��s���");
					}
				}
				else if(money > x && x > 0){
					System.out.println("���z"+ money + "��");
					System.out.printf("��z %d ��\n",money -x);
					System.out.println("�ʲ�(1=yes/2=no)?");
					break;
				}
				else
					break;
			}
			else
				break;
		}
	}
}
