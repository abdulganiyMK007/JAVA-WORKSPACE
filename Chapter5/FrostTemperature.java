package Chapter5;

import java.util.Scanner;

public class FrostTemperature {

	private static final double CELSIUS_KELVIN_DIFFERENCE = 273;
	private static final double BETA = 3310;
	private static final double TEMPERATURE_T0 = 40 + CELSIUS_KELVIN_DIFFERENCE;
	private static final double RESISTANCE_R0 = 33192;
	private static final double RESISTANCE_R2 = 156300;
	private static final double RESISTANCE_R3 = RESISTANCE_R2;
	private static final double RESISTANCE_R4 = RESISTANCE_R2;

  public static void main(String[] args) {
  
  	double temp = 0;
  	double resistance = 0;
  	boolean soundAlarm = false;

  	Scanner in = new Scanner(System.in);
  	
  	// Enter -5.45
  	System.out.print("Enter temperature (in F): ");
  	temp = fahrenheitToKelvin(in.nextDouble());
  	
  	resistance = RESISTANCE_R0 * Math.exp(BETA * (1 / temp - 1 / TEMPERATURE_T0));
  	
  	System.out.println("Resistance: "+ resistance);
  	
   	soundAlarm = (RESISTANCE_R2 / (resistance + RESISTANCE_R2)) < (RESISTANCE_R4 / (RESISTANCE_R3 + RESISTANCE_R4));
   	
   	if (soundAlarm) {
   	  System.out.println("Sound Alarm");
   	} else {
     	System.out.println("Don\'t sound Alarm");
   	}

		in.close();
  }
  
  
  private static double fahrenheitToKelvin(double temp) {
   return (temp - 32) * 5 / 9 + CELSIUS_KELVIN_DIFFERENCE; 
  }

}
