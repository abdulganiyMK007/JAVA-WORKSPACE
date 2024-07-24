package Chapter4;

/*
The following pseudocode describes how to extract the dollars and cents from a price given as a floating-point value. For example, a price 2.95 yields values 2 and 95 for the dollars and cents. 

Assign the price to an integer variable dollars. Multiply the difference price - dollars by 100 and add 0.5. 
Assign the result to an integer variable cents.

Translate this pseudocode into a Java program. 

Read a price and print the dollars and cents. Test your program with inputs 2.95 and 4.35.
*/

public class ExtractDollarCent {

  public static void main(String[] args) {
		
		extract(2.95);
		extract(4.35);

  }
  
  private static void extract(double amount) {
    int dollar = (int) amount;
		int cent = (int) ((amount - dollar) * 100 + 0.5);
		
		System.out.println(dollar +" dollars "+ cent +" cents.");
		
  }

}
