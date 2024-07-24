package chapter15;

import java.util.Objects;

public class LabeledPoint {

    private int point_x;
    private int point_y;
    private String point_label;

    LabeledPoint(int x, int y, String label) {
        point_x = x;
        point_y = y;
        point_label = label;
    }

    public int hashCode() {
        return Objects.hash(point_x, point_y, point_label);
    }

    public boolean equals(int x, int y, String label) {
        return ((point_x == x) && (point_y == y) && (point_label.equals(label)));
    }
    
}
