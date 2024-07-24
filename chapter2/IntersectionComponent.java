package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class IntersectionComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        final int EDGE_X = 100;
        final int EDGE_Y = 100;
        final int SIZE = 50;

        Rectangle rect1 = new Rectangle(EDGE_X, EDGE_Y, SIZE, SIZE);
        g2.setColor(Color.RED);
        g2.draw(rect1);

        Rectangle rect2 = new Rectangle(EDGE_X + SIZE/2, EDGE_Y + SIZE/2, SIZE, SIZE);
        g2.setColor(Color.BLUE);
        g2.draw(rect2);

        Rectangle rect3 = rect1.intersection(rect2);
        g2.setColor(Color.GREEN);
        g2.fill(rect3);
        
        

    }
    
}
