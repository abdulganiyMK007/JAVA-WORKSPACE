package Chapter3;


/*
Class Bug models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction.
*/

public class Bug {


	private static final int RIGHT = 1;
	private static final int LEFT = -1;

	private int position;
	private int direction;

	public Bug(int initialPosition) {
		position = initialPosition;
		direction = RIGHT;
	}
	
	public void turn() {
		direction = (direction == RIGHT) ? LEFT : RIGHT;
		System.out.println("TURN");
	}

	public void move() {
		position += direction;
		System.out.println("MOVE: "+ position);
	}


	public int getPosition() {
		System.out.println("Position: "+ position);
		return position;  
	}
		

}
