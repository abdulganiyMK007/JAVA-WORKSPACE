package chapter2;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceTester {

    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(100, 100, 200, 200);

        Point2D.Double point1 = new Point2D.Double(100, 200);
        Point2D.Double point2 = new Point2D.Double(150, 150);
        Point2D.Double point3 = new Point2D.Double(250, 50);

        double dLineFromPoint1 = line.ptSegDist(point1);
        double dLineFromPoint2 = line.ptSegDist(point2);
        double dLineFromPoint3 = line.ptSegDist(point3);

        System.out.println("[Distance from point 1]");
        System.out.printf("%-20s%10.4f%2s", "Expected: 70.7107, Value: ", dLineFromPoint1, "\n");

        System.out.println("[Distance from point 2]");
        System.out.printf("%-20s%10.4f%2s", "Expected: 0.0, Value: ", dLineFromPoint2, "\n");

        System.out.println("[Distance from point 3]");
        System.out.printf("%-20s%10.4f%2s", "Expected: 141.4214, Value: ", dLineFromPoint3, "\n");
    }
    
}
