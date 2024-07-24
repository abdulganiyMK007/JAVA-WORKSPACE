public class ResistorTester {

    public static void main(String[] args) {
        Resistor rt = new Resistor(2, 5);
        System.out.println("Nominal resistance: " + rt.getNominalResistance());
        System.out.println("Actual resistance: " + rt.getActualResistance());
        System.out.println("Tolerance: " + rt.getTolerance());
        System.out.println(rt.getColorBands());

    }

}
