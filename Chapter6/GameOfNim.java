package Chapter6;
import java.util.Random;
import java.util.Scanner;
/*
The game of Nim. This is a well-known game with a number of variants. The following variant has an interesting winning strategy. Two players alternately take marbles from a pile. In each move, a player chooses how many marbles to take. The player must take at least one but at most half of the marbles. Then the other player takes a turn. The player who takes the last marble loses.

Write a program in which the computer plays against a human opponent. 

Generate a random integer between 10 and 100 to denote the initial size of the pile. 

Generate a random integer between 0 and 1 to decide whether the computer or the human takes the first turn. 

Generate a random integer between 0 and 1 to decide whether the computer plays smart or stupid.

In stupid mode the computer simply takes a random legal value (between 1 and n/2) from the pile whenever it has a turn. In smart mode the computer takes off enough marbles to make the size of the pile a power of two minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size of the pile is currently one less than a power of two. In that case, the computer makes a random legal move. 

You will note that the computer cannot be beaten in smart mode when it has the first move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who has the first turn and knows the win ning strategy can win against the computer.
*/
public class GameOfNim {


	private static final int MIN_PILE_SIZE = 10;
	private static final int MAX_PILE_SIZE = 100;
	
	private static final int MIN_PICK = 1;
	
	
	private static Random gen = new Random();
	private static Scanner in = new Scanner(System.in);
	
	
	private static int pileSize;
	private static boolean isComputerSmart;
	
	// 0 for computer, 1 for human
	private static int currentPicker; 
	
	
	
	
  public static void main(String[] args) {
		
		pileSize = MIN_PILE_SIZE + gen.nextInt(MAX_PILE_SIZE - MIN_PILE_SIZE);
		
		isComputerSmart = gen.nextInt(2) == 1;
		
		currentPicker = gen.nextInt(2);
		
		if (isComputerSmart) {
			  System.out.println("COMPUTER SMART MODE");
		} else {
		  	System.out.println("COMPUTER DUMB MODE");
		}
		
		while (pileSize >= 1) {
			System.out.println("PILE SIZE: "+ pileSize);
			nextPick();
			System.out.println();
		}
		
		
		System.out.println();
		if (currentPicker == 0) {
		  System.out.println("COMPUTER WINS");
		} else {
		  System.out.println("HUMAN WINS");
		}
	
  }
  
  private static void nextPick() {
    if (currentPicker == 0) {
    	
      pileSize -= computerPick();
      currentPicker = 1;
    } else {
      pileSize -= humanPick();
      currentPicker = 0;
    }
  }
  
  private static int humanPick() {
  
  	if (pileSize == MIN_PICK) {
  		System.out.println("Human picked: "+ MIN_PICK);
  		return MIN_PICK;
  	}
  	
  	int pick = 0;
  	
  	System.out.print("Human player pick: ");
    pick = in.nextInt();
    
    if (!isValidPick(pick)) {
      while (true) {
        System.out.println("YOU CAN ONLY PICK BETWEEN ("+ (MIN_PICK - 1) +" - "+ (pileSize / 2 + 1) +")");
        System.out.print("Human player pick again: ");
    		pick = in.nextInt();
    		
    		if (isValidPick(pick)) break;
    
      }
    }
    
    return pick;
  }
  
  
  
  
  private static int computerPick() {
  	int pick = 0;
  	
  	if (pileSize == MIN_PICK) {
  		System.out.println("Computer picked: "+ MIN_PICK);
  		return MIN_PICK;
  	}
  	
  	if (isComputerSmart) {
  		int smartPick = 0;
  		int i = 1;
  		
  		while (true) {
  		  smartPick = (int) (pileSize - Math.pow(2, i) + 1);
  		  
  		  if (smartPick <= (pileSize / 2)) break;
  		  i++;
  		}
  		
  		pick = smartPick;
  	} else {
    	pick = 1 + gen.nextInt(pileSize / 2);
  	}
    
    System.out.println("Computer picked: "+ pick);
    return pick;
  }
  
  
  
  private static boolean isValidPick(int pick) {
    return (pick >= MIN_PICK) && (pick <= (pileSize / 2));
  }
  
  

}
