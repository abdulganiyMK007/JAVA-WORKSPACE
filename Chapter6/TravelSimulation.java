package Chapter6;

import java.util.Random;

/*
In a travel simulation, Harry will visit one of his friends that are located in three states. He has ten friends in California, three in Nevada, and two in Utah. How do you produce a random number between 1 and 3, denoting the destination state, with  a probability that is proportional to the number of friends in each state?
*/

public class TravelSimulation {

  public static void main(String[] args) {
 
		// Run 15 times
		for (int i = 0; i < 15; i++) {
		  System.out.println(chooseCity());
		}
  }
  
  
  private static String chooseCity() {
    Random gen = new Random();
    
    /*
    2 friends in Utah (0, 1)
    3 friends in Nevada (2, 3, 4)
    10 friends in Calofornia (5 - 14) both inclusive
    */
    
    switch (gen.nextInt(15)) {
      case 0: case 1:
      	return "3: Utah";
      	
      case 2: case 3: case 4:
      	return "2: Nevada";
      	
      default:
      	return "1: California";
    }
  }

}
