package Chapter5;
import java.util.Scanner;


public class CometJumpEscape {

	// Halley's comet radius
	private static final double RADIUS = 1.153E+6;

	// Halley's comet mass
	private static final double MASS = 1.3E+22;
	
	// Gravitational constant
	private static final double GRAVITATIONAL_CONSTANT = 6.67E-11;



  public static void main(String[] args) {
  
  	double vel, escapeVel, newMass;
  	vel = escapeVel = newMass = 0;
  	
  	escapeVel = Math.sqrt(2 * GRAVITATIONAL_CONSTANT * MASS / RADIUS);
  	
  	//System.out.println("Escape Velocity on comet is: "+ escapeVel + "m/s");
  	
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter velocity in mph: ");
  	vel = toMeterPerSecond(in.nextDouble());
  	
  	
  	if (vel > escapeVel) {
  	  System.out.println("Jumper will escape");
  	  
  	  newMass = escapeVel * escapeVel * RADIUS / (2 * GRAVITATIONAL_CONSTANT);
  	  
  	  System.out.println("The comet must be "+ (newMass - MASS) +"kg much more massive in order for the jumper to return to the surface.");
  	  
  	} else {
  	  System.out.println("Jumper will return to the surface");
  	}
  	
		in.close();
  }
  
  // Converts (mile per hr) to (meter per secs)
  private static double toMeterPerSecond(double velocity) {
    return velocity / 2.237;
  }

}
