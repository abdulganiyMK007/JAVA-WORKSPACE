public class Customer {

    double discountPriceCount;
    double totalPurchase;
    boolean[] shopsRow;

    public Customer() {
        discountPriceCount = 0;
        totalPurchase = 0;
        shopsRow = new boolean[N_SHOPS];
    }

    public void makePurchase(double amount, int shopTag) {
        if (discountReached()) {
            totalPurchase += amount - amount * DISCOUNT_PERCENT;
            discountPriceCount = 0;
            shopsRow = new boolean[N_SHOPS];
        } else {
            totalPurchase += amount;
            discountPriceCount += amount;
            if (shopTag > 0 && shopTag <= N_SHOPS) {
                shopsRow[shopTag - 1] = true;
            }
        }

        System.out.println("Total Purchase: " + totalPurchase);
        System.out.println("Discount Price Count: " + discountPriceCount);

    }

    public boolean discountReached() {
        int shopCounter = 0;
        for (int i = 0; i < shopsRow.length; i++) {
            if (shopsRow[i])
                shopCounter++;
        }

        return (discountPriceCount >= DISCOUNT_LIMIT && shopCounter >= MIN_SHOPS_PURCHASE) ? true : false;
    }

    private static final double DISCOUNT_PERCENT = 0.1;
    private static final double DISCOUNT_LIMIT = 100.0;
    private static final int N_SHOPS = 20;
    private static final int MIN_SHOPS_PURCHASE = 3;

}
