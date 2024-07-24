package Chapter3;


public class RoachPopulationTester {

  public static void main(String[] args) {
  
  	RoachPopulation rh = new  RoachPopulation(10);
		rh.getRoaches();
		
		rh.breed();
		rh.spray(10);
		rh.getRoaches();
		
		
		rh.breed();
		rh.spray(10);
		rh.getRoaches();
		
		rh.breed();
		rh.spray(10);
		rh.getRoaches();
		
		
  }

}
