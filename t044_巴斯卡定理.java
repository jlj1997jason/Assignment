import java.util.Scanner;

public class qwe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jm,n:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println( C(a,b));
		
	}
	static int  C(int n, int x)
	{
	       if (x <= 0)    return 1;
	       return (C(n - 1, x - 1) * n) / x;
	}

}
