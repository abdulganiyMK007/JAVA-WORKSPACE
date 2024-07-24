package Chapter9;

public class Resistor extends Circuit {

    private double value;

    public Resistor(double value) {
        this.value = value;
    }

    public double getResistance() {
        return value;
    }

    public String toString() {
        return super.toString() +"[value="+ value +"]";
    }
    
}


    