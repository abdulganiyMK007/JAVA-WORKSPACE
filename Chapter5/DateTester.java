package Chapter5;

import java.util.Scanner;

public class DateTester {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	int month, day;
  	month = day = 0;
  	
  	System.out.print("Enter month: ");
  	month = in.nextInt();
  	
  	System.out.print("Enter day: ");
  	day = in.nextInt();
  	
  	Date mt = new Date(day, month);
  	
  	System.out.println(mt.getSeason());
  	in.close();

  }

}
