package Chapter6;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class RoseComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rose graph1 = new Rose(0, Math.PI);
        graph1.draw(g2);

    }
    
}
