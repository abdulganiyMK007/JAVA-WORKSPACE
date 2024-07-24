package Chapter9;

public class AmplifierDemo {

    public static void main(String[] args) {
        Inverting v1 = new Inverting(10, 20);
        System.out.println(v1.getDescription());

        NonInverting v2 = new NonInverting(10, 20);
        System.out.println(v2.getDescription());

        VoltageDivider v3 = new VoltageDivider(10, 20);
        System.out.println(v3.getDescription());

    }

}
 