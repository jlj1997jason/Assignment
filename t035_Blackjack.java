import java.util.Scanner;

public class Blackjack
{
	public static void main(String[] args)
	{
		int chips,temp = 1, option, playerCardIndex = 0, computerCardIndex, bet = 0;
		String[][] cards = newDeck();
		boolean playAgain = true;
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("Blackjack�}�l:");
			System.out.print("�z���w�X:");
			chips = scanner.nextInt();
			if(chips <= 0) {
				System.out.println("Error input!");
				continue;
			}
			do
			{
				if(temp == 1) 
				{
					System.out.print("\n��`:");
					bet = scanner.nextInt();
					if(bet <= 0 || bet > chips) 
					{
						System.out.println("Error input!");
						continue;
					}
					playerCardIndex = 0;
					shuffle(cards);
					System.out.println("�~�P�����A�}�l�o�P...");
					System.out.println("���a�o2�i�P\n���a�o2�i�P�G");
					temp = 2;
				}
				else if(temp == 2) {
					int k = 0;
					do
					{
						if(k == 0)
							playerCardIndex++;
						for(int i = 0 ; i <= playerCardIndex ; i++)
							System.out.println(cards[i][1] + " " + cards[i][0]);
						System.out.printf("Points: %d\n", calculatePoints(cards, 0, playerCardIndex));
						if(calculatePoints(cards, 0, playerCardIndex) > 21)
						{
							System.out.println("�z�P(busted)");
							temp = 3;
							break;
						}
						else if(calculatePoints(cards, 0, playerCardIndex) == 21)
							break;
						else {
							System.out.print("1) Hit. 2) Stay?");
							option = scanner.nextInt();
							if(option != 1 && option != 2) {
								System.out.println("Error input!");
								option = 1;
								k = 1;
								temp = 2;
								continue;
							}
							if(option == 1)
								k = 0;
						}
					}while(option == 1);
					computerCardIndex = playerCardIndex + 2;
					if(calculatePoints(cards, 0, playerCardIndex) > 21)
					{
						System.out.println("���a��ӡI");
						chips -= bet;
						System.out.printf("�z�l����%d�T�w�X�A�z���w�X�� %d �T�C\n", bet, chips);
						temp = 3;
					}
					else if(calculatePoints(cards, 0, playerCardIndex) == 21)
					{
						System.out.println("���a��ӡI");
						chips += bet;
						System.out.printf("�z��o��%d�T�w�X�A�z���w�X�� %d �T�C\n", bet, chips);
						temp = 3;
					}
					else
					{
						System.out.println("���a���P�աG");
						while(calculatePoints(cards, playerCardIndex + 1, computerCardIndex) < 17)
						{
							computerCardIndex++;
						}
						for(int i = playerCardIndex + 1 ; i <= computerCardIndex ; i++)
							System.out.println(cards[i][1] + " " + cards[i][0]);
						System.out.printf("Points: %d\n", calculatePoints(cards, playerCardIndex + 1, computerCardIndex));
						if(calculatePoints(cards, playerCardIndex + 1, computerCardIndex) > 21)
						{
							System.out.println("���a��ӡI");
							chips += bet;
							System.out.printf("�z��o��%d�T�w�X�A�z���w�X�� %d �T�C\n", bet, chips);
							temp = 3;
						}
						else
						{
							if(calculatePoints(cards, 0, playerCardIndex) > calculatePoints(cards, playerCardIndex + 1, computerCardIndex))
							{
								System.out.println("���a��ӡI");
								chips += bet;
								System.out.printf("�z��o��%d�T�w�X�A�z���w�X�� %d �T�C\n", bet, chips);
								temp = 3;
							}
							else if(calculatePoints(cards, 0, playerCardIndex) == calculatePoints(cards, playerCardIndex + 1, computerCardIndex))
							{
								System.out.println("����(tie)");
								temp = 3;
							}
							else
							{
								System.out.println("���a��ӡI");
								chips -= bet;
								System.out.printf("�z�l����%d�T�w�X�A�z���w�X�� %d �T�C\n", bet, chips);
								temp = 3;
							}
						}
					}
				}
				else if(temp == 3) {
					if(chips <= 0) 
					{
						break;
					}
					System.out.println("�O�_�A���@���]1:�O/2:�_�^�H");
					int playoption = scanner.nextInt();
					if(playoption == 2)
						playAgain = false;
					else if(playoption != 1 && playoption != 2)
					{
						System.out.println("Error input!");
						temp = 3;
					}
					else
						temp = 1;
				}
			}while(playAgain);
			System.out.println("�P�±z���C���A�A���I");
			break;
		}
	}
	public static String[][] newDeck()
	{
		String[][] card = new String[52][2];

		for(int i = 0 ; i < 52 ; i++)
		{		
			card[i][0] = "" + (i % 13 + 1);
			switch(card[i][0])
			{
			case "1":
				card[i][0] = "A";
			case "11":
				card[i][0] = "J";
			case "12":
				card[i][0] = "Q";
			case "13":
				card[i][0] = "K";
			default:
				break;
			}
			if(i < 13)
				card[i][1] = "�®�";
			else if(i < 26)
				card[i][1] = "����";
			else if(i < 39)
				card[i][1] = "����";
			else if(i < 52)
				card[i][1] = "���";
		}

		return card;
	}
	public static void shuffle(String[][] card)
	{
		for(int i = 0 ; i < 52 ; i++)
		{
			int j = (int)(Math.random() * 52);
			String temp0 = card[j][0];
			String temp1 = card[j][1];
			card[j][0] = card[i][0];
			card[j][1] = card[i][1];
			card[i][0] = temp0;
			card[i][1] = temp1;
		}
	}
	public static int calculatePoints(String[][] card, int startIndex, int endIndex)
	{
		int total = 0;
		for(int i = startIndex ; i <= endIndex ; i++)
		{
			try
			{
				total += Integer.parseInt(card[i][0]);
			}
			catch(NumberFormatException e)
			{
				if(card[i][0].equals("A"))
				{
					if((total + 11) > 21)
						total += 1;
					else
						total += 11;
				}
				else
					total += 10;
			}
		}
		return total;
	}
}