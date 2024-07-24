package Chapter7;

public class AlternateSum {

  public static void main(String[] args) {
		double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		double[] twosArr = {2, 2, 2, 2, 2, 2, 2, 2};
		
		alternateSum(values);
		alternateSum(twosArr);
  }
  
  private static double alternateSum(double[] array) {
  	double sum = 0;
  	
  	for (int i = 0; i < array.length; i++) {
  		if (i % 2 == 0) {
  		  sum += array[i];
  		} else {
  		  sum -= array[i];
  		}
  		
  	}
  	
  	System.out.println("SUM :"+ sum);
  	return sum;
    
  }

}
