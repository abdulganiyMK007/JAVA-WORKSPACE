package Chapter4;


/*
The constructor constructs an empty balloon. Supply these methods:
 
• void addAir(double amount) adds the given amount of air 

• double getVolume() gets the current volume
 
• double getSurfaceArea() gets the current surface area 

• double getRadius() gets the current radius

Supply a BalloonTester class that constructs a balloon, adds 100 cm3 of air, tests the three accessor meth ods, adds another 100 cm3 of air, and tests the accessor methods again.
*/
public class Balloon {

	private double volume;
	
	public Balloon() {
	  volume = 0;
	}
	
	
	public void addAir(double amount) {
		volume += amount;  
	}

	public double getVolume() {
		return volume;
	}
	
	public double getSurfaceArea() {
	  return 3 * volume / getRadius();
	}

	public double getRadius() {
		return Math.cbrt(3 * volume / Math.PI / 4);
	}




}
