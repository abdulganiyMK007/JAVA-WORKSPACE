package Chapter3;



public class CarTester {

  public static void main(String[] args) {
  
  	CarGas myHybrid = new CarGas(50); // 50 miles per gallon 
  	
  	myHybrid.getGasInTank();
  	myHybrid.addGas(20); // Tank 20 gallons
  	myHybrid.getGasInTank();
  	myHybrid.addGas(50);
  	myHybrid.getGasInTank();
  	 
  	myHybrid.drive(100); // Drive 100 miles 
  	double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
  	
  	System.out.println("Gas left in tank: "+ gasLeft);

  }

}
