package Chapter6;
import java.util.Random;

public class NeedlePieSimulation {

	private static final int N_TRIALS = 10000;
	private static final int ANGLE_ON_LINE = 180;

  public static void main(String[] args) {
  Random gen = new Random();
  
  double yHigh, yLow, angle, hitsCount;
  yHigh = yLow = angle = hitsCount = 0;
  
  for (int i = 0; i < N_TRIALS; i++) {
    yLow = gen.nextDouble() + gen.nextInt(2);
    angle = Math.toRadians(gen.nextInt(ANGLE_ON_LINE));
    
    yHigh = yLow + Math.sin(angle);
    if (yHigh >= 2) hitsCount++;
    
  }
  
  System.out.println("PI: "+ (N_TRIALS / hitsCount));
  
  }

}
