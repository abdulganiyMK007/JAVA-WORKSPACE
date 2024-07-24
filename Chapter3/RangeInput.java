package Chapter3;

public class RangeInput {

	private static final int MIN_VALUE = 50;
	private static final int MAX_VALUE = 60;
	
	private int value;
	private int minValue;
	private int maxValue;
	
	public RangeInput() {
		 value = (MIN_VALUE + MAX_VALUE) / 2;
		 minValue = MIN_VALUE;
		 maxValue = MAX_VALUE;
	}
	
	public RangeInput(int minValue, int maxValue) {
	 value = (minValue + maxValue) / 2;  
	 this.minValue = minValue;
	 this.maxValue = maxValue;
	}
	
	public void up() {
		value++;
	  value = Math.min(value, maxValue);
	  System.out.println("Value incremented");
	}
	
	public void down() {
		value--;
	  value = Math.max(value, minValue);
	  System.out.println("Value decremented");
	}
	
	public int getValue() {
		System.out.println("Current value: "+ value);
	  return value;
	}

}
