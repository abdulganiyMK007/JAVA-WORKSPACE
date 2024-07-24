package Chapter4;

import java.util.Scanner;


public class DewTemperature {

	private static final double CONSTANT_A = 17.27;
	private static final double CONSTANT_B = 237.7;

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter the relative humidity (between 0 and 1): ");
  	double relativeHumidity = in.nextDouble();
  	
  	System.out.print("Enter the actual temperature (in Celsius): ");
  	double actualTemperature = in.nextDouble();
  	
  	double f = (CONSTANT_A * actualTemperature / (CONSTANT_B + actualTemperature)) + Math.log(relativeHumidity);
  	
  	double dewPointTemperarure = CONSTANT_B * f / (CONSTANT_A - f);
  	
		System.out.printf("Dew point temperature is %.2f", dewPointTemperarure);
		
		in.close();
		
  }

}
