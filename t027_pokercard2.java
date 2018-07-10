import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class pokercard1 {

	public static void main(String[] args) {
		String[][] card = new String[52][2];
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
		System.out.println("Start Shuffling!");
		shuffle(card);
		System.out.println("Shuffle Result:");
		for(int k = 0;k<52;k++) {
			System.out.println(card[k][0]+"\t"+card[k][1]);
		}
		System.out.println("Draw 5 cards:");
		for(int x = 0;x<5;x++) {
			System.out.println(card[x][0]+"\t"+card[x][1]);
		}
		switch(type(card[0], card[1], card[2], card[3], card[4]))
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