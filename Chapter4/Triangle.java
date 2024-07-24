package Chapter4;


/*
In this project, you will perform calculations with triangles. A triangle is defined by xy-coordinates Your job is to compute the following properties of a given triangle: 

• the lengths of all sides
• the angles at all corners 
• the perimeter 
• the area 

Implement a Triangle class with appropriate methods. Supply a program that prompts a user for the corner point coordinates and produces a nicely formatted table of the triangle properties. •
*/
public class Triangle {

	// Coordinates
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	// Lengths
	private double l1;
	private double l2;
	private double l3;
	
	// Angles
	private double a1;
	private double a2;
	private double a3;
	
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1; 
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		
		l1 = calculateLength(x1, y1, x2, y2);
		l2 = calculateLength(x1, y1, x3, y3);
		l3 = calculateLength(x2, y2, x3, y3);
		
		a1 = calculateAngle(l1, l2, l3);
		a2 = calculateAngle(l2, l1, l3);
		a3 = calculateAngle(l3, l1, l2);
	}
	
	public double getLength1() {
		System.out.printf("Length 1: %.2f\n", l1);
		return l1;
	}
	
	public double getLength2() {
		System.out.printf("Length 2: %.2f\n", l2);
		return l2;
	}
	
	public double getLength3() {
		System.out.printf("Length 3: %.2f\n", l3);
		return l3;
	}
	
	public double getAngle1() {
		System.out.printf("Angle 1: %.2f\n", a1);
		return a1;
	}
	
	public double getAngle2() {
		System.out.printf("Angle 2: %.2f\n", a2);
		return a2;
	}
	
	public double getAngle3() {
		System.out.printf("Angle 3: %.2f\n", a3);
		return a3;
	}
	
	public double getArea() {
		double area = (x1 * y2 - x2 * y1 + x2 * y3 - x3 * y2 + x3 * y1 - x1 * y3) / 2;
		
		System.out.printf("Area: %.2f\n", area);
		return area;
	}
		
	public double getPerimeter() {
		double perimeter = l1 + l2 + l3;
		
		System.out.printf("Perimeter: %.2f\n", perimeter);
		return perimeter;
	}
  
  private double calculateLength(double x0, double y0, double x1, double y1) {
    return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2)); 
  }
  
  private double calculateAngle(double a, double b, double c) {
  	return Math.toDegrees(Math.acos((b * b + c * c - a * a)/(2 * b * c)));
  }
  
  
}





