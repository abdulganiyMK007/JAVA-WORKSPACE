package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class MyFaceComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        final int START_X = 50;
        final int START_Y = 50;
        final int HEAD_SIZE = 150;
        final int EYE_SIZE = HEAD_SIZE / 15;

        g2.setColor(Color.BLUE);

        Ellipse2D.Double head = new Ellipse2D.Double(START_X, START_Y, HEAD_SIZE, HEAD_SIZE);
        g2.draw(head);

        Ellipse2D.Double eye1 = new Ellipse2D.Double(START_X + HEAD_SIZE / 4, START_Y + HEAD_SIZE / 3, EYE_SIZE, EYE_SIZE);
        g2.fill(eye1);

        Ellipse2D.Double eye2 = new Ellipse2D.Double(START_X + HEAD_SIZE * 3 / 4 - EYE_SIZE, START_Y + HEAD_SIZE / 3, EYE_SIZE, EYE_SIZE);
        g2.fill(eye2);

        int x1 = START_X + HEAD_SIZE / 4 - EYE_SIZE / 2;
        int y1 = START_Y + HEAD_SIZE * 2 / 3;
        int x2 = START_X + HEAD_SIZE * 3 / 4 + EYE_SIZE / 2;
        int y2 = START_Y + HEAD_SIZE * 2 / 3;
        Line2D.Double mouth = new Line2D.Double(x1, y1, x2, y2);
        g2.draw(mouth);
        


    }
    
}
