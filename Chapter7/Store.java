package Chapter7;

import java.util.ArrayList;


public class Store {

	private ArrayList<Customer> customers;

	public Store() {
	  customers = new ArrayList<Customer>(); 
	}
	
	public void addSale(String customerName, double amount) {
	  Customer person = new Customer(customerName, amount);
	  customers.add(person);
	}
	
	public String nameOfBestCustomer() {
	  String bestCustomerName = "";
	  double largestAmount = 0;
	  for (int i = 0; i < customers.size(); i++) {
	    Customer person = customers.get(i);
	    
	    if (person.getAmount() > largestAmount) {
	    	bestCustomerName = person.getName();
	    	largestAmount = person.getAmount();  
			} 
		}
		
		return bestCustomerName;
	}
	
	
	public ArrayList<String> nameOfBestCustomers(int topN) {
		if (topN >= customers.size()) {
			topN = customers.size();
		}
	  
	  ArrayList<String> topNames = new ArrayList<String>();
	  
	  ArrayList<Customer> storeClone = new ArrayList<Customer>(customers);
	  
	  String bestCustomerName;
	  double largestAmount;
	  int index;
	  
	  for (int k = 0; k < topN; k++) {
	  	bestCustomerName = "";
	  	largestAmount = 0;
	  	index = 0;
	  	
	  	for (int i = 0; i < storeClone.size(); i++) {
	    	Customer person = storeClone.get(i);
	    
	    	if (person.getAmount() > largestAmount) {
	    		bestCustomerName = person.getName();
	    		largestAmount = person.getAmount();
	    		index = i; 
				} 
			}
			
			storeClone.remove(index);
			topNames.add(bestCustomerName);
		}
	  
	  return topNames;
	}
	
	
	  

	
	
	

}
