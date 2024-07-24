package chapter2;

import javax.swing.JFrame;

public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Two Centered Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent component = new TwoSquareComponent();
        // FaceComponent component = new FaceComponent();
        frame.add(component);

        frame.setVisible(true);
   }
}
