package Chapter6;

import javax.swing.JFrame;

public class GraphCurveViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Graph Curve Viewer");
        GraphCurveComponent component = new GraphCurveComponent();
        frame.add(component);
        frame.setVisible(true);
   }
    
}
