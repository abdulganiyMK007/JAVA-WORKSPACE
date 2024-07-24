package chapter2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class LineDistanceComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Line2D.Double line = new Line2D.Double(100, 100, 200, 200);
        g2.draw(line);

        Point2D.Double point1 = new Point2D.Double(100, 200);
        Point2D.Double point2 = new Point2D.Double(150, 150);
        Point2D.Double point3 = new Point2D.Double(250, 50);

        double dLineFromPoint1 = line.ptSegDist(point1);
        double dLineFromPoint2 = line.ptSegDist(point2);
        double dLineFromPoint3 = line.ptSegDist(point3);

        
        Ellipse2D.Double circ1 = new Ellipse2D.Double(100, 200, 4, 4);
        g2.fill(circ1);
        g2.drawString("Distance: " + dLineFromPoint1, (int) point1.getX(), (int) point1.getY());

        Ellipse2D.Double circ2 = new Ellipse2D.Double(150, 150, 4, 4);
        g2.fill(circ2);
        g2.drawString("Distance: " + dLineFromPoint2, (int) point2.getX(), (int) point2.getY());

        Ellipse2D.Double circ3 = new Ellipse2D.Double(250, 50, 4, 4);
        g2.fill(circ3);
        g2.drawString("Distance: " + dLineFromPoint3, (int) point3.getX(), (int) point3.getY());
        
        
    }
    
}
