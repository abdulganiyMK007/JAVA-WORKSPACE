package Chapter7;

public class Customer {

	private String name;
	private double amount;

	public Customer(String aName, double anAmount) {
	  name = aName;
	  amount = anAmount;
	}
	
	public String getName() {
	  return name;
	}
	
	public double getAmount() {
		return amount;  
	}

}
