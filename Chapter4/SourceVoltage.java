package Chapter4;

import java.util.Scanner;


public class SourceVoltage {

	private static final double POWER = 260;
	private static final double RESISTANCE = 10;
	private static final double VOLTAGE = 120;

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter the power factor: ");
  	double powerFactor = in.nextDouble();
  	
  	double sourceVoltage = Math.sqrt(Math.pow(VOLTAGE + 2 * RESISTANCE * POWER / VOLTAGE, 2) + Math.pow(2 * RESISTANCE * POWER / (powerFactor * VOLTAGE), 2) * (1 - Math.pow(powerFactor, 2)));
  	
  	System.out.printf("Source voltage is %.2f\n", sourceVoltage);
  	
  	in.close();

  }

}
