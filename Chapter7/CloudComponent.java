package Chapter7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Random;


import javax.swing.JComponent;

public class CloudComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int N_CLOUD = 200;

        Cloud cloud = new Cloud(N_CLOUD);

        Random rgen = new Random();
        for (int i = 0; i < N_CLOUD; i++) {
            int ranX = (int) rgen.nextDouble(0, getWidth());
            int ranY = (int) rgen.nextDouble(0, getHeight());
            Point2D.Double p = new Point2D.Double(ranX, ranY);
            cloud.add(p);
        }

        cloud.draw(g2);

    }
    
}
