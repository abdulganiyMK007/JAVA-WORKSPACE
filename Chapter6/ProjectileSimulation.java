package Chapter6;
import java.util.Scanner;

public class ProjectileSimulation {

	private static final double DELTA_T = 0.01;
	private static final double ACCELERATION_G = 9.81;
	

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  
  	double initialVelocity, currentVelocity, currentDistance, formulaDistance, formulaVelocity, wholeTimer, fractionalTimer;
  	
  	formulaVelocity = formulaDistance = currentDistance = wholeTimer = fractionalTimer = 0;
  	
  	boolean backToEarth = false;
  	
  	System.out.print("Enter initial velocity: ");
  	initialVelocity = in.nextInt();
  	currentVelocity = initialVelocity;
  	
  	
  	while (true) {
  		for (int i = 0; i < 100; i++) {
  	  	currentVelocity -= ACCELERATION_G * DELTA_T;
  	  	currentDistance += currentVelocity * DELTA_T;
  	  	
  	  	if (currentDistance <= 0) {
  	  	  backToEarth = true;
  	  	  break;
  			}
  			
  			fractionalTimer += DELTA_T;
 	 	} 
 	 	
 	 	if (backToEarth) break;
 	 	
 	 	wholeTimer++;
 	 	formulaDistance = calcDistance(initialVelocity, wholeTimer);
 	 	formulaVelocity = calcVelocity(initialVelocity, wholeTimer); 
 	 	
  		
  		System.out.println("At time T = "+ wholeTimer);
  		System.out.printf("Simulated velocity: %.2f\n", currentVelocity);
  		
  		System.out.printf("Calculated velocity: %.2f\n", formulaVelocity);
  		
  		System.out.printf("Simulated distance: %.2f\n", currentDistance);
  		
  		System.out.printf("Calculated distance: %.2f\n", formulaDistance);
  		
  		System.out.println();
  		
  	}
  	
  	formulaDistance = calcDistance(initialVelocity, fractionalTimer);
 	 	formulaVelocity = calcVelocity(initialVelocity, fractionalTimer); 
  	
  	
  	System.out.printf("At time T = %.2f\n", fractionalTimer);
  	System.out.printf("Simulated velocity: %.2f\n", currentVelocity);
  		
  		System.out.printf("Calculated velocity: %.2f\n", formulaVelocity);
  		
  		System.out.printf("Simulated distance: %.2f\n", currentDistance);
  		
  		System.out.printf("Calculated distance: %.2f\n", formulaDistance);
  	
  	in.close();

  }
  
  
  private static double calcDistance(double velocity, double time) {
    return -(0.5 * ACCELERATION_G * time * time) + (velocity * time);
  }
  
  private static double calcVelocity(double velocity, double time) {
  	return velocity - ACCELERATION_G * time;
  }

}
