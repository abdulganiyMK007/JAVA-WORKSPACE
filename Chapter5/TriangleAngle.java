package Chapter5;
import java.util.Scanner;


/*
Write a program that reads in the x and y-coordinates of three corner points of a triangle and prints out whether it has an obtuse angle, a right angle, or only acute angles.
*/

public class TriangleAngle {

	private static final double RIGHT_ANGLE = 90;
	private static final double DECIMAL_PLACE = 2;

  public static void main(String[] args) {
  
  	double x1, y1, x2, y2, x3, y3, angle;
  	x1 = y1 = x2 = y2 = x3 = y3 = angle = 0;
  	
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter point 1 coordinate (x1, y1): ");
  	x1 = in.nextDouble();
		y1 = in.nextDouble();
		
		System.out.print("Enter point 2 coordinate (x2, y2): ");
  	x2 = in.nextDouble();
		y2 = in.nextDouble();

		System.out.print("Enter point 3 coordinate (x3, y3): ");
  	x3 = in.nextDouble();
		y3 = in.nextDouble();

		Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
		
  
  	angle = Math.round(tri.getAngle2() * Math.pow(10, DECIMAL_PLACE)) / Math.pow(10, DECIMAL_PLACE);
  	
  	System.out.println("Angle is "+ angle);
  	
  	if (angle == RIGHT_ANGLE) {
  	  System.out.println("RIGHT ANGLE.");
  	  
  	} else if (angle > RIGHT_ANGLE) {
  	  System.out.println("OBTUSE ANGLE.");
  	  
  	} else {
  	  System.out.println("ACUTE ANGLE.");
  	}
  	

		in.close();
  }
  
  

}
