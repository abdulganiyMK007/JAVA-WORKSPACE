package Chapter3;

/*
Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. Each switch can be up or down, and the light can be ON or OFF. Toggling either switch turns the lamp ON or OFF.
*/

public class CircuitTwo {

	private static final int OFF = 0;
	private static final int ON = 1;
	private static final int INVALID_SWITCH = 1;
	
	private int firstSwitchState;
	private int secondSwitchState;
	private int lampState;
	

	public CircuitTwo() {
	  firstSwitchState = OFF;
	  secondSwitchState = OFF;
	  lampState = OFF;
	}
	
	public int getSwitchState(int switchNum) {
	
		switch(switchNum) {
			case 1: 
				System.out.println("SWITCH "+ switchNum +": "+ stateWord(firstSwitchState));
				return firstSwitchState;
			case 2: 
				System.out.println("SWITCH "+ switchNum +": "+ stateWord(secondSwitchState));
				return secondSwitchState;
			default: 
				System.out.println("INVALID_SWITCH");
				return INVALID_SWITCH;  
		} 
	}
	
	
	public int getLampState() {
		System.out.println("LAMP STATE: "+ stateWord(lampState));
	  return lampState;
	}
	
	public void toggleSwitch(int switchNum) {
		switch(switchNum) {
			case 1: 
				firstSwitchState = (firstSwitchState == OFF) ? ON : OFF;
	  		lampState = firstSwitchState;
	  		break;
			case 2: 
				secondSwitchState = (secondSwitchState == OFF) ? ON : OFF;
	  		lampState = secondSwitchState;
	  		break;
			default: 
				System.out.println("INVALID_SWITCH");
				break;
		} 
	}
	
	
	private String stateWord(int state) {
		return (state == ON) ? "ON" : "OFF";
	}
	
	
}
