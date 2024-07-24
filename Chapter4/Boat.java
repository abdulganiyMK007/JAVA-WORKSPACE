package Chapter4;

/*
boat floats in a two-dimensional ocean. It has a position and a direction. It can move by a given distance in its current direction, and it can turn by a given angle. Provide methods 

public double getX() 
public double getY() 
public double getDirection() 
public void turn(double degrees)
public void move(double distance)
*/

public class Boat {

	private double pointX;
	private double pointY;
	private double direction;

	public Boat(double x, double y) {
	  pointX = x;
	  pointY = y;
	  direction = 0;
	}
	
	public Boat() {
	  pointX = pointY = 0;
	  direction = 0;
	}
	
	public double getX() {
		System.out.printf("X = %.2f\n", pointX);
		return pointX;
	}

	public double getY() {
		System.out.printf("Y = %.2f\n", pointY);
		return pointY;
	}

	public double getDirection() {
		System.out.printf("D = %.2f\n", Math.toDegrees(direction));
  	return Math.toDegrees(direction);
	}	

	public void turn(double degrees) {
		direction = Math.toRadians(degrees);
	}
	
	public void move(double distance) {
		pointX = pointX + distance * Math.cos(direction);
		pointY = pointY + distance * Math.sin(direction);
	}
	


}
