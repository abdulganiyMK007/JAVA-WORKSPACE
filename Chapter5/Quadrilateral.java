package Chapter5;


/*
Write a program that reads in the xand y-coordinates of four corner points of a quadrilateral and prints out whether it is a square, a rectangle, a trapezoid, a rhombus, or none of those shapes.
*/
public class Quadrilateral {

	// Lengths
	private double l1;
	private double l2;
	private double l3;
	private double l4;
	
	// Angles
	private double a1;
	private double a2;
	private double a3;
	private double a4;
	
	// Diagonals
	private double d1;
	private double d2;
	
	
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		
		l1 = calculateLength(x1, y1, x2, y2);
		l2 = calculateLength(x2, y2, x3, y3);
		l3 = calculateLength(x3, y3, x4, y4);
		l4 = calculateLength(x4, y4, x1, y1);
		d2 = calculateLength(x1, y1, x3, y3);
		d1 = calculateLength(x2, y2, x4, y4);
		
		a1 = calculateAngle(d1, l4, l1);
		a2 = calculateAngle(d2, l1, l2);
		a3 = calculateAngle(d1, l2, l3);
		a4 = calculateAngle(d2, l3, l4);
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
	
	public double getLength4() {
		System.out.printf("Length 4: %.2f\n", l4);
		return l4;
	}
	
	public double getDiagonal1() {
		System.out.printf("Diagonal 1: %.2f\n", d1);
		return d1;
	}
	
	public double getDiagonal2() {
		System.out.printf("Diagonal 2: %.2f\n", d2);
		return d2;
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
	
	public double getAngle4() {
		System.out.printf("Angle 4: %.2f\n", a4);
		return a4;
	}
	
	
	public double getPerimeter() {
		double perimeter = l1 + l2 + l3 + l4;
		
		System.out.printf("Perimeter: %.2f\n", perimeter);
		return perimeter;
	}
  
  private double calculateLength(double x0, double y0, double x1, double y1) {
    return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2)); 
  }
  
  private double calculateAngle(double a, double b, double c) {
  	return Math.toDegrees(Math.acos((b * b + c * c - a * a)/(2 * b * c)));
  }
  
  
  public String type() {
  	String shape = "";
  
    if (hasEqualSides()) {
      if (hasEqualAngles()) {
        shape = "Square";
      } else {
        shape = "Rhombus";
      }
      
    } else if (hasEqualOppSides()) {
      if (hasEqualAngles()) {
        shape = "Rectangle";
      } else {
        shape = "Parallelogram";
      }
      
    } else {
      if (hasNoEqualSides()) {
        shape = "Trapezoid";
      } else {
        shape = "Kite/Trapezium";
      }
    }
    
    System.out.println(shape);
    return shape;
  }
  
  public boolean hasEqualSides() {
    return (l1 == l2 && l2 == l3 && l3 == l4);
  }
  
  public boolean hasEqualOppSides() {
    return (l1 == l3 && l2 == l4);
  }
  
  public boolean hasNoEqualSides() {
    return (l1 != l2 && l2 != l3 && l3 != l4);
  }
  
  public boolean hasEqualAngles() {
    return (a1 == a2 && a2 == a3 && a3 == a4);
  }
  
  
}





