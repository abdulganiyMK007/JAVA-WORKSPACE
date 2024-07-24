package Chapter7;

import java.util.Arrays;


public class BarchartVertical {

	private static final String HASH = "*";
	private static final String SPACE = " ";
	private static final String BAR = "-";


  public static void main(String[] args) {
		//int[] data = {-2, -1, 1, 2, -3, 5, 7};
		int[] data = {-1, -5, 5, 2, 5, 7, -4};
		
		System.out.println(Arrays.toString(data));
		getChart(data);
		
		
  }
  
  private static String getChart(int[] data) {
    int largest = getLargest(data);
    int smallest = getSmallest(data);
    
    String chart = "";
    int aData = 0;
    
    for (int i = largest; i >= smallest; i--) {
      for (int j = 0; j < data.length; j++) {
        aData = data[j];
        
        if (i == 0) {
          chart += BAR + SPACE;
          continue;
        }
        
        if (aData > 0) {	
          chart += (aData < i && aData > 0 || i < 0) ? SPACE : HASH;
        } else {
          chart += (aData > i && aData < 0 || i > 0) ? SPACE : HASH;
        } 
        
        chart += SPACE;
      }
      chart += "\n";
      
    }
    
    System.out.println(chart);
    return chart;
    
  }
  
  
  private static int getSmallest(int[] array) {
  	int smallest = array[0];
    for (int i = 1; i < array.length; i++) {
      smallest = Math.min(smallest, array[i]);
    }
    
    //System.out.println(smallest);
    return smallest;
  }
  
  
  private static int getLargest(int[] array) {
  	int largest = array[0];
    for (int i = 1; i < array.length; i++) {
      largest = Math.max(largest, array[i]);
    }
    
    //System.out.println(largest);
    return largest;
  }
  
  /*aData = data[j];
        
        if (i == 0) {
          chart += BAR;
          continue;
        }
        
        if (aData > 0) {
          chart += (aData <= i) ? HASH : HASH;
        } else {
          chart += (aData >= i) ? SPACE : HASH;
        } */

}
