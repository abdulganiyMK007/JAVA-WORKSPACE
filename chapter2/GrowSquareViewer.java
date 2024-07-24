package chapter2;

import javax.swing.JFrame;

public class GrowSquareViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Grow Square Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GrowSquareComponent component = new GrowSquareComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    
}
