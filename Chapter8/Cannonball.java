import java.awt.Point;
import java.util.ArrayList;

public class Cannonball {

    private double x_position;
    private double y_position;
    private double x_velocity;
    private double y_velocity;

    public Cannonball(double position) {
        x_position = position;
        y_position = 0;
        x_velocity = y_velocity = 0;
    }

    public void move(double deltaSec) {
        double x_distance = x_velocity * deltaSec;
        double y_distance = y_velocity * deltaSec + 0.5 * GRAVITY_CONSTANT * deltaSec * deltaSec;

        x_position += x_distance;
        y_position += y_distance;

        y_velocity = y_velocity + GRAVITY_CONSTANT * deltaSec;
    }

    public Point getLocation() {
        Point location = new Point((int) x_position, (int) y_position);
        return location;
    }

    public ArrayList<Point> shoot(double alpha, double initialVelocity, double deltaSec) {
        ArrayList<Point> positionList = new ArrayList<>();

        x_velocity = initialVelocity * Math.cos(Math.toRadians(alpha));
        y_velocity = initialVelocity * Math.sin(Math.toRadians(alpha));

        // positionList.add(getLocation());
        do {
            deltaSec += 0.01;
            move(deltaSec);
            positionList.add(getLocation());

        } while (y_position > 0);

        return positionList;
    }

    private static final double GRAVITY_CONSTANT = -9.81;

}
