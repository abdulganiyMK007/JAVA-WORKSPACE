package chapter2;

import java.awt.Rectangle;

public class CenteredSquaresPrinter {

    public static void main(String[] args) {
    
        final int HEIGHT = 100;
        final int WIDTH = 100;
        final int SIZE = 50;

        Rectangle square = new Rectangle(WIDTH, HEIGHT, SIZE, SIZE);
        System.out.println(square);

        square.grow(SIZE/2, SIZE/2);
        System.out.println(square);

    
    }
    
}
