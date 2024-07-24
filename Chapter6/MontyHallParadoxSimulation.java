package Chapter6;
import java.util.Random;


public class MontyHallParadoxSimulation {

	private static final int N_DOORS = 3;
	private static final int N_SIMULATIONS = 1000;

  public static void main(String[] args) {
  
  	int winsCount = 0;
  	boolean switchDoor = true;
  	boolean isAWin = false;
  	
  	// Strategy 1: Player switch door
  	for (int i = 0; i < N_SIMULATIONS; i++) {
  		isAWin = simulate(switchDoor);
  		if (isAWin) winsCount++;
  	}
  	System.out.println("Strategy 1 wins: "+ winsCount);
  	
  	
  	// Strategy 2: Player stick to door
  	switchDoor = false;
  	winsCount = 0;
  	for (int i = 0; i < N_SIMULATIONS; i++) {
  		isAWin = simulate(switchDoor);
  		if (isAWin) winsCount++;
  	}
  	
  	System.out.println("Strategy 2 wins: "+ winsCount);
  	

  }
  
  private static boolean simulate(boolean switchDoor) {
  	Random rgen = new Random();
  	
  	int doorWithCar, doorPlayerPicked, doorHostPicked;
  	
  	doorWithCar = 1 + rgen.nextInt(N_DOORS);
    doorPlayerPicked = 1 + rgen.nextInt(N_DOORS);
    
    
    do {
      doorHostPicked = 1 + rgen.nextInt(N_DOORS);
    } while (doorHostPicked == doorWithCar || doorHostPicked == doorPlayerPicked);
    
    //System.out.println("Car D: "+ doorWithCar);
    //System.out.println("Player D: "+ doorPlayerPicked);
    //System.out.println("Host D: "+ doorHostPicked);
    
       
    if (switchDoor) {
    	double swapDoor = doorPlayerPicked; 
    	
      do {
      	doorPlayerPicked = 1 + rgen.nextInt(N_DOORS);
    } while (doorPlayerPicked == doorHostPicked ||  doorPlayerPicked == swapDoor);
    }
    
    //System.out.println("Switch D: "+ doorPlayerPicked);
    
    if (doorWithCar == doorPlayerPicked) {
      return true;
    } else {
      return false;
    }
  }

}
