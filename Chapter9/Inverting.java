package Chapter9;

public class Inverting extends Amplifier {
    
    private double R1, R2;

    public Inverting(double R1, double R2) {
        this.R1 = R1;
        this.R2 = R2;
    }

    public double getGain() {
        return - (R2 / R1);
    }

    public String getDescription() {
        return getClass().getName() + "[R1="+ R1 +"][R2="+ R2 +"][Gain="+ getGain() +"]";
    }

}
