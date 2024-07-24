package Chapter3;



public class CashRegisterTester {

  public static void main(String[] args) {
  
  	CashRegister reg = new CashRegister();   			reg.recordPurchase(20.37);
  	reg.enterDollars(20);
  	reg.enterQuarters(2);
  	System.out.println("Change: " + 		reg.giveChange());
  	System.out.println("Expected: 0.13");
  
  
  	CashRegister register = new CashRegister(); 
  	register.recordPurchase(29.50);
  	register.recordPurchase(9.25);    
  	register.receivePayment(50);
  	
  	double change = register.giveChange();
  	System.out.println(change);   
  	System.out.println("Expected: 11.25");
  	
  	
  	System.out.println(register.getSalesCount());
  	System.out.println("Expected: 1");
  	System.out.println(register.getSalesTotal());
  	System.out.println("Expected: 38.75");
  	
  	System.out.println("Expected: 2");
  	System.out.println(register.getItemCount());
  	
  	register.printReceipt();
  	
  
  

  }

}
