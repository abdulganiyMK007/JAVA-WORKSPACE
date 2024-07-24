package Chapter3;

import javax.swing.JFrame;

public class OlympicRingViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 500);
        frame.setTitle("Olympic Ring Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OlympicRingComponent component = new OlympicRingComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    
}
