package Chapter6;

import javax.swing.JFrame;

public class RoseViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rose Viewer");
        RoseComponent component = new RoseComponent();
        frame.add(component);
        frame.setVisible(true);
   }
    
}
