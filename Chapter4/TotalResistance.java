package Chapter4;

import java.util.Scanner;


public class TotalResistance {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter value of resistance 1: ");
  	double R1 = in.nextDouble();
  	
  	System.out.print("Enter value of resistance 2: ");
  	double R2 = in.nextDouble();
  	
  	System.out.print("Enter value of resistance 3: ");
  	double R3 = in.nextDouble();


		double totalR = R1 + (R2 * R3 / (R2 + R3));
		System.out.printf("Equivalent resistance is %.2f", totalR);
		
		in.close();
  }

}
