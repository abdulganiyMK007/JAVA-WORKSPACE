package Chapter3;

/*
Write a class Battery that models a rechargeable battery. A battery has a constructor public Battery(double capacity) where capacity is a value measured in milliampere hours. A typical AA battery has a  capacity of 2000 to 3000 mAh. The method public void drain(double amount) drains the capacity of the battery by the given amount. The method public void charge() charges the battery to its original capacity. The method public double getRemainingCapacity() gets the remaining capacity of the battery.
*/

public class Battery {

	
	private static final double MAX_CAPACITY = 3000;
	private static final double MIN_CAPACITY = 0;
	
	
	private double capacity;
	
	public Battery(double capacity) {
		this.capacity = capacity;
	}
	
	// drains the capacity of the battery by the given amount.
	public void drain(double amount) {
		capacity -= amount;
		if (capacity < MIN_CAPACITY) capacity = MIN_CAPACITY;
	}
	
	// Charges the battery to its original capacity.
	public void charge() {
		capacity = MAX_CAPACITY;
	}
	
	// Gets the remaining capacity of the battery.
	public double getRemainingCapacity() {
		return capacity;
	}
	

}
