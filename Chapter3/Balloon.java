package Chapter3;

import Chapter3.Balloon;


public class Balloon {

	private double radius;
	
	public Balloon() {
	  radius = 0;
	}
	
	public void inflate(double amount) {
	 	radius += amount;
	}
	
	
	public double getVolume() {
  	return (Math.PI * Math.pow(radius, 3));
	}
	
	
  public static void main(String[] args) {
		
		Balloon bl = new Balloon();
		System.out.println(bl.getVolume());
		
		bl.inflate(1);
		System.out.println(bl.getVolume());
		
		bl.inflate(1);
		System.out.println(bl.getVolume());
		
  }

}
