package Chapter5;
import java.util.Scanner;



/*
Write a program to simulate a bank transaction. There are two bank accounts: checking and savings.

First, ask for the initial balances of the bank accounts; reject negative balances. 

Then ask for the transactions; options are deposit, withdrawal, and transfer. 

Then ask for the account; options are checking and savings. Reject transactions that overdraw an account. 

At the end, print the balances of both accounts.
*/

public class BankTransactionSimulation {

	private static final int DEPOSIT_OPTION = 1;
	private static final int WITHDRAWAL_OPTION = 2;
	//private static final int TRANSFER_OPTION = 3;
	
	private static final int SAVINGS_OPTION = 1;
	//private static final int CHECKING_OPTION = 2;
	

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	double savingsBalance, checkingBalance, amount;
  	savingsBalance = checkingBalance = amount = 0;
  
  	int transactionOption, accountOption;
  	transactionOption = accountOption = 0;
  	
  	System.out.print("Enter savings account balance: ");
  	savingsBalance = in.nextDouble();
  	if (savingsBalance < 0) savingsBalance = 0;
  	
  	System.out.print("Enter checking account balance: ");
  	checkingBalance = in.nextDouble();
  	if (checkingBalance < 0) checkingBalance = 0;
  	
  	
  	BankAccount savingsAccount = new BankAccount(savingsBalance);
  	BankAccount checkingAccount = new BankAccount(checkingBalance);
  	
  	
  	System.out.print("Choose transaction option. \n1 to Deposit \n2 to Withdraw \n3 to Transfer\n: ");
		transactionOption = in.nextInt();
		
		System.out.print("Choose account. \n1 for Savings Account \n2 for Checking Account\n: ");
		accountOption = in.nextInt();
		
		System.out.print("Enter amount: ");
		amount = in.nextDouble();
		
		
		if (transactionOption == DEPOSIT_OPTION) {
			if (accountOption == SAVINGS_OPTION) {
				savingsAccount.deposit(amount);
			} else {
			  checkingAccount.deposit(amount);
			}
		  
		} else if (transactionOption == WITHDRAWAL_OPTION) {
		  if (accountOption == SAVINGS_OPTION) {
		    savingsAccount.withdraw(amount);
			} else {
			  checkingAccount.withdraw(amount);
			}
			
		} else {
		  if (accountOption == SAVINGS_OPTION) {
		  	if (amount <= savingsAccount.getBalance()) {
		    	savingsAccount.withdraw(amount);
		  		checkingAccount.deposit(amount);
		  	}
			} else {
  			if (amount <= checkingAccount.getBalance()) {
  				savingsAccount.deposit(amount);
  				checkingAccount.withdraw(amount);
  			}
			}
		}
		
		
		System.out.println("Savings balance: "+ savingsAccount.getBalance());
		System.out.println("Checking balance: "+ checkingAccount.getBalance());
		
		
		in.close();
  }

}
