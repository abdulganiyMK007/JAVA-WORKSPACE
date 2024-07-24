package Chapter6;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class GraphCurveComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        double[] function = {200, 4, -0.03, 0.00005};
        final int X_MIN = 0;
        final int X_MAX = 400;

        GraphCurve graph1 = new GraphCurve(function, X_MIN, X_MAX);
        graph1.draw(g2);

    }
    
}
