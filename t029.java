import java.util.Scanner;

public class c {

	public static void main(String[] args) {

		int x[] = {25,10,39,40,33,12};     
		//�L�X�}�C���G
		System.out.println("�Ƨǫe�G");
		for (int i = 0; i < x.length; i++) 
			System.out.print(x[i] + " ");
		System.out.print("\n");
		int n = x.length;      					 //�Ȧs�}�C����
		
		bubbleSort(x, n);
	}
	public static void bubbleSort(int[] x, int count){
		int n = x.length;
		
		for (int pass = 1; pass < n; pass++)     //��w�ƧǪk 
		{
			for(int i = 0; i < n - pass; i++)
			{
				if (x[i] > x[i+1]) {			//�᭱������j
					int temp = x[i];        	//�洫
					x[i] = x[i+1]; 
					x[i+1] = temp;
				}
			}
		}

		System.out.println("�Ƨǫ�G");
		for (int i = 0; i < x.length; i++) 
			System.out.print(x[i] + " ");
		System.out.print("\n");
	}


}
