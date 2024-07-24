package chapter2;

import java.awt.Rectangle;


public class FourRectanglePrinter {

    public static void main(String[] args) {
        final int WIDTH = 100;
        final int HEIGHT = 100;

        Rectangle box = new Rectangle(0, 0, WIDTH, HEIGHT);
        System.out.println(box);

        box.translate(WIDTH, 0);
        System.out.println(box);

        box.translate(0, HEIGHT);
        System.out.println(box);

        box.translate(-WIDTH, 0);
        System.out.println(box);

    }
    
}
