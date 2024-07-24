package Chapter3;

public class BankAccountTester {

/**
Tests the methods of the BankAccount class.
*/ 
	public static void main(String[] args) {
		BankAccount harrysChecking = new BankAccount();
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
//System.out.println(harrysChecking.getBalance());
//		System.out.println("Expected: 1500"); 
		
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 2998"); 
		
		
		
		
		
		
		
		BankAccount momsSavings = new BankAccount(2000); 
		momsSavings.addInterest(10); // 10 percent interest
	System.out.println(momsSavings.getBalance());
		System.out.println("Expected: 2200"); 
		
			
	}
}
