package Chapter5;
import java.util.Scanner;


public class YearTester {

  public static void main(String[] args) {
  	
  	Scanner in = new Scanner(System.in);
  	
  	while (true) {
  	System.out.print("Enter year: ");
  	
  	Year year = new Year(in.nextInt());
  	System.out.println(year.isLeapYear());
  	in.close();
  	}

		
  }
  
 /* private static boolean isLeapYear(int year) {
    return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    
  }
*/
}
