package Chapter6;



public class FactorPrinter {

  public static void main(String[] args) {
  	FactorGenerator gen = new FactorGenerator(2520);
  	
  	while (gen.hasMoreFactors()) {
  	  gen.nextFactor();
  	}
  	
  	
  	FactorGenerator g = new FactorGenerator(256);
  	
  	while (g.hasMoreFactors()) {
  	  g.nextFactor();
  	}
  	


	}
  

}
