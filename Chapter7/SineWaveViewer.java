package Chapter7;

import javax.swing.JFrame;

public class SineWaveViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Sine Wave Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SineWaveComponent component = new SineWaveComponent();
        frame.add(component);

        frame.setVisible(true);
    }

    
}
