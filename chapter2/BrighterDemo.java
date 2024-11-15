package chapter2;

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Brighter Demo Frame");
        Color myColor = new Color(50, 100, 150);
        myColor.brighter().brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}