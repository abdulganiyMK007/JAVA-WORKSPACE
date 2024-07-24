public class VoltageDivider {

    private Resistor R1;
    private Resistor R2;

    public VoltageDivider(Resistor R1, Resistor R2) {
        this.R1 = R1;
        this.R2 = R2;
    }

    public double getNominalGain() {
        double gain = getGain(R1.getNominalResistance(), R2.getNominalResistance());
        return ((int) (gain * 10000)) / 10000.0;
    }

    public double getActualGain() {
        double gain = getGain(R1.getActualResistance(), R2.getActualResistance());
        return ((int) (gain * 10000)) / 10000.0;
    }

    private double getGain(double R1, double R2) {
        return R2 / (R1 + R2);
    }

}
