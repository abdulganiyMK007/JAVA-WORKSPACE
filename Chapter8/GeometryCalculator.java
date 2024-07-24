
import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter height: ");
        double height = in.nextDouble();

        System.out.println("[--- From Geometry Class ---]");
        System.out.println("Cube Volume: " + Geometry.cubeVolume(radius));
        System.out.println("Cube Surface: " + Geometry.cubeSurface(radius));
        System.out.println("Sphere Volume: " + Geometry.sphereVolume(radius));
        System.out.println("Sphere Surface: " + Geometry.sphereSurface(radius));
        System.out.println("Cylinder Volume: " + Geometry.cylinderVolume(radius, height));
        System.out.println("Cylinder Surface: " + Geometry.cylinderSurface(radius, height));
        System.out.println("Cone Volume: " + Geometry.coneVolume(radius, height));
        System.out.println("Cone Surface: " + Geometry.coneSurface(radius, height));

        System.out.println("[--- From Cube Class ---]");
        System.out.println("Cube Volume: " + Cube.volume(radius));
        System.out.println("Cube Surface: " + Cube.surface(radius));
        System.out.println("[--- From Sphere Class ---]");
        System.out.println("Sphere Volume: " + Sphere.volume(radius));
        System.out.println("Sphere Surface: " + Sphere.surface(radius));
        System.out.println("[--- From Cylinder Class ---]");
        System.out.println("Cylinder Volume: " + Cylinder.volume(radius, height));
        System.out.println("Cylinder Surface: " + Cylinder.surface(radius, height));
        System.out.println("[--- From Cone Class ---]");
        System.out.println("Cone Volume: " + Cone.volume(radius, height));
        System.out.println("Cone Surface: " + Cone.surface(radius, height));

        in.close();

    }

}
