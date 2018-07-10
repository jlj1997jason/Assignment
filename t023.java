import java.util.Arrays;
import java.util.Scanner;
public class DataInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] freq = new int[2];
		int temp = 1, i = 1;
		while(true) {
			if(temp == 1) {
				System.out.print("Input (-1 to end):");
				int input = scanner.nextInt();
				
				if(input >= freq.length-1) {
					System.out.printf("freq[%d]±N¶W¥X°}¦C½d³ò\n",input);
					for(int j = 0;freq.length<=input;j++) {
						int k = freq.length;
						k *= 2;
						freq = Arrays.copyOf(freq, k);
						System.out.println("Array is resized!");
					}
				}
				if(input > 0 && input < freq.length) {
					freq[input]++;

				}
				else if(input == -1) {
					temp = 2;
				}
				else
					System.out.println("Error!");


			}
			else if(temp == 2) {
				int n = freq.length;
				for(i = 1;i<n;i++) {
					int count = freq[i];
					if(count > 0) {
						System.out.print(i+"\t");
					}
					for(int j = 0;j < count;j++) {
						System.out.print("*");
					}
					if(count > 0) {
						System.out.println();
					}

				}
				break;
			}
		}
	}
}
