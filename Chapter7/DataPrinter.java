package Chapter7;

public class DataPrinter {

  public static void main(String[] args) {
  	Data dt = new Data(5);
  	
  	dt.addValue(1.0);
  	dt.addValue(2);
  	dt.addValue(3.0);
  	dt.addValue(4.0);
  	dt.addValue(5.0);
  	
  	System.out.println(dt.getValues());
  	dt.smooth();
  	System.out.println(dt.getValues());

  }

}
