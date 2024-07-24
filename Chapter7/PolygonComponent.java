package Chapter7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class PolygonComponent extends JComponent{

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int NUM_POINTS = 5;

        Polygon poly = new Polygon(NUM_POINTS);

        Point2D.Double point1 = new Point2D.Double(100, 100);
        poly.add(point1);
        Point2D.Double point2 = new Point2D.Double(200, 100);
        poly.add(point2);
        Point2D.Double point3 = new Point2D.Double(200, 200);
        poly.add(point3);
        // Point2D.Double point4 = new Point2D.Double(150, 250);
        // poly.add(point4);
        Point2D.Double point5 = new Point2D.Double(100, 200);
        poly.add(point5);


        poly.draw(g2);


    }
    
}
