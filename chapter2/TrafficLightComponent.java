package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class TrafficLightComponent extends JComponent {

    private static final int UNIT = 40;

    private static final int START_X = 20;
    private static final int START_Y = 20;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(START_X, START_Y, UNIT * 4, UNIT * 10);
        g2.fill(box);

        Ellipse2D.Double redBulb = new Ellipse2D.Double(START_X + UNIT, START_Y + UNIT, UNIT * 2, UNIT * 2);
        g2.setColor(Color.RED);
        g2.fill(redBulb);

        Ellipse2D.Double greenBulb = new Ellipse2D.Double(START_X + UNIT, START_Y + UNIT * 4, UNIT * 2, UNIT * 2);
        g2.setColor(Color.GREEN);
        g2.fill(greenBulb);

        Ellipse2D.Double blueBulb = new Ellipse2D.Double(START_X + UNIT, START_Y + UNIT * 7, UNIT * 2, UNIT * 2);
        g2.setColor(Color.BLUE);
        g2.fill(blueBulb);

        

    }


    
}
