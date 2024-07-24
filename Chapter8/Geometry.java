
public class Geometry {

    public static double cubeVolume(double height) {
        return height * height * height;
    }

    public static double cubeSurface(double height) {
        return 6.0 * height * height;
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * radius * radius * radius;
    }

    public static double sphereSurface(double radius) {
        return 4.0 * radius * radius;
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double cylinderSurface(double radius, double height) {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    public static double coneVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public static double coneSurface(double radius, double height) {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

}
