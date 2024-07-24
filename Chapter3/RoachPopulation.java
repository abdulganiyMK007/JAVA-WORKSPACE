package Chapter3;

/*
Implement a class RoachPopulation that simulates the growth of a roach population. The constructor takes the size of the initial roach population. The breed method simulates a period in which the roaches breed, which doubles their population. The spray(double percent) method simulates spraying with insecticide, which reduces the population by the given percentage. The getRoaches method returns the current number of roaches. A program called RoachSimulation simulates a population that starts out with 10 roaches. Breed, spray to reduce the population by 10 percent, and print the roach count. Repeat three more times.
*/
public class RoachPopulation {


	private static final double DOUBLE = 2;
	private static final double HUNDRED = 100;
	
	private int roachSize;
	
	public RoachPopulation(int initialRoachSize) {
		roachSize = initialRoachSize;
	}
	
	public void breed() {
		roachSize *= DOUBLE;
		System.out.println("BREED: "+ roachSize);
	}
	
	public void spray(double percent) {
		
		System.out.println("SPRAY: "+ percent +"%, = "+ (roachSize * percent / HUNDRED));
		
		roachSize -= (roachSize * percent / HUNDRED);
	}
	
	public int getRoaches() {
		System.out.println("ROACH COUNT: "+ roachSize);
		return roachSize;  
	}
	
	

}
