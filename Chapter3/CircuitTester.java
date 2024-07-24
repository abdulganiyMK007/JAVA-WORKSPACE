package Chapter3;


public class CircuitTester {

  public static void main(String[] args) {
  
  	CircuitTwo cTwo = new CircuitTwo();
    
    cTwo.getSwitchState(1);
    cTwo.getSwitchState(2);
    cTwo.getSwitchState(4);
    cTwo.getLampState();
    
    cTwo.toggleSwitch(1);
    
    cTwo.getSwitchState(1);
    cTwo.getSwitchState(2);
    cTwo.getLampState();
    
    cTwo.toggleSwitch(2);
    cTwo.toggleSwitch(2);
    
    
    cTwo.getSwitchState(1);
    cTwo.getSwitchState(2);
    cTwo.getSwitchState(4);
    cTwo.getLampState();
    
  
  
  CircuitOne cOne = new CircuitOne();
    
    cOne.getFirstSwitchState();
    cOne.getSecondSwitchState();
    cOne.getLampState();
    
    cOne.toggleFirstSwitch();
    cOne.toggleSecondSwitch();
    cOne.toggleSecondSwitch();
    
    cOne.getFirstSwitchState();
    cOne.getSecondSwitchState();
    cOne.getLampState();

  }

}
