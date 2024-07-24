package Chapter5;

import java.util.Scanner;
/*
compass needle points a given number of degrees away from North, measured clockwise. Write a program that reads the angle and prints out the nearest compass direction; one of N, NE, E, SE, S, SW, W, NW. In the case of a tie, prefer the nearest principal direction (N, E, S, or W).
*/
public class NeedleCompassDirection {

	//private static final double NORTH = 0;
	private static final double NORTH_EAST = 45;
	private static final double EAST = 90;
	private static final double SOUTH_EAST = 135;
	private static final double SOUTH = 180;
	private static final double SOUTH_WEST = 225;
	private static final double WEST = 270;
	private static final double NORTH_WEST = 315;
	
	private static final double ANGLE_AT_A_POINT = 360;
	
	private static final String NORTH_INIT = "N";
	private static final String NORTH_EAST_INIT = "NE";
	private static final String EAST_INIT = "E";
	private static final String SOUTH_EAST_INIT = "SE";
	private static final String SOUTH_INIT = "S";
	private static final String SOUTH_WEST_INIT = "SW";
	private static final String WEST_INIT = "W";
	private static final String NORTH_WEST_INIT = "NW";
	

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double angle = 0;
		String answer = "";
		
		
		// while (true) {
		System.out.print("Enter angle (in degrees): ");
		if (in.hasNextDouble()) {
		  angle = Math.abs(in.nextDouble() % ANGLE_AT_A_POINT);
		  System.out.println(angle);
		} else {
		  System.out.println("Not a valid angle value.");
		}
		
		
		
		if (angle <= NORTH_EAST) {
		
			answer = (angle <= NORTH_EAST / 2) ? NORTH_INIT : NORTH_EAST_INIT;
			
		} else if (angle <= EAST) {
		
		  answer = (angle <= EAST / 2) ? NORTH_EAST_INIT : EAST_INIT;
		  
		} else if (angle <= SOUTH_EAST) {
		
		  answer = (angle <= SOUTH_EAST / 2) ? EAST_INIT : SOUTH_EAST_INIT;
		  
		} else if (angle <= SOUTH) {
		
			answer = (angle <= SOUTH / 2) ? SOUTH_EAST_INIT : SOUTH_INIT;
			
		} else if (angle <= SOUTH_WEST) {
		
			answer = (angle <= SOUTH_WEST / 2) ? SOUTH_INIT : SOUTH_WEST_INIT;
		  
		} else if (angle <= WEST) {
		
			answer = (angle <= WEST / 2) ? SOUTH_WEST_INIT : WEST_INIT;
		  
		} else if (angle <= NORTH_WEST) {
		
			answer = (angle <= NORTH_WEST / 2) ? WEST_INIT : NORTH_WEST_INIT;
		  
		} else {
		
			answer = (angle <= ANGLE_AT_A_POINT / 2) ? NORTH_WEST_INIT : NORTH_INIT;
		  
		}
		
		System.out.println(answer);
		in.close();
		
		
		//}
		
  }

}
