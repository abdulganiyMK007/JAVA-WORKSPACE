package Chapter7;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Polygon {

    private Point2D[] points;
    private int currentSize;

    private final int DIAMETER = 5;

    public Polygon(int size) {
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
       
        
        for (int i = 1; i < currentSize; i++) {
            Ellipse2D.Double aPoint = new Ellipse2D.Double(points[i].getX() - DIAMETER / 2, points[i].getY() - DIAMETER / 2, DIAMETER, DIAMETER);
            g2.fill(aPoint);

            Line2D.Double line =  new Line2D.Double(points[i - 1].getX(), points[i - 1].getY(), points[i].getX(), points[i].getY());
            g2.draw(line);
        }

        Ellipse2D.Double dot1 = new Ellipse2D.Double(points[0].getX() - DIAMETER / 2, points[0].getY() - DIAMETER / 2, DIAMETER, DIAMETER);
        g2.fill(dot1);

        
        Line2D.Double line =  new Line2D.Double(points[0].getX(), points[0].getY(), points[currentSize - 1].getX(), points[currentSize - 1].getY());
        g2.draw(line);


    }
    
    
}
