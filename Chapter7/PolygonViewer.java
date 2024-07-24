package Chapter7;

import javax.swing.JFrame;

public class PolygonViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Polygon Viewer");
        PolygonComponent component = new PolygonComponent();
        frame.add(component);
        frame.setVisible(true);
   }
    
}
