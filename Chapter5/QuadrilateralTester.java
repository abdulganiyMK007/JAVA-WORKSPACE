package Chapter5;
import java.util.Scanner;


public class QuadrilateralTester {

  public static void main(String[] args) {
  
  double x1, y1, x2, y2, x3, y3, x4, y4;
  	x1 = y1 = x2 = y2 = x3 = y3 = x4 = y4 = 0;
  
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
		
		System.out.print("Enter point 4 coordinate (x4, y4): ");
  	x4 = in.nextDouble();
		y4 = in.nextDouble();
  	
  	
  	Quadrilateral tri = new Quadrilateral(x1, y1, x2, y2, x3, y3, x4, y4);
  	
  	
  	/* Square */
  	//Quadrilateral tri = new Quadrilateral(1, 3, 3, 3, 3, 1, 1, 1);
  	
  	/* Rectangle */
  	//Quadrilateral tri = new Quadrilateral(1, 3, 2, 3, 2, 1, 1, 1);
  	
  	/* Trapezium */
  	//Quadrilateral tri = new Quadrilateral(1, 3, 2, 3, 3, 1, 1, 1);
  	
  	/* Square */
  	//Quadrilateral tri = new Quadrilateral(1, 2, 2, 2, 2, 1, 1, 1);
  	
  	/* Trapezoid */
  	//Quadrilateral tri = new Quadrilateral(1, 1, 1, 2, 2, 3, 6, 0);
  	
  	
  	
  	tri.getLength1();
		tri.getLength2();
		tri.getLength3();
		tri.getLength4();
		tri.getDiagonal1();
		tri.getDiagonal2();
		tri.getAngle1();
		tri.getAngle2();
		tri.getAngle3();
		tri.getAngle4();
		tri.getPerimeter();
		tri.type();
		
		
		in.close();
		
  }
  
  
}
