package Chapter6;
import java.util.Scanner;

/*
You need to control the number of people who can be in an oyster bar at the same time. Groups of people can always leave the bar, but a group cannot enter the bar if they would make the number of people in the bar exceed the maximum of 100 occupants. Write a program that reads the sizes of the groups that arrive or depart. Use negative numbers for departures. After each input, display the current number of occupants. As soon as the bar holds the maximum number of people, report that the bar is full and exit the program.
*/
public class BarSize {

	private static final int MAX_BAR_SIZE = 100;
	
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int currentSize, departSize, arriveSize, rejectedSize;
		currentSize = departSize = arriveSize = rejectedSize = 0;

		while (true) {
			System.out.print("Number of group that arrive: ");
			arriveSize = in.nextInt();
			
			System.out.print("Number of group that depart: ");
			departSize = in.nextInt();
			
			currentSize += (arriveSize - departSize);
			
			if (currentSize >= MAX_BAR_SIZE) {
			  rejectedSize =  currentSize - MAX_BAR_SIZE;
			  break;
			} else {
			  System.out.println("Bar occupants: "+ currentSize);
			}
		  
		}

		System.out.println("BAR IS FULL AND CLOSED");
		System.out.println("Rejected "+ rejectedSize +" people");
		in.close();
  }

}
