package Chapter6;

public class TurnsRatio {

	private static final double RESISTANCE_Ro = 20;
	private static final double RESISTANCE_Rs = 8;
	private static final double VOLTAGE_Vs = 40;
	

  public static void main(String[] args) {
  	double start = 0;
  	double stop = 2;
  	double increment = 0.01;
  	double currPower = 0;
  	double maxPower = 0;
  	double maxTurnsRatio = 0;
  	
		
		for (double i = start; i <= stop; i += increment) {
		  currPower = power(round(i));
		  if (currPower > maxPower) {
		    maxPower = currPower;
		    maxTurnsRatio = round(i);
			}
		}
		
		
		System.out.println("Max Power: "+ maxPower +" at turns ratio "+ maxTurnsRatio);
		
  }
  
  private static double power(double turnsRatio) {
    double power = RESISTANCE_Rs * Math.pow((turnsRatio * VOLTAGE_Vs) / (turnsRatio * turnsRatio * RESISTANCE_Ro + RESISTANCE_Rs), 2);
    
    return round(power); 
  }
  
  public static double round(double value) {
    double scale = Math.pow(10, 4);
    return Math.round(value * scale) / scale;
}

}
