package Chapter3;


public class RangeInputTester {

  public static void main(String[] args) {
  	
  
    RangeInput r1 = new RangeInput();
    r1.getValue();
    
    r1.down();
    r1.down();
    r1.getValue();
    
    r1.down();
    r1.down();
    r1.getValue();
    
    r1.down();
    r1.down();
    r1.getValue();
    
    r1.down();
    r1.down();
    r1.getValue();
    
    RangeInput r2 = new RangeInput(10, 20);
    r2.getValue();
    
    r2.up();
    r2.up();
    r2.getValue();
    
    
    r2.up();
    r2.up();
    r2.getValue();
    
    
    r2.up();
    r2.up();
    r2.getValue();
    
    r2.up();
    r2.up();
    r2.getValue();
    
  
  }

}
