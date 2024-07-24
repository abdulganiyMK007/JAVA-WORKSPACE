package Chapter5;
import java.util.Scanner;
/*
A minivan has two sliding doors. Each door can be opened by either a dashboard switch, its inside handle, or its outside handle. However, the inside handles do not work if a child lock switch is activated. In order for the sliding doors to open, the gear shift must be in park, and the master unlock switch must be activated. (This book’s author is the long-suffering owner of just such a vehicle.) 

Your task is to simulate a portion of the control software for the vehicle. The input is a sequence of values for the switches and the gear shift, in the following order: 

• Dashboard switches for left and right sliding door, child lock, and master unlock (0 for off or 1 for activated) 

• Inside and outside handles on the left and right sliding doors (0 or 1) 

• The gear shift setting (one of P N D 1 2 3 R).

A typical input would be 0 0 0 1 0 1 0 0 P. 

Print “left door opens” and/or “right door opens” as appropriate. If neither door opens, print “both doors stay closed”.

*/

	

public class DoorSimulation {

	private static final char ON = '1';
	private static final char OFF = '0';
	private static final char IN_PARK = 'P';
	

  public static void main(String[] args) {
  
  	String input = "";
  	String result = "";
  	
  	char leftDashboardSwitch, rightDashboardSwitch, childLock, masterUnlock, leftInsideHandle, rightInsideHandle, leftOutsideHandle, rightOutsideHandle, gearShift, leftDoorState, rightDoorState;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter software input sequence: ");
		input = in.nextLine();
		
		//input = "1 1 1 1 1 1 1 1 P";
		//input = "1 1 0 1 1 1 0 0 P";
  	//input = "0-2-4-6-8-0-2-4-6";
		
		leftDashboardSwitch = input.charAt(0);
		rightDashboardSwitch = input.charAt(2);
		childLock = input.charAt(4);
		masterUnlock = input.charAt(6);
		leftInsideHandle = input.charAt(8);
		rightInsideHandle = input.charAt(10);
		leftOutsideHandle = input.charAt(12);
		rightOutsideHandle = input.charAt(14);
		gearShift = input.charAt(16);
		
		leftDoorState = OFF;
		rightDoorState = OFF;
		
		
		
		if (masterUnlock == ON && gearShift == IN_PARK) {
		
			if (leftDashboardSwitch == ON || leftOutsideHandle == ON || (leftInsideHandle == ON && childLock == ON)) {
		  leftDoorState = ON;
			}
		
		if (rightDashboardSwitch == ON || rightOutsideHandle == ON || (rightInsideHandle == ON && childLock == ON)) {
		  rightDoorState = ON;
			}
		
		} 
		
		//System.out.println("right: "+ rightDoorState +", left: "+ leftDoorState);
	
		
		if (rightDoorState == OFF && leftDoorState == OFF) {
		  result = "both doors stay CLOSED";
		  
		} else {
		  if (rightDoorState == ON) {
		    result = "right door OPENS";
			} else {
				result = "right door CLOSES";
			}
			
			result += " and ";
			
			if (leftDoorState == ON) {
		    result += "left door OPENS";
			} else {
				result += "left door CLOSES";
			}
			
		}
		
		System.out.println(result);
		in.close();
	} 

}
