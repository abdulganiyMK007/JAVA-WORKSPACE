package Chapter4;

import java.util.Scanner;


public class LiquidTemperature {

	private static final double CELSIUS_KELVIN_DIFFERENCE = 273;
	private static final double CONSTANT_BETA = 3969;
	private static final double CONSTANT_TEMPERATURE = 85 + CELSIUS_KELVIN_DIFFERENCE;
	private static final double CONSTANT_RESISTANCE = 1075;
	
	

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	 
  	System.out.print("Enter value of the thermistor resistance: ");
  	double resistance = in.nextDouble();
  	
  	double temperature = CONSTANT_BETA * CONSTANT_TEMPERATURE / (CONSTANT_TEMPERATURE * Math.log(resistance / CONSTANT_RESISTANCE) + CONSTANT_BETA) - CELSIUS_KELVIN_DIFFERENCE;
  	
  	System.out.printf("Liquid temperature is %.2f", temperature);
  	
  	in.close();

  }

}
