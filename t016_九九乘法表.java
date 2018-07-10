package qwer;

import java.util.Scanner;

public class 九九乘法表 {

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
		
		System.out.println("請輸入被乘數與乘數");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + "*" + b + "=" + m[a-1][b-1]);

	}

}
