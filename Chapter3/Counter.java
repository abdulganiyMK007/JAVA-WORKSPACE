package Chapter3;

public class Counter {

	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 10;

	private int value;
	private int minValue;
	private int maxValue;
	
  public Counter() {
    value = 0;
    maxValue = MAX_VALUE;
    minValue = MIN_VALUE;
  }
  
  public void setLimit(int minimum, int maximum) {
  	minValue = minimum;
  	maxValue = maximum;
  }
  
  public void undo() {
    value--;
    value = Math.max(value, minValue);
  }
  
  public void click() {
  	value++;
  	value = Math.min(value, maxValue);
  }
  
  public int getValue() {
    return value;
  }
  
  public void reset() {
    value = 0;
  }
  
  
  
}
