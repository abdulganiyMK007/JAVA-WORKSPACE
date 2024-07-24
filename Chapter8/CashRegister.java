
public class CashRegister {

    private double purchase, payment;
    private int itemCount;

    public CashRegister() {
        purchase = payment = 0;
        itemCount = 0;
    }

    public void receivePayment(int coinCount, Coin coinType) {
        payment += coinType.getValue() * coinCount;
    }

    public int giveChange(Coin coinType) {
        int change = (int) ((payment - purchase) / coinType.getValue());
        return change;
    }

    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        itemCount++;
    }

    public void clear() {
        purchase = 0;
        itemCount = 0;
    }

    public double getAmountDue() {
        return purchase;
    }

    public int getItemCount() {
        return itemCount;
    }

}
