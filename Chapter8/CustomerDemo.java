public class CustomerDemo {

    public static void main(String[] args) {

        Customer cus = new Customer();
        cus.makePurchase(50, 1);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 3);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 2);
        System.out.println(cus.discountReached());
        System.out.print("Expected: true ---> \n");

        cus.makePurchase(50, 2);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 3);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 1);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 2);
        System.out.println(cus.discountReached());
        System.out.print("Expected: true ---> \n");

        cus.makePurchase(50, 3);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");

        cus.makePurchase(50, 3);
        System.out.println(cus.discountReached());
        System.out.print("Expected: false ---> \n");
    }

}
