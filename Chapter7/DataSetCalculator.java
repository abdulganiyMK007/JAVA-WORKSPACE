package Chapter7;


public class DataSetCalculator {

  public static void main(String[] args) {
  	DataSet data = new DataSet(5);
  	
  	data.add(1);
  	data.add(2);
		data.add(3);
		data.getTotal();
		data.getMinimum();
		data.getMaximum();
		data.getAverage();
		
		data.add(4);
  	data.add(5);
		data.add(6);
		data.getTotal();
		data.getMinimum();
		data.getMaximum();
		data.getAverage();
		
		data.add(7);
  	data.add(4);
		data.add(4);
		data.getTotal();
		data.getMinimum();
		data.getMaximum();
		data.getAverage();
		
  }

}
