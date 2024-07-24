package Chapter5;
import java.util.Scanner;

public class MonthTester {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	Month mt = new Month();
  	
  	
  	System.out.print("Enter a month: ");
  	int month = in.nextInt();

		
		System.out.println(mt.getLength(month) +" days");
		
		in.close();
  }

}
