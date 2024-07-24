package Chapter3;

import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;


public class Target  {

    private int start_x;
    private int start_y;
    private int diameter;

    public Target(int x, int y, int d) {
        start_x = x;
        start_y = y;
        diameter = d;
    }


    public void draw(Graphics2D g, Color color) {

        Ellipse2D.Double winCircle = new Ellipse2D.Double(start_x - diameter/2, start_y - diameter/2, diameter, diameter);
        g.setColor(color);
        g.fill(winCircle);
        
    }
    
}
