import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class CannonballSimulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter starting angle: ");
        double startingAngle = in.nextDouble();

        System.out.print("Enter initial velocity: ");
        double initialVelocity = in.nextDouble();

        Cannonball ball = new Cannonball(0);
        ArrayList<Point> positionList = ball.shoot(startingAngle, initialVelocity, 0);

        System.out.println("Number of Points: " + positionList.size());
        in.close();
        // for (Point pos : positionList) {
        // System.out.println("(" + pos.getX() + ", " + pos.getY() + ")");
        // }

        for (int i = 0; i < positionList.size(); i++) {
            Point pos = positionList.get(i);
            System.out.println(i + ": (" + (int) pos.getX() + ", " + (int) pos.getY() + ")");
        }

    }

}
