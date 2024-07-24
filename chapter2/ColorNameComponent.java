package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ColorNameComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        final int START_X = 100;
        final int START_Y = 100;
        final int OFFSET_Y = START_Y / 4;

        g2.setColor(Color.RED);
        g2.drawString("RED", START_X, START_Y);

        g2.setColor(Color.GREEN);
        g2.drawString("GREEN", START_X, START_Y + OFFSET_Y);

        g2.setColor(Color.BLUE);
        g2.drawString("BLUE", START_X, START_Y + OFFSET_Y * 2);

        g2.setColor(Color.BLACK);
        g2.drawString("BLACK", START_X, START_Y + OFFSET_Y * 3);

        g2.setColor(Color.CYAN);
        g2.drawString("CYAN", START_X, START_Y + OFFSET_Y * 4);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("DARK_GRAY", START_X, START_Y + OFFSET_Y * 5);

        g2.setColor(Color.GRAY);
        g2.drawString("GRAY", START_X, START_Y + OFFSET_Y * 6);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("LIGHT_GRAY", START_X, START_Y + OFFSET_Y * 7);

        g2.setColor(Color.MAGENTA);
        g2.drawString("MAGENTA", START_X, START_Y + OFFSET_Y * 8);

        g2.setColor(Color.ORANGE);
        g2.drawString("ORANGE", START_X, START_Y + OFFSET_Y * 9);

        g2.setColor(Color.PINK);
        g2.drawString("PINK", START_X, START_Y + OFFSET_Y * 10);

        g2.setColor(Color.YELLOW);
        g2.drawString("YELLOW", START_X, START_Y + OFFSET_Y * 11);
    }
    
}
