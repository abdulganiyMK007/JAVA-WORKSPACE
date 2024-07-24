package Chapter9;

public class BasicAccount extends BankAccount {

    public BasicAccount() {
        super();
    }

    public void withdraw(double amount) {
        if (getBalance() <= amount) {
            super.withdraw(amount);
        }
    }
    
}
