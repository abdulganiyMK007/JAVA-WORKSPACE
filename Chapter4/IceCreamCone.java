package Chapter4;


/*
Implement a class IceCreamCone with methods getSurfaceArea() and getVolume(). In the constructor, supply the height and radius of the cone. Be careful when looking up the formula for the surface area—you should only include the outside area along the side of the cone because the cone has an opening on the top to hold the ice cream.
*/
public class IceCreamCone {

	private double radius;
	private double height;

	public IceCreamCone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea() {
		return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
	  
	}
	
	public double getVolume() {
	  return Math.PI * radius * radius * height / 3;
	}
	
	
	
	
	
	

}
