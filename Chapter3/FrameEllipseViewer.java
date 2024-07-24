package Chapter3;

import javax.swing.JFrame;


public class FrameEllipseViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Frame Ellipse Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameEllipseComponent component = new FrameEllipseComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    
}
