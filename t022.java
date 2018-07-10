import java.util.Scanner;
import java.util.Arrays; 
public class five_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int grade[] = new int [2];
		int input = 0, count = 0;
		do {
			System.out.println("請輸入成績:(-1:QUIT");
			input = scanner.nextInt();
			if(input == -1)
				break ;
			if(input < 0 || input > 100) {
				System.out.println("輸入錯誤");
				continue ;
			}
			else {
				if (count >= grade.length){//Resize array
					grade = Arrays.copyOf(grade, grade.length * 2);
				}
				if (count < grade.length)
					grade[count++] = input;
			}
		}while(input != -1);

		for (int i=0; i<count; i++)
			System.out.printf("%d\n", grade[i]);

	}
}