package Chapter3;

/*
Class Car implements the following properties. A car has a certain fuel efficiency (measured in miles/gallon or liters/km—pick one) and a certain amount of fuel in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, reducing the amount of gasoline in the fuel tank. Also supply methods getGasInTank, returning the current amount of gasoline in the fuel tank, and addGas, to add gasoline to the fuel tank.
*/

public class CarGas {
	
	private double gasEfficiency;
	private double gasLevel;

	public CarGas(double gasEfficiency) {
		this.gasEfficiency = gasEfficiency;
		gasLevel = 0;
	}
	
	public void addGas(double gas) {
		gasLevel += gas;
		System.out.println("Added gas: "+ gas);
	}

	public double getGasInTank() {
		System.out.println("Gas level: "+ gasLevel);
	  return gasLevel;
	}
	
	public void drive(double distance) {
		double gasConsumed = distance / gasEfficiency;
		System.out.println("Gas consumed: "+ gasConsumed);
		gasLevel -= gasConsumed;
	}

}
