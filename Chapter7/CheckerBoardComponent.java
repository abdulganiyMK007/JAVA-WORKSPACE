package Chapter7;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CheckerBoardComponent extends JComponent {

    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        final int SIZE = 20;
        final int STRAT_X = 50;
        final int STRAT_Y = 50;
        final int LENGTH = 10;

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                Rectangle square = new Rectangle(STRAT_X + SIZE * i, STRAT_Y + SIZE * j, SIZE, SIZE);
                Color fillColor = ((i + j) % 2 == 0) ? Color.BLUE : Color.CYAN;
                g2.setColor(fillColor);
                g2.fill(square);
            }
        }

    }
    
}
