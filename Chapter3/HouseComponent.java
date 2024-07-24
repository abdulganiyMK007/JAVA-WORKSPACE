package Chapter3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
  
        House h = new House(200, 0, 10);
        House h1 = new House(150, 150, 30);

        h.draw(g2);
        h1.draw(g2);
    }
    
}
