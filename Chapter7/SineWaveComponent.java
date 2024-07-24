package Chapter7;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SineWaveComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        final int STEP_DEGREE = 2;
        final int NUM_OF_CYCLE = 1;
        final int WAVE_WIDTH = 450;
        final int WAVE_HEIGHT = 500;
  
        SineWave sw = new SineWave(STEP_DEGREE, NUM_OF_CYCLE, WAVE_WIDTH, WAVE_HEIGHT);
        sw.draw(g2);
    }
}

