package Chapter4;

import java.util.Scanner;


/*
Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.
*/
public class MeterToInchFeetMile {

	private static final double INCH_PER_METER = 39.37;
	private static final double FOOT_PER_INCH = 12;
	private static final double MILE_PER_FOOT = 5280;
	//private static final int SENTINEL = 0;
	
	

  public static void main(String[] args) {
		
		double meter, inch, feet, mile;
		meter = inch = feet = mile = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program prompts the user for a measurement in meters and then converts it to miles, feet and inches.\n Enter 0 ro wnd program.\n");
		while (true) {
			System.out.print("Enter a measurement in meters: ");
			meter = sc.nextDouble();
			
			if (meter == 0) break;
			
			inch = meter * INCH_PER_METER;
			feet = inch * FOOT_PER_INCH;
			mile = feet * MILE_PER_FOOT;
			
			String format = "Meter: %5.2f\nInch: %5.2f\nFoot: %5.2f\nMile: %5.2f\n\n";
			System.out.printf(format, meter, inch, feet, mile);
			
			
		  
		}
		
		sc.close();
		
  }

}
