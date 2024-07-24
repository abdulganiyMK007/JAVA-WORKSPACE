package Chapter4;

import java.util.Scanner;


public class TurningCircuit {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter frequency: ");
  	double freq = in.nextDouble();
  	
  	System.out.print("Enter minimum capacitance: ");
  	double Cmin = in.nextDouble();
  	
  	System.out.print("Enter maximum capacitance: ");
  	double Cmax = in.nextDouble();
  	
  	
  	double inductance = Math.pow(0.5 * Math.PI * freq, -2) / Math.sqrt(Cmin * Cmax);
  	
  	double minFreq = 1 / (2 * Math.PI * Math.sqrt(inductance * Cmin));
  	
  	double maxFreq = 1 / (2 * Math.PI * Math.sqrt(inductance * Cmax));
  	
  	
		System.out.printf("Minimum frequency: %.2f\n", minFreq);

		System.out.printf("Maximum frequency: %.2f\n", maxFreq);
		
		in.close();
  }

}
