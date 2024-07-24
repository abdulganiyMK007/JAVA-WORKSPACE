package Chapter9;

public class BikeDemo {

    public static void main(String[] args) {

        MountainBike mbike = new MountainBike(20, 10, 15);
        System.out.println("Bike Gear: " + mbike.getGear());
        System.out.println("Bike Speed: " + mbike.getSpeed());
        System.out.println("Bike Seat Height: " + mbike.getSeatHeight());

        mbike.setGear(1000);
        mbike.setSeatHeight(390);
        mbike.applyBrake(9);

        System.out.println("Bike Gear: " + mbike.getGear());
        System.out.println("Bike Speed: " + mbike.getSpeed());
        System.out.println("Bike Seat Height: " + mbike.getSeatHeight());

    }
}
