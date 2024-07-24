package Chapter6;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class GraphCurve {

    private double[] function;
    private final int DEV;
    private final int N_LINES = 100;

    public GraphCurve(double[] func, int xMin, int xMax) {
        function = func;
        DEV = (xMax - xMin) / 100;
    }

    public void draw(Graphics2D g2) { 
        int point_X1, point_X2, point_Y1, point_Y2;

        for (int i = 0; i < N_LINES; i++) {
            point_X1 = i;
            point_X2 = point_X1 + DEV;
            point_Y1 = 0;
            point_Y2 = 0;

            for (int j = 0; j < function.length; j++) {
                point_Y1 += function[j] * Math.pow(i, j);
                point_Y2 += function[j] * Math.pow(i + DEV, j);
            }
             
            Line2D.Double line = new Line2D.Double(point_X1, point_Y1, point_X2, point_Y2);
            g2.draw(line);
            
            
        }

    }
}