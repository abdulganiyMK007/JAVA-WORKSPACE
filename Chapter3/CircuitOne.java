package Chapter3;

/*
Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. Each switch can be up or down, and the light can be ON or OFF. Toggling either switch turns the lamp ON or OFF.
*/

public class CircuitOne {

	private static final int OFF = 0;
	private static final int ON = 1;
	
	
	private int firstSwitchState;
	private int secondSwitchState;
	private int lampState;
	
	public CircuitOne() {
	  firstSwitchState = OFF;
	  secondSwitchState = OFF;
	  lampState = OFF;
	}
	
	
	// 0 for down, 1 for up 
	public int getFirstSwitchState() {
		System.out.println("First switch: "+ stateWord(firstSwitchState));
	  return firstSwitchState;
 }
	 
	public int getSecondSwitchState() {
		System.out.println("Second switch: "+ stateWord(secondSwitchState));
	  return secondSwitchState;
	} 
	
	private String stateWord(int state) {
	  return (state == ON) ? "ON" : "OFF";
	}
	
	// 0 for OFF, 1 for ON
	public int getLampState() {
		System.out.println("Lamp State: "+ stateWord(lampState));
	  return lampState;
	} 
		
	public void toggleFirstSwitch() {
	  firstSwitchState = (firstSwitchState == OFF) ? ON : OFF;
	  lampState = firstSwitchState;
	}
	
	public void toggleSecondSwitch() {
	  secondSwitchState = (secondSwitchState == OFF) ? ON : OFF;
	  lampState = secondSwitchState;
	}

}
