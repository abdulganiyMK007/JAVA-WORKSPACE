package Chapter3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A car shape that can be positioned anywhere on the screen.
 */
public class Car {

   private int unit;
   private int xLeft;
   private int yTop;
   private Color color;

   /**
    * Constructs a car with a given top left corner.
    * 
    * @param x the x coordinate of the top left corner
    * @param y the y coordinate of the top left corner
    */
   public Car(int x, int y, Color c, int u) {
      xLeft = x;
      yTop = y;
      color = c;
      unit = u;
   }

   /**
    * Draws the car.
    * 
    * @param g2 the graphics context
    */
   public void draw(Graphics2D g2) {
      Rectangle body = new Rectangle(xLeft, yTop + unit, unit*6, unit);
      Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + unit, yTop + unit*2, unit, unit);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + unit*4, yTop + unit*2, unit, unit);

      // The bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(xLeft + unit, yTop + unit);
      // The front of the roof
      Point2D.Double r2 = new Point2D.Double(xLeft + unit*2, yTop);
      // The rear of the roof
      Point2D.Double r3 = new Point2D.Double(xLeft + unit*4, yTop);
      // The bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(xLeft + unit*5, yTop + unit);

      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

      g2.setColor(color);
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);
      g2.draw(roofTop);
      g2.draw(rearWindshield);
   }
}
