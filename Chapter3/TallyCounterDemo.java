package Chapter3;


public class TallyCounterDemo {

  public static void main(String[] args) {
		
		TallyCounter tally = new TallyCounter();
  	tally.setLimit(5);
  	tally.click();
  	tally.click();
  	tally.click();
  	tally.getValue();
  	tally.click();
  	tally.getValue();
  	tally.click();
  	tally.click();
  	tally.click();
  	tally.getValue();
  }

}
