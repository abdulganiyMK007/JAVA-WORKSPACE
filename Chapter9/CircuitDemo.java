package Chapter9;

public class CircuitDemo {
    public static void main(String[] args) {

        Circuit R1 = new Resistor(1);
        Circuit R2 = new Resistor(1);
        Circuit R3 = new Resistor(2);
        Circuit R4 = new Resistor(1);
        Circuit R5 = new Resistor(1);
        Circuit R6 = new Resistor(4);

        Serial S1 = new Serial();
        S1.addResistance(R1);
        S1.addResistance(R2);
        S1.addResistance(R4);
        S1.addResistance(R5);
        double seriesR = S1.getResistance();
        System.out.println(seriesR);

        Parallel P1 = new Parallel();
        P1.addResistance(R3);
        P1.addResistance(R6);
        P1.addResistance(new Resistor(seriesR));
        double para = P1.getResistance();
        System.out.println(para);
        
        
    }
}
