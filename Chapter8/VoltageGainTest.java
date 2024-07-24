public class VoltageGainTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Resistor R1 = new Resistor(250, 5);
            Resistor R2 = new Resistor(750, 5);

            VoltageDivider vd = new VoltageDivider(R1, R2);

            System.out.println("Actual Gain " + i + ": " + vd.getActualGain());
            System.out.println("Nominal Gain " + i + ": " + vd.getNominalGain());
            System.out.println("---------------------");
        }

    }

}
