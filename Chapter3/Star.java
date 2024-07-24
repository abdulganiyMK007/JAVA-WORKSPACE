package Chapter3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Star {

    private int center_x;
    private int center_y;
    private int length;
    
    public Star(int center_x, int center_y, int length) {
        this.center_x = center_x;
        this.center_y = center_y;
        this.length = length;
    }


    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        
        Line2D.Double centerToRight = new Line2D.Double(center_x, center_y, center_x + length, center_y);
        Line2D.Double centerToLeft = new Line2D.Double(center_x, center_y, center_x - length, center_y);
        Line2D.Double centerToTop = new Line2D.Double(center_x, center_y, center_x, center_y + length);
        Line2D.Double centerToBottom = new Line2D.Double(center_x, center_y, center_x, center_y - length);

        Line2D.Double centerToTopRight = new Line2D.Double(center_x, center_y, center_x + length, center_y - length);
        Line2D.Double centerToTopLeft = new Line2D.Double(center_x, center_y, center_x - length, center_y - length);
        Line2D.Double centerToBottomRight = new Line2D.Double(center_x, center_y, center_x + length, center_y + length);
        Line2D.Double centerToBottomLeft = new Line2D.Double(center_x, center_y, center_x - length, center_y + length);

        g2.draw(centerToRight);
        g2.draw(centerToLeft);
        g2.draw(centerToTop);
        g2.draw(centerToBottom);
        g2.draw(centerToTopRight);
        g2.draw(centerToTopLeft);
        g2.draw(centerToBottomRight);
        g2.draw(centerToBottomLeft);
    }
}
