package Chapter4;



public class BalloonTester {

  public static void main(String[] args) {
  
  	Balloon ball = new Balloon();
  	
  	ball.addAir(100);
  	System.out.println(ball.getSurfaceArea());
  	System.out.println(ball.getVolume());
  	System.out.println(ball.getRadius());
  	
  	
  	ball.addAir(100);
  	System.out.println(ball.getSurfaceArea());
  	System.out.println(ball.getVolume());
  	System.out.println(ball.getRadius());
  	

  }

}
