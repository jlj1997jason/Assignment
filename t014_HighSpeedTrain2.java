import java.util.Scanner;

public class ���K {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		String p1 = "�x�_",p2 = "�x��",p3 = "����";
		String s1 = "", s2 = "";
		int temp = 0, money = 0, x = 0, f1 = 0, f2 = 0, f3 = 0;

		while(true) {
			if(temp == 0 ) {
				System.out.println("10���w���ӼơG");
				f1 = scanner.nextInt();
				System.out.println("5���w���ӼơG");
				f2 = scanner.nextInt();
				System.out.println("1���w���ӼơG");
				f3 = scanner.nextInt();
				if(f3 < 0 || f2 <0 || f1 < 0) {
					System.out.println("��J���~�A�Э��s��J");
					temp = 0;
				}
				else
					temp ++;

			}
			else if(temp == 1) {
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
					temp = 1;
				}
			}
			else if(temp == 2) {
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
					temp = 2;
				}
			}
			else if(temp == 3) {
				System.out.println("��ܰW���G1)" + p1 + " 2) " + p2 + " 3)" + p3 + " 4)�^�W�@�B 5)����:");
				int c = scanner.nextInt();
				if(c == 1) {
					if(s1 == p1) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 3;
					}
					else {
						s2 = p1;
						temp ++;
					}
				}
				else if(c == 2) {
					if(s1 == p2) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 3;
					}
					else {
						s2 = p2;
						temp ++;
					}
				}
				else if(c == 3) {
					if(s1 == p3) {
						System.out.println("�_���P�W���ۦP�A�Э��s���");
						temp = 3;
					}
					else {
						s2 = p3;
						temp ++;
					}
				}
				else if(c == 4) 
					temp = 2;
				else if(c == 5) {
					System.out.println("�����ʲ��I");
					break;
				}
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 3;
				}
			}
			else if(temp == 4) {
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
					temp = 3;
				}
				else if(d == 5) {
					System.out.println("�����ʲ��I");
					break;
				}
				else {
					System.out.println("��J���~�A�Э��s���");
					temp = 4;
				}
			}
			else if(temp == 5) {
				if(money <= x) {
					System.out.println("�Ч�J�{���G 1) 50�� 2) 100�� 3) 500��4) 1000�� 5)����:");
					int e = scanner.nextInt();
					if(e == 1) {
						money += 50;
						temp = 5;
					}
					else if(e == 2){
						money += 100;
						temp = 5;
					}
					else if(e == 3){
						money += 500;
						temp = 5;
					}
					else if(e == 4) {
						money += 1000;
						temp = 5;
					}
					else if(e == 5) {
						System.out.println("�h�z" + money + "��");
						temp = 1;
					}
					else {
						System.out.println("��J���~�A�Э��s���");
					}
				}
				else if(money > x && x > 0){
					System.out.println("���z"+ money + "��");
					System.out.printf("��z %d ��\n", money -x);

					temp ++;
				}
				else
					break;
			}
			else if(temp == 6) {
				int n1 = 0, n2 = 0, n3 = 0;
				int z1=0,z2=0,z3=0;
				while(true) {
					if(n1*10 + n2 *5 + n3*1<= (money-x)) {
						for(n1 = 0;(money -x)>=n1*10 && n1 <= f1;n1++) {
							z1 = n1;
							for(n2 = 0;(money -x)>=n2*5+n1*10 && n2 <= f2;n2++) {
								z2 = n2;
								for(n3 = 0;(money -x)>=n1*10 + n2*5 + n3*1 && n3 <= f3;n3++) {
									z3 = n3;
								}
							}
						}
						
					}
					else if(z1*10 + z2 *5 + z3*1 == (money-x)) {
						System.out.printf("�h�^10���w�� %d �ӡA5���w�� %d �ӡA1���w�� %d �� \n", z1, z2, z3);
						break;
					}
					else {
						System.out.println("�{�������A�L�k��s�A�Ы��d�O�H��");
						break;
					}
				}
				
				System.out.println("�ʲ�(1=yes/2=no)?");
				break;
			}
			else
				break;
		}
	}
}
