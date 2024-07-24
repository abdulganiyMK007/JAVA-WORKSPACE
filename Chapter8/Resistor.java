import java.util.Random;

public class Resistor {

    private double resistance;
    private double tolerance;
    private double percentage;

    public Resistor(double resistance, double tolerance) {
        this.resistance = resistance;
        this.tolerance = tolerance;

        Random random = new Random();
        percentage = -tolerance + (2 * tolerance) * random.nextDouble();
        percentage = Math.round((percentage) * 100) / 100.0;
    }

    public double getNominalResistance() {
        return resistance;
    }

    public double getActualResistance() {
        double actualResistance = (resistance * (1 + percentage / 100.0));
        return Math.round((actualResistance) * 100) / 100.0;
    }

    public double getTolerance() {
        return tolerance;
    }

    public String getColorBands() {
        String resistance = ((int) (getActualResistance() * 100.0)) + "";

        int firstCode = Integer.parseInt(String.valueOf(resistance.charAt(0)));
        int secondCode = Integer.parseInt(String.valueOf(resistance.charAt(1)));

        String firstBandColor = getDigitColor(firstCode);
        String secondBandColor = getDigitColor(secondCode);
        String thirdBandColor = getDigitColor(resistance.length() - 4);
        String fourthBandColor = getToleranceColor();

        return firstBandColor + " " + secondBandColor + " " + thirdBandColor + " " + fourthBandColor;

    }

    private String getDigitColor(int code) {
        switch (code) {
            case 0:
                return "Black";
            case 1:
                return "Brown";
            case 2:
                return "Red";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
            case 5:
                return "Green";
            case 6:
                return "Blue";
            case 7:
                return "Violet";
            case 8:
                return "Gray";
            case 9:
                return "White";
            case -1:
                return "Gold";
            case -2:
                return "Silver";
            default:
                return "None";
        }
    }


    private String getToleranceColor() {
        if (tolerance == 1.0) {
            return "Brown";
        } else if (tolerance == 2.0) {
            return "Red";
        } else if (tolerance == 0.5) {
            return "Green";
        } else if (tolerance == 0.25) {
            return "Blue";
        } else if (tolerance == 0.1) {
            return "Violet";
        } else if (tolerance == 0.05) {
            return "Gray";
        } else if (tolerance == 5.0) {
            return "Gold";
        } else if (tolerance == 10.0) {
            return "Silver";
        } else if (tolerance == 20.0) {
            return "None";
        } else {
            return "-----";
        }
    }

}
