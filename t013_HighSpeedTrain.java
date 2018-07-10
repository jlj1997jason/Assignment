import java.util.Scanner;

public class 高鐵2 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		String p1 = "台北",p2 = "台中",p3 = "高雄";
		String s1 = "", s2 = "";
		int temp = 0, money = 0, x = 0;

		while(true) {
			if(temp == 0) {
				System.out.println("購票 1)是 2)否?");
				int a = scanner.nextInt();

				if(a == 2) {
					System.out.println("取消購票！");
					break;
				}
				else if(a == 1) 
					temp ++;
				else {
					System.out.println("輸入錯誤，請重新選擇");
					temp = 0;
				}
			}
			else if(temp == 1) {
				System.out.println("開始購票！");
				System.out.println("選擇起站：1)" + p1 + " 2) " + p2 + "  3)" + p3 +" 4)取消:");
				int b = scanner.nextInt();
				if(b == 1) {
					s1 = p1;
					temp ++;
				}
				else if(b == 2) {
					s1 = p2;
					temp ++;
				}
				else if(b == 3) {
					s1 = p3;
					temp ++;
				}
				else if(b == 4) {
					System.out.println("取消購票！");
					break;
				}
				else {
					System.out.println("輸入錯誤，請重新選擇");
					temp = 1;
				}
			}
			else if(temp == 2) {
				System.out.println("選擇訖站：1)" + p1 + " 2) " + p2 + " 3)" + p3 + " 4)回上一步 5)取消:");
				int c = scanner.nextInt();
				if(c == 1) {
					if(s1 == p1) {
						System.out.println("起站與訖站相同，請重新選擇");
						temp = 2;
					}
					else {
						s2 = p1;
						temp ++;
					}
				}
				else if(c == 2) {
					if(s1 == p2) {
						System.out.println("起站與訖站相同，請重新選擇");
						temp = 2;
					}
					else {
						s2 = p2;
						temp ++;
					}
				}
				else if(c == 3) {
					if(s1 == p3) {
						System.out.println("起站與訖站相同，請重新選擇");
						temp = 2;
					}
					else {
						s2 = p3;
						temp ++;
					}
				}
				else if(c == 4) 
					temp = 1;
				else if(c == 5) {
					System.out.println("取消購票！");
					break;
				}
				else {
					System.out.println("輸入錯誤，請重新選擇");
					temp = 2;
				}
			}
			else if(temp == 3) {
				System.out.println("選擇張數：1) 1 張 2) 2 張 2) 3 張 4)回上一步 5)取消:");
				int d = scanner.nextInt();
				if(d >= 1 && d <=3) {
					if((s1 == p1 || s1 == p2) && (s2 == p1 || s2 == p2)) {
						x = 536 * d;
						System.out.println("搭乘 " + s1 + "到" + s2 + "列車，座位共" + d + " 張，票價 " + x + "元。");
						temp++;
					}
					else if((s1 == p1 || s1 == p3)&&(s2 == p1 || s2 == p3)) {
						x = 927 * d;
						System.out.println("搭乘 " + s1 + "到" + s2 + "列車，座位共" + d + " 張，票價 " + x + "元。");
						temp ++;
					}
					else {
						x = 391 * d;
						System.out.println("搭乘 " + s1 + "到" + s2 + "列車，座位共" + d + " 張，票價 " + x + "元。");
						temp ++;
					}
				}
				else if(d == 4) {
					temp = 2;
				}
				else if(d == 5) {
					System.out.println("取消購票！");
					break;
				}
				else {
					System.out.println("輸入錯誤，請重新選擇");
					temp = 3;
				}
			}
			else if(temp == 4) {
				if(money <= x) {
					System.out.println("請投入現金： 1) 50元 2) 100元 3) 500元4) 1000元 5)取消:");
					int e = scanner.nextInt();
					if(e == 1) {
						money += 50;
						temp = 4;
					}
					else if(e == 2){
						money += 100;
						temp = 4;
					}
					else if(e == 3){
						money += 500;
						temp = 4;
					}
					else if(e == 4) {
						money += 1000;
						temp = 4;
					}
					else if(e == 5) {
						System.out.println("退您" + money + "元");
						temp = 0;
					}
					else {
						System.out.println("輸入錯誤，請重新選擇");
					}
				}
				else if(money > x && x > 0){
					System.out.println("收您"+ money + "元");
					System.out.printf("找您 %d 元\n",money -x);
					System.out.println("購票(1=yes/2=no)?");
					break;
				}
				else
					break;
			}
			else
				break;
		}
	}
}
