package Chapter7;
import java.util.Scanner;


public class BarchartHorizontal {
	private static final String HASH = "*";
	private static final String SPACE = " ";
	private static final String LINE = "|";

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
		//int[] data = {-2, -1, 1, -2, -3, 5, 7};
		//String[] captions = {"Nigeria", "Uruguay", "China", "Zambia", "Haiti" , "USA", "Switzerland"};
		
		System.out.print("Enter number of data: ");
		int nValues = in.nextInt();
		
		String[] captions = new String[nValues];
		int[] values = new int[nValues];
		
		for (int i = 0; i < nValues; i++) {
			 System.out.print("Enter caption: ");
			 captions[i] = in.next();
			 
			 System.out.print("Enter value: ");
			 values[i] = in.nextInt();
		}
	
		//System.out.println(Arrays.toString(values));
		//System.out.println(Arrays.toString(captions));
		
		System.out.println();
		
		String barchart = getChart(values, captions);
		System.out.println(barchart);
		
		in.close();
  }
  
  
	private static String addCaption(String[] captions, int index) {
		int width = getCaptionsWidth(captions);
		String caption = "";
		
		for (int j = 0; j < width - captions[index].length(); j++) {
			caption += SPACE;
		}
		
		return (caption + captions[index]);
	} 
  
  
  private static String getChart(int[] data, String[] captions) {
  	int smallest = getSmallest(data);
  	int largest = getLargest(data);
  	String chart = "";
  	int aData = 0;
  	
    for (int i = 0; i < data.length; i++) {
    	aData = data[i];
    	chart += addCaption(captions, i) + ": ";
    	
		  for (int j = smallest; j <= largest; j++) {
		  	if (j == 0) {
		  		chart += LINE;
		  		continue;
		  	}
		  	
		  	if (aData < 0) {
		  		chart += (aData <= j && j < 0) ? HASH : SPACE;
				} else {
					chart += (aData >= j && j > 0) ? HASH : SPACE;
				}
		  	
		  }
		  chart += "\n";
		}
		
		return chart;
  }
  
  
  private static int getCaptionsWidth(String[] captions) {
		int longest = captions[0].length();
		for (int i = 0; i < captions.length; i++) {
			longest = Math.max(longest, captions[i].length());
		}
		
		return longest;
	}
  

  private static int getSmallest(int[] array) {
  	int smallest = array[0];
    for (int i = 1; i < array.length; i++) {
      smallest = Math.min(smallest, array[i]);
    }
    
    return smallest;
  }
  
  
  private static int getLargest(int[] array) {
  	int largest = array[0];
    for (int i = 1; i < array.length; i++) {
      largest = Math.max(largest, array[i]);
    }
    
    return largest;
  }
  
  
  

}
