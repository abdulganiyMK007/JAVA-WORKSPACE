package Chapter3;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class OlympicRingComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        OlympicRing ring = new OlympicRing(50, 50, 150);
        ring.draw(g2);
     }
    
}
