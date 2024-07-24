
public class Cylinder {

    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double surface(double radius, double height) {
        return 2.0 * Math.PI * radius * (radius + height);
    }

}
