package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class GrowSquareComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        final int HEIGHT = 100;
        final int WIDTH = 100;
        final int SIZE = 50;

        Rectangle square = new Rectangle(WIDTH, HEIGHT, SIZE, SIZE);
        g2.setColor(Color.RED);
        g2.draw(square);

        square.grow(SIZE/2, SIZE/2);
        square.translate(WIDTH/4, HEIGHT/4);
        g2.setColor(Color.BLUE);
        g2.draw(square);

    }
    
}
