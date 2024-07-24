public class RobotSimulation {

    public static void main(String[] args) {
        Robot rb = new Robot();

        System.out.println(rb.getDirection());
        rb.turnLeft();
        System.out.println(rb.getDirection());
        rb.move();
        rb.move();
        rb.turnLeft();
        System.out.println(rb.getDirection());
        rb.move();
        rb.move();
        rb.turnLeft();
        System.out.println(rb.getLocation().toString());
        System.out.println(rb.getDirection());
        rb.turnAround();
        System.out.println(rb.getDirection());
        rb.move(5);
        System.out.println(rb.getLocation().toString());

    }

}
