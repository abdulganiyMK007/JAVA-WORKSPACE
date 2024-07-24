package Chapter3;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class House {

    private int pos_x;
    private int pos_y;
    private int size;

    public House(int pos_x, int pos_y, int size) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.size = size;
    }


    public void draw(Graphics2D g2) {
        Rectangle building = new Rectangle(pos_x - size*7/2, pos_y + size*3, size*7, size*5);
        Rectangle door = new Rectangle(pos_x - size*5/2, pos_y + size*4, size*2, size*4);
        Rectangle window = new Rectangle(pos_x + size*1/2, pos_y + size*4, size*2, size*2);

        Line2D.Double roofLeft = new Line2D.Double(pos_x, pos_y, pos_x - size*7/2, pos_y + size*3);
        Line2D.Double roofRight = new Line2D.Double(pos_x, pos_y, pos_x + size*7/2, pos_y + size*3);


        g2.draw(building);
        g2.draw(door);
        g2.draw(window);
        g2.draw(roofLeft);
        g2.draw(roofRight);

    }
}
