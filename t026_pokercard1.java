import java.lang.*;
public class pokercard1 {

	public static void main(String[] args) {
		String[][] card = new String[52][2];
		for(int i = 0,j = 1;i < 13;i++, j++) {		
			card[i][0] = ""+ j ;
			card[i][1] = "	黑桃 ";
			System.out.println(card[i][0]+card[i][1]);
		}
		for(int i = 13,j = 1;i < 26; i++, j ++) {
			card[i][0] = ""+j;
			card[i][1] = "	梅花 ";
			System.out.println(card[i][0]+card[i][1]);
		}
		for(int i = 26, j = 1; i < 39; i++, j++) {	
			card[i][0] = "" + j ;
			card[i][1] = "	紅心 ";
			System.out.println(card[i][0]+card[i][1]);
		}
		for(int i = 39, j = 1;i < 52;i++, j++) {
			card[i][0] = "" + j;
			card[i][1] = "	方塊 ";
			System.out.println(card[i][0]+card[i][1]);
		}
		System.out.println("開始洗牌!");
		shuffle(card);
		System.out.println("洗牌結果!");
		for(int k = 0;k<52;k++) {
			System.out.println(card[k][0]+card[k][1]);
		}
		System.out.println("抽排結果");
		for(int x = 0;x<5;x++) {
			System.out.println(card[x][0]+card[x][1]);
		}
	}
	public static String[][] shuffle(String[][] card) {
		for(int i = 0;i < 52;i++) {
			int j = (int)(Math.random() * 52);
			String temp0 = card[j][0];
			String temp1 = card[j][1];
			card[j][0] = card[i][0];
			card[j][1] = card[i][1];
			card[i][0] = temp0;
			card[i][1] = temp1;
		}
		
		return card;
	}
}
