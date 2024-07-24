package Chapter5;
import java.util.Scanner;


public class PayCheckCalculator {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	double salary, hours;
  	salary = hours = 0;
  	
  	
  	System.out.print("Enter hourly wage: ");
		salary = in.nextDouble();
		
		System.out.print("Then ask how many hours the employee worked in the past week? ");
		hours = in.nextDouble();
		
		PayCheck pk = new PayCheck(salary);
		
		System.out.println("$"+ pk.getPay(hours));
		in.close();
  }

}
