package Chapter6;
import java.util.Scanner;
/*
Enhance Worked Example 6.1 to check that the credit card number is valid. A valid credit card number will yield a result divisible by 10 when you: Form the sum of all digits. Add to that sum every second digit, starting with the second digit from the right. Then add the number of digits in the second step that are greater than four. The result should be divisible by 10. 

For example, consider the number 4012 8888 8888 1881. The sum of all digits is 89. The sum of the colored digits is 46. There are five colored digits larger than four, so the result is 140. 140 is divisible by 10 so the card number is valid.

*/
public class CreditNumber {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	//long cardNumber = 4012888888881881l;
  	
		int digitSum, secondDigitSum, moreThanFourCount;
		
		digitSum = secondDigitSum = moreThanFourCount = 0;
  	
  	System.out.print("Enter card number: ");
  	long cardNumber = in.nextLong();
  	
		
		while (cardNumber > 0) {
		  digitSum += cardNumber % 10;
		  cardNumber /= 10;
		  
		  digitSum += cardNumber % 10;;
		  secondDigitSum += cardNumber % 10;;
		  
		  if (cardNumber % 10 > 4) 
		  	moreThanFourCount++;
		  
		  cardNumber /= 10;
		}
		
		/*
		System.out.println(digitSum);
		System.out.println(secondDigitSum);
		System.out.println(moreThanFourCount);
		*/
		
		if ((digitSum + secondDigitSum + moreThanFourCount) % 10 == 0) {
			System.out.println("Card number is valid.");
		} else {
		  System.out.println("Card number is invalid.");
		}

		in.close();
  }



}
