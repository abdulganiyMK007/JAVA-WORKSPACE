package Chapter9;

public class ParallelResonantCircuit extends ResonantCircuit{

    private double resistance, capacitance, inductance;

    public ParallelResonantCircuit() {
        resistance = capacitance = inductance = 0;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        super.frequency = frequency;
    }

    public double getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(double bandWidth) {
        super.bandWidth = bandWidth;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        super.gain = gain;
    }

    private void calculateValues() {
        resistance = gain;
        inductance = ((int) (1 / resistance / bandWidth * DECIMAL_PLACES)) / 1.0 / DECIMAL_PLACES;
        capacitance = ((int) (1 / (frequency * frequency * inductance) * DECIMAL_PLACES)) / 1.0 / DECIMAL_PLACES;
    }

    public void display() {
        super.display();

        calculateValues();
        String info = "PARALLEL CIRCUIT:\n";
        info += "Resistance: "+ resistance +"\n";
        info += "Inductance: "+ inductance +"\n";
        info += "Capacitance: "+ capacitance +"\n";

        System.out.println(info);
        
    }

    public String toString() {
        return super.toString() +"[resistance="+ resistance +"][inductance="+ inductance +"][capacitance="+ capacitance +"]";
    }

    private static final int DECIMAL_PLACES = 3 * 10;
    
}

    