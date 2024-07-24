package Chapter4;

import java.util.Scanner;


public class TriangleTester {

  public static void main(String[] args) {
  	double x1, y1, x2, y2, x3, y3;
  	x1 = y1 = x2 = y2 = x3 = y3 = 0;
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter point 1 x-coordinate: ");
  	x1 = in.nextDouble();
  	
  	System.out.print("Enter point 1 y-coordinate: ");
		y1 = in.nextDouble();
		
		System.out.print("Enter point 2 x-coordinate: ");
  	x2 = in.nextDouble();
  	
  	System.out.print("Enter point 2 y-coordinate: ");
		y2 = in.nextDouble();

		System.out.print("Enter point 3 x-coordinate: ");
  	x3 = in.nextDouble();
  	
  	System.out.print("Enter point 3 y-coordinate: ");
		y3 = in.nextDouble();

		Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
		
		
		tri.getLength1();
		tri.getLength2();
		tri.getLength3();
		tri.getAngle1();
		tri.getAngle2();
		tri.getAngle3();
		tri.getArea();
		tri.getPerimeter();
		
		
		in.close();
  }

}
