package chapter2;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        JLabel label = new JLabel("Hello, your name!");
        label.setOpaque(true);
        label.setBackground(Color.GREEN.darker());
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setSize(frame.getWidth() * 2, frame.getHeight() * 2);

        
    }
}
