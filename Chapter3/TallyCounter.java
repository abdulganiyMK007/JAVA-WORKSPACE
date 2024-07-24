package Chapter3;

public class TallyCounter {

	private int counter;
	private int maxLimit;
	
  public TallyCounter() {
    counter = 0;
    maxLimit = 0;
  }
  
  
  public void setLimit(int maximum) {
  	maxLimit = maximum;
  }
  
  public void undo() {
    counter--;
    counter = Math.max(counter, 0);
  }
  
  
  public void click() {
  	counter++;
  	counter = Math.min(counter, maxLimit);
  }
  
  
  public int getValue() {
  	System.out.println(counter);
    return counter;
  }
  
  
  
}
