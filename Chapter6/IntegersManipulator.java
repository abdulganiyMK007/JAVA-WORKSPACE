package Chapter6;
import java.util.Scanner;


/*
Write programs that read a sequence of integer inputs and print 

a. The smallest and largest of the inputs. 

b. The number of even and odd inputs. 

c. Cumulative totals. For example, 
if the input is 
1 7 2 9, 
the program should print
1 8 10 19. 

d. All adjacent duplicates. 
For example, if the input is 
1 3 3 4 5 5 6 6 6 2, 
the program should print 
3 5 6.

*/

public class IntegersManipulator {

  public static void main(String[] args) {
  	int input, valueCounter, smallest, largest, evenCounter, oddCounter, total, aDuplicate;
  	
  	input = valueCounter = smallest = largest = evenCounter = oddCounter = total = aDuplicate = 0;
  	
  	
  	String cumTotal = "";
  	String sDuplicate = "";
  	//boolean test = false;
  	
  	
  
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter sequence integer (end with any letter): ");
  	
  	while (in.hasNextInt()) {
  		
  		//System.out.println("Start");
  		input = in.nextInt();
  		
  		valueCounter++;
  		
  		// (ai) Smallest input
  		if (valueCounter == 1) {
  		  smallest = input;
  		} else {
  		  smallest = Math.min(smallest, input);
  		}
  		
  		// (aii) Largest input
  		largest = Math.max(largest, input);
  		
  		// (b) Count the number of even and odd inputs. 
  		if (input % 2 == 0) {
  			evenCounter++;  
  		} else {
  		  oddCounter++;
  		}
  		
  		// (c) Calculate cumulative totals
  		total += input;
  		cumTotal += total +" ";
  		
  		// (d) Get duplicates
  		if (valueCounter == 1) {
  		  aDuplicate = input;
  		  
  		} else if (aDuplicate == input) {
  			 if (!sDuplicate.endsWith(input + ""))
  		  		sDuplicate += input + " ";
  		  
  		} else {
  			aDuplicate = input;
  		}
  		
  		
  		in.close();
  	}
  	
  	
  	
  	System.out.println("(a) Smallest: "+ smallest +". Largest: "+ largest +".");
  	
  	System.out.println("(b) Even: "+ evenCounter +". Odd: "+ oddCounter +".");
  	
  	System.out.println("(c) Cumulative total: "+ cumTotal);	
  	
  	System.out.println("(d) Adjacent duplicates: "+ sDuplicate);

  }
  
  

}
