package Chapter6;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Rose {

    private final int BIT;
    private final int STEPS = 100;
    private double startAngle;
    private double stopAngle;


    public Rose(double startAngle, double stopAngle) {
        this.startAngle = startAngle;
        this.stopAngle = stopAngle;
        BIT = (int) ((stopAngle - startAngle) / STEPS);
    }

    public void draw(Graphics2D g2) { 
        double modulus = 0;
        double point_X2, point_Y2;

        modulus = Math.cos(2 * startAngle);
        double point_X1 = modulus * Math.cos(startAngle);
        double point_Y1 = modulus * Math.sin(startAngle);

        for (int theta = (int) startAngle; theta <= stopAngle; theta += BIT) {
            modulus = Math.cos(2 * theta);
            point_X2 = modulus * Math.cos(theta);
            point_Y2 = modulus * Math.sin(theta);

            Line2D.Double line = new Line2D.Double(point_X1, point_Y1, point_X2, point_Y2);
            g2.draw(line);

            point_X1 = point_X2;
            point_Y1 = point_Y2;
        }

    }
    
}
