package Chapter9;

public abstract class ResonantCircuit {

    protected double frequency, bandWidth, gain;

    public abstract double getFrequency();

    public abstract void setFrequency(double frequency);

    public abstract double getBandWidth();

    public abstract void setBandWidth(double bandWidth);

    public abstract double getGain();

    public abstract void setGain(double gain);

    public void display() {
        String info = "[RESONANT FREQUENCY RESPONSE DESCRIPTION]\n";
        info += "Frequency: " + frequency + "\n";
        info += "Band width: " + bandWidth + "\n";
        info += "Gain: " + gain;

        System.out.println(info);
    }

    public String toString() {
        return getClass().getName() + "[frequency="+ frequency + "][bandWidth="+ bandWidth +"][gain="+ gain +"]";
    }

}
