package Chapter7;

import javax.swing.JFrame;


public class CheckerBoardViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Checkerboard Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CheckerBoardComponent component = new CheckerBoardComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
