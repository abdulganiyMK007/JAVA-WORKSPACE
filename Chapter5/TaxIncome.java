package Chapter5;
import java.util.Scanner;
/*
The original U.S. income tax of 1913 was quite simple. The tax was 

• 1 percent on the first $50,000. 
• 2 percent on the amount over $50,000 up to $75,000. 
• 3 percent on the amount over $75,000 up to $100,000. 
• 4 percent on the amount over $100,000 up to $250,000. 
• 5 percent on the amount over $250,000 up to $500,000. 
• 6 percent on the amount over $500,000. 

There was no separate schedule for single or married. Write a program that computes the income tax according to this schedule.
*/
public class TaxIncome {
	private static final double RATE1_LIMIT = 0.5E+5;
	private static final double RATE2_LIMIT = 0.75E+5;
	private static final double RATE3_LIMIT = 1.0E+5;
	private static final double RATE4_LIMIT = 2.5E+5;
	private static final double RATE5_LIMIT = 5.0E+5;
	
	
	private static final double RATE1 = 0.01;
	private static final double RATE2 = 0.02;
	private static final double RATE3 = 0.03;
	private static final double RATE4 = 0.04;
	private static final double RATE5 = 0.05;
	private static final double RATE6 = 0.06;


  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	double income, incomeTax;
  	income = incomeTax = 0;
  	
  	System.out.print("Enter amount of income: ");
  	income = in.nextDouble();
  	
  	if (income <= RATE1_LIMIT) {
  	  incomeTax = income * RATE1;
  	  
  	} else if (income <= RATE2_LIMIT) {
  	  incomeTax = income * RATE2;
  	  
  	} else if (income <= RATE3_LIMIT) {
  	  incomeTax = income * RATE3;
  	  
  	} else if (income <= RATE4_LIMIT) {
  	  incomeTax = income * RATE4;
  	  
  	} else if (income <= RATE5_LIMIT) {
  	  incomeTax = income * RATE5;
  	  
  	} else {
  		incomeTax = income * RATE6;
  	  
  	}
  	
  	System.out.println("Income Tax: "+ incomeTax);
		in.close();
  }

}
