package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class FourRectangleComponent extends JComponent{

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        final int WIDTH = 100;
        final int HEIGHT = 100;

        Rectangle box = new Rectangle(0, 0, WIDTH, HEIGHT);
        g2.setColor(Color.RED);
        g2.draw(box);

        box.translate(WIDTH, 0);
        g2.setColor(Color.GREEN);
        g2.draw(box);

        box.translate(0, HEIGHT);
        g2.setColor(Color.BLUE);
        g2.draw(box);

        box.translate(-WIDTH, 0);
        g2.setColor(Color.PINK);
        g2.draw(box);

    }
    
}
