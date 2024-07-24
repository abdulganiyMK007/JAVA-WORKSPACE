package Chapter6;
import java.util.Scanner;

public class HullModel {

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the beam (B): ");
		double beam = in.nextDouble();
		
		System.out.print("Enter the length (L): ");
		double length = in.nextDouble();
		
		System.out.print("Enter the draft (T): ");
		double draft = in.nextDouble();
		
		System.out.print("Enter the value of point x (x): ");
		double pointX = in.nextDouble();
		
		System.out.print("Enter the increment (n): ");
		double increment = in.nextDouble();
		
		int size = (int) (beam / increment);
		
		double pointZ = 0;
		
		double pointY1, pointY2;
		pointY1 = pointY2 = 0;
		
		double area = 0;
		
		do {
		
			pointZ -= size;
			
		  pointY2 = (beam / 2) * (1 - Math.pow(2 * pointX / length, 2)) * (1 - Math.pow((pointZ / draft), 2));
		  
		  area += (pointY1 + pointY2) * pointZ;
		  
		  pointY1 = pointY2;
		  
		} while (pointZ > -beam);
		
	
	
		System.out.println("Area: "+ area);
		
		in.close();
  }
  
  

}
