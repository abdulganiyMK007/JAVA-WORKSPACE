package Chapter6;
import java.util.Scanner;

public class DataSetTester {

	private static final double SENTINEL = -1;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	DataSet data = new DataSet();
  	
  	double value = 0;
  	System.out.print("Enter data values: ");
  	while (true) {
  		System.out.print("> ");
  		value = in.nextDouble();
  		if (value == SENTINEL) break;
  		
  		data.add(value);
  	}
  	
  	
  	System.out.printf("Average: %.2f\n", data.getAverage());
  	System.out.printf("SD: %.2f\n", data.getStandardDeviation());
  	
  	in.close();
  }

}
