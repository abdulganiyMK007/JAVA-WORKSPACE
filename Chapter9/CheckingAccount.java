package Chapter9;

public class CheckingAccount extends BankAccount {

    private int withdrawals;
    private int overdrafts;

    /**
     * Constructs a checking account with a zero balance.
     */
    public CheckingAccount() {
        super();
        withdrawals = 0;
        overdrafts = 0;
    }

    public void withdraw(double amount) {
        final double FIRST_OVERDRAFT_CHARGE = 20;
        final double OTHER_OVERDRAFT_CHARGE = 30;

        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 10;

        super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS) {
            super.withdraw(WITHDRAWAL_FEE);
        }

        if (getBalance() < amount) {
            overdrafts++;
            if (overdrafts < 2) {
                super.withdraw(FIRST_OVERDRAFT_CHARGE);
            } else {
                super.withdraw(OTHER_OVERDRAFT_CHARGE);
            }
        }
    }

    public void monthEnd() {
        withdrawals = 0;
    }

}
