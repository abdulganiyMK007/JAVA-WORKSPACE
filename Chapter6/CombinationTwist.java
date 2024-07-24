package Chapter6;
import java.util.Scanner;
/*
A bicycle combination lock has four rings with numbers 0 through 9. Given the actual numbers and the combination to unlock, print instructions to unlock the lock using the minimum number of twists. A “twist up” increases the number value of a ring, and a “twist down” decreases it. For example, if the actual number shown is 1729 and the desired combination is 5714, write your instructions like this: 

Ring 1: Twist up 4 times 
Ring 3: Twist down once 
Ring 4: Twist up or down 5 times 
*/

public class CombinationTwist {

	private static final int PASSCODE = 5714;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
		int pass = PASSCODE;
		int twist = 0;
		String result = "";
		int length = ("" + pass).length();
		
		System.out.print("Enter twist turns: ");
		int comb = in.nextInt();
		
		
		
		for (int i = length; i > 0; i--) {
		
			twist = (pass % 10) - (comb % 10);
			
			if (Math.abs(twist) == 5) {
			  result = "Ring "+ i +": Twist up or down 5 times\n" + result;
			} else if (twist == 0) {
			   result = "Ring "+ i +": No twist\n"+ result;
			} else if (Math.abs(twist) == 1) {
				if (twist == 1) {
					 result = "Ring "+ i +": Twist up once\n"+ result;
				} else {
				   result = "Ring "+ i +": Twist down once\n"+ result;
				}
			} else if (twist > 0) {
			   result = "Ring "+ i +": Twist up "+ twist +" times\n"+ result;
			} else {
			   result = "Ring "+ i +": Twist down "+ (-twist) +" times\n"+ result;
			}
			
			pass /= 10;
			comb /= 10;
		
		}
		
		System.out.println(result);
		in.close();
  }

}
