package Chapter3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class StarComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Star aStar1 = new Star(300, 200, 100);
        aStar1.draw(g2);

        Star aStar2 = new Star(400, 300, 50);
        aStar2.draw(g2);

        Star aStar3 = new Star(200, 100, 50);
        aStar3.draw(g2);

        Star aStar4 = new Star(400, 100, 50);
        aStar4.draw(g2);

        Star aStar5 = new Star(200, 300, 50);
        aStar5.draw(g2);



     }
    
}
