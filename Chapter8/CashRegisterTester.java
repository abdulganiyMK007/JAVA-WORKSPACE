public class CashRegisterTester {

    public static void main(String[] args) {

        CashRegister reg = new CashRegister();
        reg.recordPurchase(3.0);
        reg.recordPurchase(5);

        System.out.println("Amount Due: " + reg.getAmountDue());
        System.out.println("Expected: 8.0");

        reg.receivePayment(12, new Coin("quarter"));
        reg.receivePayment(7, new Coin("dollar"));

        int change = reg.giveChange(new Coin("nickel"));
        System.out.println("Change: " + change);
        System.out.println("Expected: 40");

    }

}
