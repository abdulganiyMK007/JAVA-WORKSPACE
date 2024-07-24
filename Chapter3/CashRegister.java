package Chapter3;

public class CashRegister {

	public static final double QUARTER_VALUE = 0.25;  	
public static final double DIME_VALUE = 0.1;  		
public static final double NICKEL_VALUE = 0.05;  
	public static final double PENNY_VALUE = 0.01;
	
	private double purchase, payment;
	private String priceList;
	private double priceTotal, salesTotal;
	private int salesCount, itemCount;
	
	
	/**
	Constructs a cash register with no money in it.
	*/  
	public CashRegister() {
	  purchase = payment = 0;
	  priceList = "Price List:\n";
	  priceTotal = salesTotal = 0;
	  salesCount = itemCount = 0;
	}   
	
	
	/**   
	Records the sale of an item.   
	@param amount the price of the item  
	*/  
	public void recordPurchase(double amount) {
	  purchase += amount;
	  priceList += amount + "\n";
	  priceTotal += amount;
	  itemCount++;
	}   
	
	
	/**
	Processes a payment received from the customer.
	@param amount the amount of the payment  
	*/  
	public void receivePayment(double amount) {
	  payment += amount;
	}   


	/**   
	Computes the change due and resets the machine for the next customer.   
	@return the change due to the customer  
	*/  
	public double giveChange() {
	  double change = payment - purchase; 
	  salesTotal += purchase;
	  salesCount++;
	  purchase = 0;  
	  payment = 0; 
	  return change;
	} 


	public void printReceipt() {
	  System.out.println(priceList +"Total: "+ priceTotal);
	}
	
	public void enterDollars(double amount) {
	  payment += amount;
	}
	
	public void enterQuarters(double amount) {
	  payment += amount * QUARTER_VALUE;
	}
	
	public void enterDimes(double amount) {
	  payment += amount * DIME_VALUE;
	}
	
	public void enterNickels(double amount) {
	  payment += amount * NICKEL_VALUE;
	}
	
	public void enterPennies(double amount) {
	  payment += amount * PENNY_VALUE;
	}
	
	public double getSalesTotal() {
	  return salesTotal;
	}
	
	public int getSalesCount() {
	  return salesCount;
	}
	
	public void reset() {
	  salesTotal = 0;
	  salesCount = 0;
	}
	
	public int getItemCount() {
	  return itemCount;
	}


}
