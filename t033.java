import java.util.Scanner;
import java.lang.*;

public class c {

	public static void main(String[] args) {
		int workArr[] = {33,41,52,54,63,74,79,86};
		int findNum,location;
		Scanner scanner = new Scanner(System.in);

		System.out.print("�п�J�z�n�䪺�ƭ�:");
		findNum = scanner.nextInt();
		location = binarySearch(workArr, workArr.length, findNum);
		if(location == -1) 
			System.out.println("�b�}�C���䤣��n�䪺�ƭ�");
		else
			System.out.println("������" + location);
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
