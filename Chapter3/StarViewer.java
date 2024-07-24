package Chapter3;

import javax.swing.JFrame;

public class StarViewer {

    public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setSize(600, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      StarComponent component = new StarComponent();
      frame.add(component);
      frame.setVisible(true);
   }
    
}
