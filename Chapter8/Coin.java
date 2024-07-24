
public class Coin {

    private static final double DOLLAR_VALUE = 1;
    private static final String DOLLAR = "DOLLAR";

    private static final double QUARTER_VALUE = 0.25;
    private static final String QUARTER = "QUARTER";

    private static final double DIME_VALUE = 0.1;
    private static final String DIME = "DIME";

    private static final double NICKEL_VALUE = 0.05;
    private static final String NICKEL = "NICKEL";

    private static final double PENNY_VALUE = 0.01;
    private static final String PENNY = "PENNY";

    private String name;

    public Coin(String aName) {
        name = aName;
    }

    public double getValue() {
        name = name.toUpperCase();

        if (name.equals(PENNY)) {
            return PENNY_VALUE;

        } else if (name.equals(NICKEL)) {
            return NICKEL_VALUE;

        } else if (name.equals(DIME)) {
            return DIME_VALUE;

        } else if (name.equals(QUARTER)) {
            return QUARTER_VALUE;

        } else if (name.equals(DOLLAR)) {
            return DOLLAR_VALUE;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

}
