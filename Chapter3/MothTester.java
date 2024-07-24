package Chapter3;


public class MothTester {

  public static void main(String[] args) {
  	Moth mt = new Moth(20);
  	
  	mt.moveToLight(40);
  	mt.getPosition();
  	
  	mt.moveToLight(70);
  	mt.getPosition();
  	
  	
  	mt.moveToLight(50);
  	mt.getPosition();
  	
  	mt.moveToLight(-50);
  	mt.getPosition();
  	
  	mt.moveToLight(-10);
  	mt.getPosition();
  	
  	mt.moveToLight(15);
  	mt.getPosition();

  }

}
