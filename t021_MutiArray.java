package qwer;

import java.util.Arrays;
import java.util.Scanner;

public class �E�E���k�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp = 0,count = -1, x = 0, y = 0,input = 0, j, k, countnum = 0;
		double xsqu, ysqu,distance = 0,d;
		int[][] grade= new int[100][2];
		double[][] min = new double[100][2];
		while(true) {
			if(temp == 0) {
				System.out.println("Option: 1) Insert. 2) Output. -1) Quit?");
				input = scanner.nextInt();
				if(input == 1) {
					temp = 1;
				}
				else if(input == 2) {
					if(countnum == 0) {
						System.out.println("�z�|����J��ƽЭ��s���");
						temp = 0;
					}
					else
						temp = 2;
				}
				else if(input == -1) {
					System.out.println("�����{��!");
					break;
				}
				else {
					System.out.println("��J���~�Э��s��J");
					temp = 0;
				}
			}
			else if(temp == 1) {
				System.out.println("�п�J�y��:");
				x = scanner.nextInt();
				y = scanner.nextInt();
				
				
				if (count < grade.length) {
					count++;
					grade[count][0] = x;
					grade[count][1] = y;
				}
				
				countnum = 1;
				temp = 0;
			}
			else if(temp == 2) {

				if(count == 0)
					System.out.printf("�ȿ�J�@�Ӯy��(%5d , %5d)�L�k�p��Z��\n", grade[0][0], grade[0][1]);
				else
				{
					for(j = 0; j <= count; j++)
					{
						min[j][0] = 999999999;
					}
					for(j = 0; j <= count; j++)
					{
						for(k = j; k <= count; k++)
						{
							d = Math.sqrt(Math.pow((grade[j][0]-grade[k][0]), 2) + Math.pow((grade[j][1]-grade[k][1]), 2));
							if(d < min[j][0] && j != k)
							{
								min[j][0] = d;
								min[j][1] = k;
							}
							if(d < min[k][0] && j != k)
							{
								min[k][0] = d;
								min[k][1] = j;
							}
						}

					}
					for(j = 0; j <= count; j++)
						System.out.printf("(%5d , %5d)\t-> (%5d , %5d)\t�Z�� : %.2f\n",  grade[j][0], grade[j][1], grade[(int)min[j][1]][0], grade[(int)min[j][1]][1], min[j][0]);
				}
				System.out.println();
				temp =0;
			}
		}
	}
}