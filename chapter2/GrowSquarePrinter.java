package chapter2;

import java.awt.Rectangle;

public class GrowSquarePrinter {
    
    public static void main(String[] args) {
        final int HEIGHT = 100;
        final int WIDTH = 100;
        final int SIZE = 50;

        Rectangle square = new Rectangle(WIDTH, HEIGHT, SIZE, SIZE);
        System.out.println(square);

        square.grow(SIZE/2, SIZE/2);
        square.translate(WIDTH/4, HEIGHT/4);
        System.out.println(square);




    }
}
