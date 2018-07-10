import java.util.Scanner;

public class DataInput
{
	static int availableBalance;
	static int ATMcash;
	static double loadingRate;
	static double interestRate;
	static int temp = 1;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Available Balance:");
		availableBalance = scanner.nextInt();
		System.out.print("Cash in ATM:");
		ATMcash = scanner.nextInt();
		System.out.print("Loading Rate (%):");
		loadingRate = scanner.nextDouble();
		System.out.print("Interest Rate (%):");
		interestRate = scanner.nextDouble();

		System.out.println("-----------------------------------------");
		System.out.println("Welcome. Please enter your option.");
		while (true)
		{
			if(temp == 1) {
				System.out.print("1) Withdrawals. 2) Deposit. 3) Quit: ");
				int seletion = scanner.nextInt();
				if(seletion==1) {
					System.out.print("Amount of withdrawal:");
					int moneyWithdrawls = scanner.nextInt();
					if(checkBeforeWithdrawals(moneyWithdrawls)) {
						System.out.print("Withdrawls " + moneyWithdrawls + " dollars from your account. Sure 1) yes 2)no?");
						int YesNo = scanner.nextInt();
						if(YesNo == 1) {
							System.out.println( "$" + moneyWithdrawls + " withdrawn.");
							showtrade(moneyWithdrawls);
							radomizeRate();

						}
						else if(YesNo == 2) {

							temp = 1;
						}
						else {
							System.out.println("Error Input");
							temp = 1;
						}							
					}
					else {
						System.out.println("Transaction cancelled.\n");
						temp = 1;
					}
				}
				else if(seletion==2) {
					System.out.print("Amount of deposit:");
					int moneyDeposit = scanner.nextInt();

					System.out.print("Deposit " + moneyDeposit + " dollars to your account. Sure 1) yes 2)no?");
					
					int YesNo = scanner.nextInt();
					if(YesNo == 1) {
						System.out.println( "$" + moneyDeposit + " deposit.");
						showDeposit(moneyDeposit);
						radomizeRate();
					}
					else if(YesNo == 2) {
						temp = 2;
					}
					else {
						System.out.println("Error Input");
						temp = 2;
					}				
				}
				else if(seletion==3) {
					System.out.println("Program quits");
					break;
				}
				else {
					System.out.println("Error Input.");
				}
			}
		}

	}

	static void radomizeRate()
	{
		loadingRate *= (0.9 + 0.2 * Math.random());
		interestRate *= (0.9 + 0.2 * Math.random());
		System.out.printf("Loading rate (%%):%.3f\n" , loadingRate);
		System.out.printf("Interest rate (%%):%.3f\n" , interestRate);
	}

	static boolean checkBeforeWithdrawals(int moneyWithdrawls)
	{
		if (moneyWithdrawls > 20000) {
			System.out.println("Amount of transaction exceeds $20000 limit.");
			return false;
		}
		if (moneyWithdrawls > ATMcash) {
			System.out.println("Cash insufficient.");
			return false;
		}
		if (moneyWithdrawls > availableBalance * (1 + interestRate/100) - (moneyWithdrawls * (loadingRate/100))) {
			System.out.println("Balance insufficient.");
			return false;
		}
		return true;
	}
	static void showtrade(int moneyWithdrawls) 
	{		
		System.out.println("Deposit\t\tWithdrawals\tLoading Fee\tBalance");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.printf("%.0f\t\t%d\t\t%.0f\t\t%.0f\n", availableBalance * (1 + interestRate/100) , moneyWithdrawls, moneyWithdrawls * loadingRate/100 , availableBalance * (1 + interestRate/100) -  moneyWithdrawls - moneyWithdrawls * loadingRate/100 );
		availableBalance = (int) (availableBalance * (1 + interestRate/100) -  moneyWithdrawls - moneyWithdrawls * loadingRate/100);
		ATMcash -= moneyWithdrawls;
	}
	static void showDeposit(int moneyDeposit) {
		System.out.println("Deposit\t\tWithdrawals\tLoading Fee\tBalance");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.printf("%.0f\t\t%d\t\t%.0f\t\t%.0f\n", availableBalance * (1 + interestRate/100) , moneyDeposit, moneyDeposit * loadingRate/100 , availableBalance * (1 + interestRate/100) +  moneyDeposit - moneyDeposit * loadingRate/100 );
		availableBalance = (int) (availableBalance * (1 + interestRate/100) +  moneyDeposit - moneyDeposit * loadingRate/100);
		ATMcash += moneyDeposit;
	}
}
