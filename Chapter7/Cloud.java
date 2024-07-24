package Chapter7;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Cloud {

    private Point2D[] points;
    private int currentSize;

    private final int DIAMETER = 10;

    public Cloud(int size) {
        if (size < 1) {
            size = 10;
        }
        points = new Point2D[size];
        currentSize = 0;
    }

    public void add(Point2D.Double aPoint) {
        if (currentSize < points.length) {
            points[currentSize] = aPoint;
            currentSize++;
        }
    }
    
    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        for (Point2D aPoint : points) {
            Ellipse2D.Double circle = new Ellipse2D.Double(aPoint.getX(), aPoint.getY(), DIAMETER, DIAMETER);
            g2.fill(circle);
        }
    }
    
}
