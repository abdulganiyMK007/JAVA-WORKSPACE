package Chapter7;

import java.util.Scanner;

public class TicTacToeSimulation {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	int playerTracker = 1;
  
  	TicTacToe grid = new TicTacToe();
  	int spot = 0;
  	boolean isEmpty = true;
  	
  	while (true) {
  		while (true) {
  			System.out.print("PLAYER "+ playerTracker +": ");
  			spot = in.nextInt();
  			isEmpty = grid.isEmptySpot(spot);
  		
  			if (!(spot > 0 && spot < 10)) {
  				System.out.println("[--- INVALID SPOT ---]");
  				continue;
  			}
  			
  				if (isEmpty) break;
  					
  				System.out.println("[--- SPOT TAKEN ---]");
  		}
  		
  		boolean play = grid.play(spot);
  		grid.print();
  		
  		if (play) {
  		  System.out.println("PLAYER "+ playerTracker +" WINS");
  		  break;
  		}
  		
  		if (grid.isFilled()) {
  		  System.out.println("[--- NO WINNER ---]");
  		  break;
  		}
  		
  		playerTracker = (playerTracker == 1) ? 2 : 1;
  	}
  
		
		in.close();
  }

}
