package Chapter6;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Spiral {

    private int start_x;
    private int start_y;
    private int length;
    private int loop;
    
    public Spiral(int start_x, int start_y, int length, int loop) {
        this.start_x = start_x;
        this.start_y = start_y;
        this.length = length;
        this.loop = loop;
    }

    public void draw(Graphics2D g2) { 
        g2.setColor(Color.BLUE);
        final double EXTENSION = 1.1;

        for (int i = 0; i < loop; i++) {
            Line2D.Double lineToRight = new Line2D.Double(start_x, start_y, start_x + length, start_y);
            g2.draw(lineToRight);
            start_x += length;
            length = (int) (EXTENSION * length);

            Line2D.Double lineToBottom = new Line2D.Double(start_x, start_y, start_x, start_y + length);
            g2.draw(lineToBottom);
            start_y += length;
            length = (int) (EXTENSION * length);

            Line2D.Double lineToLeft = new Line2D.Double(start_x, start_y, start_x - length, start_y);
            g2.draw(lineToLeft);
            start_x -= length;
            length = (int) (EXTENSION * length);

            Line2D.Double lineToTop = new Line2D.Double(start_x, start_y, start_x, start_y - length);
            g2.draw(lineToTop);
            start_y -= length;
            length = (int) (EXTENSION * length);
        }


    }
    
}
