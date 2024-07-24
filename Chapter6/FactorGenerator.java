package Chapter6;

public class FactorGenerator {
	
	private String factors;
	private int currentFactorPosition;

	public FactorGenerator(int numberToFactor) {
	  factors = "";
	  currentFactorPosition = 0;
	  getFactors(numberToFactor);
	}
	
	
	public int nextFactor() {
		int currentFactor = Integer.parseInt("" + factors.charAt(currentFactorPosition));
		currentFactorPosition++;
		
		//System.out.println(currentFactor);
		return currentFactor;
	} 
	
	public boolean hasMoreFactors() {
		return currentFactorPosition < factors.length();
	}
	
	private void getFactors(int numberToFactor) {

			while (numberToFactor % 2 == 0) {
				factors += (2 + "");
				numberToFactor /= 2;
			}
       
			for (int i = 3; i <= Math.sqrt(numberToFactor); i += 2) {
				while (numberToFactor % i == 0) {
					factors += (i + "");
					numberToFactor /= i;
				}
      
				if (numberToFactor > 2) 
					factors += (numberToFactor + "");
			}
		
		//System.out.println(factors);
		
	}
     

	

}
