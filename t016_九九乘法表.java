package qwer;

import java.util.Scanner;

public class �E�E���k�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] m = new int[9][9];
		int i,j;
		for(i = 1;i <= 9;i++) {
			for(j = 1; j <= 9 ; j++ ) {
				m[i-1][j-1]=i * j;
			}
		}
		for(i = 1;i<=9;i++) {
			for(j = 1; j <= 9;j++) {
				System.out.print(i + "*" + j + "=" + m[i-1][j-1]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("�п�J�Q���ƻP����");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + "*" + b + "=" + m[a-1][b-1]);

	}

}
