package Chapter7;
import java.util.Arrays;
import java.util.Random;

public class Sort {

  public static void main(String[] args) {
  	final int LENGTH = 20;
  	final int MAX_VALUE = 100;
  
		Random rgen = new Random();
		int[] values = new int[LENGTH];
		
		for (int i = 0; i < LENGTH; i++) {
			values[i] = rgen.nextInt(MAX_VALUE);
		}
		
		System.out.println(Arrays.toString(values));
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
  }

}
