package Chapter5;
/**
A bank account has a balance that can be changed by 3 deposits and withdrawals.
*/

public class BankAccount {

	//private static final double TRANSACTION_CHARGES = 2.0;
	//private static final int NUM_OF_FREE_TRANSACTION = 3;
	
	private static final int HUNDRED = 100;
	
	private double balance;
	//private int actualTransactionCount;
	
	/**
	 Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		balance = 0;
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
		if (amount < 0) amount = 0;
		
		balance += amount;
		//actualTransactionCount++;
	}
	
	/**
	Withdraws money from the bank account.   
	@param amount the amount to withdraw
	*/
	public void withdraw(double amount) {
		if (amount < 0 || amount > balance) amount = 0;
		
		balance -= amount;
		//actualTransactionCount++;
	}
	
	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public double getBalance() {
		return balance;
	}
	
	
	public void addInterest(double rate) {
	  balance += (balance * rate / HUNDRED);
	}
	
	/*
	private void deductMonthlyCharge() {
	
		actualTransactionCount = 0; 
	}
	*/

}
