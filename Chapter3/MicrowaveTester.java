package Chapter3;



public class MicrowaveTester {

  public static void main(String[] args) {
  	Microwave mc = new Microwave();
  	mc.addTime();
  	mc.addTime();
  	mc.addTime();
  	mc.addTime();
  	
  	mc.start();
  	
  	mc.switchLevel();
  	mc.addTime();
  	mc.start();
  	
  	mc.reset();
  	mc.start();

  }

}
