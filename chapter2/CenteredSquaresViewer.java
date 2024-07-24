package chapter2;

import javax.swing.JFrame;

public class CenteredSquaresViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Centered Squares Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CenteredSquaresComponent component = new CenteredSquaresComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    
}
