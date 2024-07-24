package Chapter3;

import java.awt.Color;
import java.awt.Graphics2D;

public class OlympicRing {


    private int pos_x;
    private int pos_y;
    private int size;

    public OlympicRing(int pos_x, int pos_y, int size) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.size = size;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.drawOval(pos_x, pos_y, size, size);
        g2.setColor(Color.BLACK);
        g2.drawOval(pos_x + size, pos_y, size, size);
        g2.setColor(Color.RED);
        g2.drawOval(pos_x + size*2, pos_y, size, size);
        g2.setColor(Color.YELLOW);
        g2.drawOval(pos_x + size/2, pos_y + size/2, size, size);
        g2.setColor(Color.GREEN);
        g2.drawOval(pos_x + size*3/2, pos_y + size/2, size, size);

    }
    
}
