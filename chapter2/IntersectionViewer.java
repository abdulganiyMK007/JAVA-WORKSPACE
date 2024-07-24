package chapter2;

import javax.swing.JFrame;

public class IntersectionViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Intersection Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        IntersectionComponent component = new IntersectionComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    
}
