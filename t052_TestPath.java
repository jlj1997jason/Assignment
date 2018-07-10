import java.util.Scanner;

public class TestPath {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0;
		Path pp = new Path();
		int temp = 1, count = 0;
		while(true) {
			if(temp == 1) {
				System.out.print("Options: 1) Append, 2)Output, -1)Quit:");
				int option = scanner.nextInt();
				if(option == 1) {
					temp = 2;
				}
				if(option == 2) {
					temp = 3;
				}
				if(option == -1) {
					System.out.println("Program quits.");
					break;
				}
			}
			else if(temp == 2) {
				x = scanner.nextInt();
				y = scanner.nextInt();
				pp.append(x,y);
				count ++;
				temp = 1;
			}
			else if(temp == 3) {
				for(int i = 0;i<count;i++)
					System.out.print("("+ pp.getPoint(i)[0] +","+ pp.getPoint(i)[1] +")");
				System.out.println("\nCount of edges:"+pp.getEdge());
				System.out.printf("Euclidean length:%.2f\n",pp.length());
				if(pp.isSimple() == true)
					System.out.println("This is a simple path!");
				else
					System.out.println("This is not a simple path!");
				temp = 1;
			}
		}


	}

}
class Path{

	private int[] a = new int[2];
	private int i = 0, k = 0, j, x, y;
	private int[][] b = new int[99999][2]; 
	private double total, temp;
	public Path() {}
	public void append(int x, int y) {
		b[i][0] = x;
		b[i][1] = y;

		i++;
	}
	public int[] getPoint(int inx) {
		j = inx;
		a[0] = b[j][0];
		a[1] = b[j][1];
		return a;
	}
	public int getEdge(){

		return i-1 ;
	}
	public boolean isSimple(){
		for(int num1 = 0 ; num1 < i; num1++) {
			for(int num = num1+1 ; num < i ; num++) {
				if(b[num1][0] == b[num][0] && b[num1][1] == b[num][1]) {
					return false;
				}
			}
		}
		return true;
	}
	public double length(){
		for(int k = 0; k < this.getEdge();k++) {
			temp = Math.sqrt(Math.pow(this.getPoint(k)[0]-this.getPoint(k+1)[0],2)+Math.pow(this.getPoint(k)[1]-this.getPoint(k+1)[1],2));
			total +=temp;
		}

		return total;
	}
}