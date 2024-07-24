package Chapter7;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class SineWave {

    private static final Color COLOR = Color.BLUE;
    private static final int ANGLE_AT_A_POINT = 360;
    private static final int START_X = 20;
    private static final int START_Y = 300;
    
    private int stepDegree;
    private int numOfCycle;
    private int graphWidth;
    private int graphHeight;
    
    public SineWave(int stepDegree, int numOfCycle, int graphWidth, int graphHeight) {
        this.stepDegree = stepDegree;
        this.numOfCycle = numOfCycle;
        this.graphWidth = graphWidth;
        this.graphHeight = graphHeight;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(COLOR);

        int numPoints = (ANGLE_AT_A_POINT * numOfCycle / stepDegree);
        final int UNIT_WIDTH = graphWidth / numPoints;

        for (int i = 0; i <= numPoints; i++) {
            int x = START_X + UNIT_WIDTH * i;
            double radAngle = Math.toRadians(stepDegree * i);
            Line2D.Double line = new Line2D.Double(x, START_Y, x, (START_Y + graphHeight / 2 * Math.sin(radAngle)));
            g2.draw(line);
        }

    }
    
}
