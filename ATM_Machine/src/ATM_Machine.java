import java.util.Scanner;

/***
 * @author Sipho Marubelela - siphoprincemarubelela@gmail.com
 * @version 0.1
 * This program simulates an ATM machine's functionality
 */

public class ATM_Machine {

	//attributes
	static double balance, deposit, withdraw;
	static double startingBalance = 0.00;
	
	//methods:
	//here I will include methods to simulate deposits, withdrawals, & balance enquiries
	public static double depositMoney(double depositAmount) {
		startingBalance = startingBalance + depositAmount;
		return startingBalance;
	}
	
	public static void withdrawMoney(double withdrawalAmount) {
		//check for availability of funds
		if(startingBalance < withdrawalAmount) {
			System.err.println("Insufficient funds! Transaction failed");
			//System.out.println("Available funds: " + checkBalance() + " ZAR");
		}
		if(startingBalance >= withdrawalAmount) {
			//funds are available
			balance = startingBalance - withdrawalAmount;
			System.out.println("Withdrawal amount: " + withdrawalAmount + " ZAR");
			System.out.println("Available funds: " + balance + " ZAR");
		}
		
	}
	
	public static double checkBalance() {
		return startingBalance;
	}
	
	public static void main(String[] args) {
	
		//program control
		startingBalance = 0.00;
		try (Scanner input = new Scanner(System.in)) {
		boolean blnContinue = true;
		int option = 0;
		//variables
		double deposit, withdrawal, balance;
		while(blnContinue) {
				
			//System.out.println("\n");
			System.out.println("===============================");
			System.out.println("|    LOGGED IN SUCCESSFULLY   |"); 
			System.out.println("===============================");
			System.out.println("|  PRESS 1 TO DEPOSIT MONEY   |");
			System.out.println("|  PRESS 2 TO WITHDRAW MONEY  |");
			System.out.println("|  PRESS 3 TO CHECK BALANCE   |");
			System.out.println("===============================");
			System.out.println("|  PRESS 4 TO LOGOUT          |");
			System.out.println("===============================");
			System.out.print("Enter option: ");
				
			option = input.nextInt();
				
			switch(option) {
			case 1:
				System.out.println("Account balance: " + startingBalance + " ZAR");
				System.out.print("Enter the amount of money to deposit: ");
				deposit = input.nextDouble();
				depositMoney(deposit);
				System.out.println("Success! Account balance: " + checkBalance() + " ZAR");
				break;
			case 2:
				System.out.print("Enter the amount of money to withdraw: ");
				withdrawal = input.nextDouble();
				withdrawMoney(withdrawal);					break;
			case 3:
				System.out.println("Account balance: " + checkBalance() + " ZAR");
				break;
			case 4:
				System.out.println("GOOD-BYE :)");
				blnContinue = false;
				break;
				default:
					System.err.println("INVALID OPTION ENTERED!");
					break;
			}
		}
	}
}

}
