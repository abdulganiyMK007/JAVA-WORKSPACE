package Chapter3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        final int CENTER_X = 200;
        final int CENTER_Y = 200;
        final int SIZE = 50;
        Target dot1 = new Target(CENTER_X, CENTER_Y, SIZE);
        Target dot2 = new Target(CENTER_X, CENTER_Y, SIZE * 2);
        Target dot3 = new Target(CENTER_X, CENTER_Y, SIZE * 3);
        Target dot4 = new Target(CENTER_X, CENTER_Y, SIZE * 4);
        Target dot5 = new Target(CENTER_X, CENTER_Y, SIZE * 5);
        Target dot6 = new Target(CENTER_X, CENTER_Y, SIZE * 6);
        Target dot7 = new Target(CENTER_X, CENTER_Y, SIZE * 7);

        Color c1 = Color.WHITE;
        Color c2 = Color.RED;
        
        dot7.draw(g2, c2);
        dot6.draw(g2, c1);
        dot5.draw(g2, c2);
        dot4.draw(g2, c1);
        dot3.draw(g2, c2);
        dot2.draw(g2, c1);
        dot1.draw(g2, c2);
     }
    
}
