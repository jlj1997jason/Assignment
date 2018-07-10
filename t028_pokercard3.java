import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class pokercard1 {
	static int x = 0, y = 0;

	public static void main(String[] args) {
		int temp = 1, count = 0;
		String[][] card = new String[52][2];
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			
			if(temp == 1) 
			{
				for(int i = 0,j = 1;i < 13;i++, j++) {		
					card[i][0] = ""+ j ;
					card[i][1] = "Spades";
					System.out.println(card[i][0]+"\t"+card[i][1]);
				}
				for(int i = 13,j = 1;i < 26; i++, j ++) {
					card[i][0] = ""+j;
					card[i][1] = "Clubs";
					System.out.println(card[i][0]+"\t"+card[i][1]);
				}
				for(int i = 26, j = 1; i < 39; i++, j++) {	
					card[i][0] = "" + j ;
					card[i][1] = "Hearts";
					System.out.println(card[i][0]+"\t"+card[i][1]);
				}
				for(int i = 39, j = 1;i < 52;i++, j++) {
					card[i][0] = "" + j;
					card[i][1] = "Diamonds";
					System.out.println(card[i][0]+"\t"+card[i][1]);
				}
				temp = 2;
			}
			else if(temp == 2) {
				y = 0;
				System.out.println("Start Shuffling!");
				shuffle(card);
				System.out.println("Shuffle Result:");
				for(int k = 0;k<52;k++) {
					System.out.println(card[k][0]+"\t"+card[k][1]);
				}
				temp = 3;
			}
			else if(temp == 3) {
				System.out.println("Draw 5 cards:");
				count = 0;
				for(x = y;x<52;x++) {
					if(count<5) {
						System.out.println(card[x][0]+"\t"+card[x][1]);
						count++;
					}
					else {
						y = x-1;
						break;
					}
				}
				temp = 4;
			}
			else if(temp == 4) {
				switch(type(card[y-4], card[y-3], card[y-2], card[y-1], card[y]))
				{
				case 1:
					System.out.println("Nothing");
					break;
				case 2:
					System.out.println("1 pair");
					break;
				case 3:
					System.out.println("2 pairs");
					break;
				case 4:
					System.out.println("Three of a kind");
					break;
				case 5:
					System.out.println("Straight");
					break;
				case 6:
					System.out.println("Flush");
					break;
				case 7:
					System.out.println("Full house");
					break;
				case 8:
					System.out.println("Four of a Kind");
					break;
				case 9:
					System.out.println("Straight Flush");
					break;
				case 10:
					System.out.println("Big Straight Flush");
					break;
				}
				System.out.println("1.)continuing drawing 2.)Shuffling 3.)End");
				int option = scanner.nextInt();
				if(option == 1) {
					temp = 3;
				}
				else if(option == 2) {
					temp = 2;
				}
				else if(option == 3) {
					System.out.println("End Program!");
					break;
				}
				else if(option != 1 && option != 2 && option != 3 && option != 4) {
					temp = 4;
				}
			}
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
	public static int type(String[] ... cards)
	/* 牌形：回傳值  觀察規律
	 * 散牌：1
	 * 一對：2    2 same
	 * 三條：4    3 same
	 * 四條：8    4 same
	 * 同花：6    5 same type
	 * 兩對：3    2 same 2 same
	 * 葫蘆：7    3 same 2 same
	 * 順子：5    5 continuous different type
	 * 同花順：9   5 continuous same type
	 * 同花大順：10  5 continuous same type *special
	 */
	{
		orderByNumber(cards);

		if(checkContinuous(cards) == 5)
		{
			if(checkSameType(cards) == 5)
			{
				if(cards[0][0].equals("1") && cards[4][0].equals("13"))
					return 10;
				else
					return 9;
			}
			else
				return 5;
		}
		else if(checkSameNumber(cards) == 2)
		{
			if(howManyDifferentNumbers(cards) == 2)
				return 7;
			else
				return 3;
		}
		else if(checkSameNumber(cards) == 1)
		{
			if(howManyDifferentNumbers(cards) == 4)
				return 2;
			else if(howManyDifferentNumbers(cards) == 3)
				return 4;
			else
				return 8;
		}
		else if(checkSameType(cards) == 1)
		{
			if(cards[0][1].equals(cards[1][1]) && cards[1][1].equals(cards[2][1]) && cards[2][1].equals(cards[3][1]) && cards[3][1].equals(cards[4][1]))
				return 6;
		}
		return 1;
	}
	public static void orderByNumber(String[] ... cards)
	{
		for(int i = 0 ; i < cards.length - 1 ; i++)
		{
			int smallest = i;
			for(int j = i + 1 ; j < cards.length ; j++)
			{
				if(Integer.parseInt(cards[smallest][0]) > Integer.parseInt(cards[j][0]))
				{
					smallest = j;
				}
			}
			String temp0 = cards[i][0];
			String temp1 = cards[i][1];
			cards[i][0] = cards[smallest][0];
			cards[i][1] = cards[smallest][1];
			cards[smallest][0] = temp0;
			cards[smallest][1] = temp1;
		}
	}
	public static int checkSameNumber(String[] ... cards)
	{
		int sameNumber = 0;
		int[] accumulate = new int[14];
		for(String[] str : cards)
			accumulate[Integer.parseInt(str[0])]++;
		for(int number : accumulate)
			if(number > 1)
				sameNumber++;
		return sameNumber;
	}
	public static int checkSameType(String[] ... cards)
	{
		int sameType = 0;
		int[] accumulate = new int[4];
		for(String[] str : cards)
		{
			if(str[1].equals("Spades"))
				accumulate[0]++;
			else if(str[1].equals("Clubs"))
				accumulate[1]++;
			else if(str[1].equals("Hearts"))
				accumulate[2]++;
			else if(str[1].equals("Diamonds"))
				accumulate[3]++;
		}
		for(int number : accumulate)
			if(number > 1)
				sameType++;
		return sameType;
	}
	public static int checkContinuous(String[] ... cards)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		boolean continuing = false;
		for(int i = 0 ; i < cards.length - 1 ; i++)
		{
			if((Integer.parseInt(cards[i][0]) + 1) == Integer.parseInt(cards[i + 1][0]))
			{
				if(continuing == true)
					arrayList.set(arrayList.size() - 1, arrayList.get(arrayList.size() - 1) + 1);
				else
				{
					continuing = true;
					arrayList.add(1);
				}
			}
			else
				continuing = false;
		}
		return Collections.max(arrayList);
	}
	public static int howManyDifferentNumbers(String[] ... cards)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(String[] str : cards)
			set.add(Integer.parseInt(str[0]));
		return set.size();
	}
}