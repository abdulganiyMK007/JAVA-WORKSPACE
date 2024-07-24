package chapter2;

import javax.swing.JFrame;

public class FourRectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Four Rectangle Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FourRectangleComponent component = new FourRectangleComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
