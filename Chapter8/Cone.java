
public class Cone {

    public static double volume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public static double surface(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

}
