public class PostalCodeTester {

    public static void main(String[] args) {
        
        String barCode = PostalCode.toBarCode(95014);
        System.out.println("||:|:::|:|:||::::::||:|::|:::||| Expected.");
        System.out.println(barCode);

        int zipCode = PostalCode.toZipCode("||:|:::|:|:||::::::||:|::|:::|||");
        System.out.println("95014 Expected");
        System.out.println(zipCode);
    }

}
