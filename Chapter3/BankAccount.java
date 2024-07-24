package Chapter3;

import Chapter3.BankAccount;




/**
A bank account has a balance that can be changed by 3 deposits and withdrawals.
*/

public class BankAccount {

	private static final double TRANSACTION_CHARGES = 2.0;
	private static final int NUM_OF_FREE_TRANSACTION_PER_MONTH = 3;
	
	private static final int HUNDRED = 100;
	
	private double balance;
	private int actualTransactionCount;
	
	/**
	 Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		balance = 0;
		actualTransactionCount = 0;
	}
	
	/**
	Constructs a bank account with a given balance.
	@param initialBalance the initial balance.
	*/
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	public void deposit(double amount) {
		balance += amount;
		actualTransactionCount++;
	}
	
	/**
	Withdraws money from the bank account.   
	@param amount the amount to withdraw
	*/
	public void withdraw(double amount) {
		balance -= amount;
		actualTransactionCount++;
	}
	
	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public double getBalance() {
		deductMonthlyCharge();
		return balance;
	}
	
	/**
	Adds interest at the given rate.
	@param the interest rate
	*/
	public void addInterest(double rate) {
	  balance += (balance * rate / HUNDRED);
	}
	
	
	private void deductMonthlyCharge() {
		if (actualTransactionCount > NUM_OF_FREE_TRANSACTION_PER_MONTH) {
		  balance -= (actualTransactionCount - NUM_OF_FREE_TRANSACTION_PER_MONTH) * TRANSACTION_CHARGES;
		}
		
		actualTransactionCount = 0;
	}
	
	
}
