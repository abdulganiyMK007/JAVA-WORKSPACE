package Chapter3;

import Chapter3.Microwave;



/*
A microwave control panel has four buttons: one for increasing the time by 30 seconds, one for switching between power levels 1 and 2, a reset button, and a start button. Implement a class that simulates the microwave, with a method for each button. The method for the start button should print a message “Cooking for ... seconds at level ...”.
*/

public class Microwave {

	private static final int TIME_INCREASE = 30;
	private static final int LEVEL_ONE = 1;
	private static final int LEVEL_TWO = 2;

	private int time;
	private int level;

	public Microwave() {
		time = 0;
		level = LEVEL_ONE;
	}
	
	
	public void addTime() {
		time += TIME_INCREASE;
		System.out.println("ADD 30 seconds");
	}
	
	public void switchLevel() {
		level = (level == LEVEL_ONE) ? LEVEL_TWO : LEVEL_ONE;
	}
	
	public void reset() {
		time = 0;
		level = LEVEL_ONE;
	}
	
	public void start() {
		String text = "Cooking for "+ time +" seconds at level "+ level;
		System.out.println(text);
	}
	
	
	

  public static void main(String[] args) {

  }
  
  

}
