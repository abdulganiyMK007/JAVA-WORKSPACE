package Chapter3;

/*
Class Moth models a moth flying along a straight line. The moth has a position, which is the distance from a fixed origin. When the moth moves toward a point of light, its new position is halfway between its old position and the position of the light source.
*/

public class Moth {

	private double position;

	public Moth(double initialPosition) {
		position = initialPosition;
		System.out.println("Initial Position: "+ position);
	}

	public void moveToLight(double lightPosition) {
		position += (lightPosition - position) / 2;
		System.out.println("Light Position: "+ lightPosition);
	}
	
	public double getPosition() {
		System.out.println("=> Moth Position: "+ position);
		return position;
	}
	
}
