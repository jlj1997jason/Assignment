import java.util.Scanner;
import java.lang.*;

public class c {

	public static void main(String[] args) {
		int workArr[] = {33,41,52,54,63,74,79,86};
		int findNum,location;
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入您要找的數值:");
		findNum = scanner.nextInt();
		location = binarySearch(workArr, workArr.length, findNum);
		if(location == -1) 
			System.out.println("在陣列中找不到要找的數值");
		else
			System.out.println("位於索引" + location);
	}
	public static int binarySearch(int[] x, int count, int k)
	{
		int left = 0, right, middle;
		right = count-1;

		while(left <= right)
		{
			middle = (left+right)/2;
			if(k==x[middle])
				return middle;
			if(k > x[middle])
				left = middle + 1;
			else
				right = middle -1;
		}
		return 0;
	}

}
