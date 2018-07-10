import java.lang.Math;

public class sixA {

	public enum Status{
		CONTINUE,
		WON,
		LOST
	}

	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;

		int sum = rollDice();

		switch(sum) {
		case 7:
		case 11:
			gameStatus = Status.WON;
			break;

		case 2:
		case 3:
		case 12:
			gameStatus = Status.LOST;
			break;

		default:
			gameStatus = Status.CONTINUE;
			myPoint = sum;
			System.out.println("Point is " + sum);
			break;
		}
		while(gameStatus == Status.CONTINUE) {
			sum = rollDice();

			if(sum == myPoint) {
				gameStatus = Status.WON;
			}
			else if (sum == 7) {
				gameStatus = Status.LOST;
			}
			if(gameStatus == Status.WON) {
				System.out.println("Player wins!");
			}
			else {
				System.out.println("Player loses!");
			}
		}
	}
	private static int rollDice() {
		int dice1 = (int)(Math.random()*6+1.0);
		int dice2 = (int)(Math.random()*6+1.0);
		int workSum = dice1 + dice2;
		System.out.println("Player rolled " + dice1 + " + " + dice2 + " = " + workSum);
		
		return workSum;
	}

}
