public class PostalCode {

    public static int toZipCode(String barCode) {
        String binCode = "";
        for (int i = 1; i < barCode.length() - 1; i++) {
            binCode += (barCode.charAt(i) == FULL_BAR.charAt(0)) ? ONE : ZERO;
        }

        String temp = "";
        String zipCode = "";
        for (int i = 0; i < binCode.length(); i += LENGTH_OF_UNIT_BAR_CODE) {
            temp = binCode.substring(i, i + LENGTH_OF_UNIT_BAR_CODE);

            for (int j = 0; j < CODE_LIB.length; j++) {
                if (temp.equals(CODE_LIB[j])) {
                    zipCode += j;
                }
            }
        }

        return Integer.parseInt(zipCode.substring(0, zipCode.length() - 1));
    }

    public static String toBarCode(int zipCode) {

        String binCode = CODE_LIB[getCheckDigit(zipCode)];
        while (zipCode > 0) {
            binCode = CODE_LIB[zipCode % 10] + binCode;
            zipCode /= 10;
        }

        String barCode = "";
        for (int i = 0; i < binCode.length(); i++) {
            barCode += (binCode.charAt(i) == ONE.charAt(0)) ? FULL_BAR : HALF_BAR;
        }
        return FULL_BAR + barCode + FULL_BAR;
    }

    private static int getCheckDigit(int zipCode) {
        int sum = 0;
        while (zipCode > 0) {
            sum += zipCode % 10;
            zipCode /= 10;
        }

        while (sum > 10) {
            sum -= 10;
        }
        return 10 - sum;
    }

    private static final int LENGTH_OF_UNIT_BAR_CODE = 5;

    private static final String HALF_BAR = ":";
    private static final String FULL_BAR = "|";

    private static final String ZERO = "0";
    private static final String ONE = "1";

    private static final String[] CODE_LIB = { "11000", "00011", "00101", "00110", "01001",
            "01010", "01100", "10001", "10010", "10100" };

}
