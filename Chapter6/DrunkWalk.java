package Chapter6;
import java.util.Random;

/*
•• P6.6 The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four directions and stumbles to the next intersection, then again randomly picks one of four directions, and so on. You might think that on average the drunkard doesn’t move very far because the choices cancel each other out, but that is not the case. Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100 intersections, starting at (0, 0), and print the ending location.
*/
public class DrunkWalk {

	private static final int X_INIT = 0;
	private static final int Y_INIT = 0;
	
	private static final int NUM_WALK = 100;
	
	private static final int N_DIRECTION = 4;
	
	private static final int NORTH = 0;
	private static final int EAST = 1;
	private static final int SOUTH = 2;
	//private static final int WEST = 3;
	
	
  public static void main(String[] args) {
  	Random gen = new Random();
  
  	int locationX = X_INIT;
  	int locationY = Y_INIT;
  	int direction = 0;
  	
  	for (int i = 0; i < NUM_WALK; i++) {
  		direction = gen.nextInt(N_DIRECTION);
  	  
  	  switch (direction) {
  	  	case NORTH:
  	  		locationY++; break;
  	  		
  	  	case EAST:
  	  		locationX++; break;
  	  		
  	  	case SOUTH:
  	  		locationY--; break;
  	  		
  	  	default:
  	  		locationX--; break;
 		 }
 		 
 		 //System.out.println("("+ locationX +", "+ locationY +")");
  	}
  	
  	System.out.println("("+ locationX +", "+ locationY +")");

  }

}
