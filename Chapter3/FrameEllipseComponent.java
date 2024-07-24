package Chapter3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class FrameEllipseComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double winCircle = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
        g2.setColor(Color.BLACK);
        g2.draw(winCircle);
        g2.setColor(Color.BLUE);
        g2.fill(winCircle);

    }
    
}
