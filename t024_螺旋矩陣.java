import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str[] = scn.nextLine().split(",");
		int n = Integer.parseInt(str[0]), index = Integer.parseInt(str[1]), count = 1, arr[][] = new int[n][n];
		if (index == 1) {//順時鐘
			for (int i = 0; i < n / 2; i++) {
				for (int j = i; j < n - i - 1; j++)
					arr[i][j] = count++;
				for (int j = i; j < n - i - 1; j++)
					arr[j][n - i - 1] = count++;
				for (int j = n - i - 1; j > i; j--)
					arr[n - i - 1][j] = count++;
				for (int j = n - i - 1; j > i; j--)
					arr[j][i] = count++;
			}
		} else {//逆時鐘
			for (int i = 0; i < n / 2; i++) {
				for (int j = i; j < n - i - 1; j++)
					arr[j][i] = count++;
				for (int j = i; j < n - i - 1; j++)
					arr[n - 1 - i][j] = count++;
				for (int j = n - i - 1; j > i; j--)
					arr[j][n - i - 1] = count++;
				for (int j = n - i - 1; j > i; j--)
					arr[i][j] = count++;
			}
		}
		if (n % 2 != 0)//遇到基數層要補上中心數
			arr[n / 2][n / 2] = count;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%03d", arr[i][j]);
				if (j != n - 1)
					System.out.print(",");
			}
			System.out.println();
		}

	}
}
