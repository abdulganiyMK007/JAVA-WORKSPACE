package Chapter4;


/*
Implement a class SodaCan whose constructor receives the height and diameter of the  can. Supply methods getVolume and getSurfaceArea. Supply a SodaCanTester class that tests your class.
*/
public class SodaCan {

	private double height;
	private double radius;

	public SodaCan(double height, double diameter) {
		this.height = height;
		radius = diameter / 2;
	}
	
	public double getVolume() {
	  return Math.PI * radius * radius * height;
	}
	
	public double getSurfaceArea() {
	  return 2 * Math.PI * radius * (radius + height);
	}
	


	

}
