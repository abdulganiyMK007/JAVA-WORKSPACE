package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent {
    
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle sq1 = new Rectangle(0, 0, 200, 200);
        g2.setColor(Color.CYAN);
        g2.fill(sq1);

        Rectangle sq2 = new Rectangle(50, 50, 100, 100);
        Color ramColor = new Color(100, 120, 150);
        g2.setColor(ramColor);
        g2.fill(sq2);
    }
}
