
public class 請上傳你的實作練習氣泡排序法 {

	public static void main(String[] args) {

		int x[] = {25,10,39,40,33,12};     
		//印出陣列結果
		System.out.println("排序前：");
		for (int i = 0; i < x.length; i++) 
			System.out.print(x[i] + " ");
		System.out.print("\n");
		int n = x.length;       				 //暫存陣列長度
		for (int pass = 1; pass < n; pass++)     //氣泡排序法 
		{
			for(int i = 0; i < n - pass; i++)
			{
				if (x[i] > x[i+1]) {			//後面的比較大
					int temp = x[i];        	//交換
					x[i] = x[i+1]; 
					x[i+1] = temp;
				}
			}
		}
		System.out.println("排序後：");
		for (int i = 0; i < x.length; i++) 
			System.out.print(x[i] + " ");
		System.out.print("\n");



	}

}
