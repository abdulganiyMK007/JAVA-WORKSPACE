package Chapter6;
import java.util.Random;

public class TwoSixInDie {

	private static final int N_TRIALS = 1000000;

	private static final int THROW_PER_BET_1 = 4;
	private static final int THROW_PER_BET_2 = 24;
	
	private static final int NUM_OF_DICE_FACE = 6;
	private static final int WIN_FACE = 6;

  public static void main(String[] args) {
  
  	Random gen = new Random();
  	int dice1, dice2, winsCount;
  	dice1 = dice2 = winsCount = 0;
  	
  	// GAME 1
  	for (int i = 0; i < N_TRIALS; i++) {
  		for (int j = 0; j < THROW_PER_BET_1; j++) {
  			dice1 = 1 + gen.nextInt(NUM_OF_DICE_FACE);
  			if (dice1 == NUM_OF_DICE_FACE) {
  		  	winsCount++; 
  		  	break;  
  			}
  		}
  	}
  	
  	System.out.println("GAME 1: "+ winsCount +" WINS | "+ (N_TRIALS - winsCount) +" LOSSES");
  	
  	
  	// GAME 2
  	dice1 = dice2 = winsCount = 0;
  	
  	for (int i = 0; i < N_TRIALS; i++) {
  		for (int j = 0; j < THROW_PER_BET_2; j++) {
  	  	dice1 = 1 + gen.nextInt(NUM_OF_DICE_FACE);
  	  	dice2 = 1 + gen.nextInt(NUM_OF_DICE_FACE);
  	  
  	  	//System.out.println((j + 1) +"T: "+ dice1 +", "+ dice2);
  	  	if (dice1 == dice2 && dice1 == WIN_FACE) {
  	  		winsCount++; 
  	  		break;  
  			}
  		}
  	}
  	
  	
  	System.out.println("GAME 2: "+ winsCount +" WINS | "+ (N_TRIALS - winsCount) +" LOSSES");

  }

}
