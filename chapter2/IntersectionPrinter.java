package chapter2;

import java.awt.Rectangle;

public class IntersectionPrinter {

    public static void main(String[] args) {
        final int EDGE_X = 100;
        final int EDGE_Y = 100;
        final int SIZE = 50;

        Rectangle rect1 = new Rectangle(EDGE_X, EDGE_Y, SIZE, SIZE);
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(EDGE_X + SIZE/2, EDGE_Y + SIZE/2, SIZE, SIZE);
        System.out.println(rect2);

        Rectangle rect3 = rect1.intersection(rect2);
        System.out.println(rect3);

    }
    
}
