package chapter20;

import javax.swing.JFrame;

public class CalculatorViewer1 {
   public static void main(String[] args) {
      JFrame frame = new CalculatorFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Calculator");
      frame.setVisible(true);
   }
}
