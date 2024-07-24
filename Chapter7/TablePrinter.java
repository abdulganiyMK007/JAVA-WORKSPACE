package Chapter7;


public class TablePrinter {

  public static void main(String[] args) {
  
  	Table tab = new Table(3, 3);
  	
		tab.set(0, 0, 1);
		tab.set(0, 1, 2);
		tab.set(0, 2, 3);
		tab.set(1, 0, 0);
		tab.set(1, 1, 1);
		tab.set(1, 2, 2);
		tab.set(2, 0, 5);
		tab.set(2, 1, 3);
		tab.set(2, 2, 4);
		
		tab.print();
		
		tab.sum(0, true);
		tab.sum(1, true);
		tab.sum(2, true);
		
		tab.sum(0, false);
		tab.sum(1, false);
		tab.sum(2, false);
		
		tab.neighborAverage(0, 0);
		tab.neighborAverage(0, 1);
		tab.neighborAverage(0, 2);
		tab.neighborAverage(1, 0);
		tab.neighborAverage(1, 1);
		tab.neighborAverage(1, 2);
		tab.neighborAverage(2, 0);
		tab.neighborAverage(2, 1);
		tab.neighborAverage(2, 2);
  }

}
