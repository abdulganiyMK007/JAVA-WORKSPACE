package Chapter7;
import Chapter7.GameOfLife;
/*
The Game of Life is a well-known mathematical game that gives rise to amazingly complex behavior, although it can be specified by a few simple rules. (It is not actu ally a game in the traditional sense, with players competing for a win.) Here are the rules. The game is played on a rectangular board. Each square can be either empty or occupied. At the beginning, you can specify empty and occupied cells in some way; then the game runs automatically. In each generation, the next generation is computed. 

A new cell is born on an empty square if it is surrounded by exactly three occupied neighbor cells. 

A cell dies of overcrowding if it is surrounded by four or more neighbors, and it dies of loneliness if it is surrounded by zero or one neighbor. 

A neighbor is an occupant of an adjacent square to the left, right, top, or bottom or in a diagonal direction.
*/

public class GameOfLife {

	private static final int N_LONELINESS = 1;
	private static final int N_REPRODUCE = 3;
	private static final int N_OVERCROWDINESS = 4;
	
	private static final int DEAD = 1;
	private static final int LIVE = 0;
	
	private int[][] board;
	
  
  public GameOfLife(int row, int col) {
  	board = new int[row][col];
  	init();
  }
  
  
  public void generate(int nTimes, int step) {
  	int stepTracker = 1;
  	
  	System.out.println("GENERATION: 0");
  	printBoard();
  	
    for (int i = 1; i <= nTimes; i++) {
    	generate();
    	
    	if (i == stepTracker * step) {
    		System.out.println("GENERATION: "+ i);
    		printBoard();
    		stepTracker++;
    	}
    }
  }
  
  
  
  private void generate() {
  	int[][] countBoard = setNeighborCountBoard();
  	
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
       	
      	if (board[i][j] == DEAD) {
      		if (countBoard[i][j] == N_REPRODUCE) 
      			board[i][j] = LIVE;
      		
      	} else {
      		if (countBoard[i][j] <= N_LONELINESS || countBoard[i][j] >= N_OVERCROWDINESS) 
      			board[i][j] = DEAD;
      	}
      }
      
    }
    
  }
   
  
  private int[][] setNeighborCountBoard() {
  	int[][] countBoard = new int[board.length][board[0].length];
  	
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
      	countBoard[i][j] = getNeighborCount(i, j);
      }
    }
    
    return countBoard;
  }
  
  
  private int getNeighborCount(int row, int column) {
	  int neighbourCounter = 0;
	  
	  // top left  - 1
	  if (row > 0 && column > 0) {
	    if (board[row - 1][column - 1] == LIVE)
	    	neighbourCounter++;
	  }
	  
	  // top mid - 2
	  if (row > 0) {
	    if (board[row - 1][column] == LIVE)
	    	neighbourCounter++;
	  }
	  
	  // top right - 3
		if (row > 0 && column < board[row].length - 1) {
			if (board[row - 1][column + 1] == LIVE)
				neighbourCounter++;
		}
	  
	  // left mid - 4
	  if (column > 0) {
	    if (board[row][column - 1] == LIVE)
	    	neighbourCounter++;
		}
			
		// mid right - 5
		if (column < board[row].length - 1) {
			if (board[row][column + 1] == LIVE)
				neighbourCounter++;
		}
		
		// bottom left - 6
		if (row < board.length - 1 && column > 0) {
			if (board[row + 1][column - 1] == LIVE)
				neighbourCounter++;
		}
		
	  // bottom mid - 7
		if (row < board.length - 1) {
			if (board[row + 1][column] == LIVE)
				neighbourCounter++;
		}
		
		// bottom right - 8
		if (row < board.length - 1 && column < board[row].length - 1) {
			if (board[row + 1][column + 1] == LIVE)
				neighbourCounter++;
		}
		
	  return neighbourCounter;
	}
  
  
  private void init() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
      	board[i][j] = DEAD;
      }
    }
  }
  
  
  public void occupy(int row, int col) {
    if (row >= 0 && col >= 0 && row < board.length && col < board[0].length)
    	board[row][col] = LIVE;
  }
  
  
  
  private void printBoard() {
  	String code = "";
  	
  	for (int i = 0; i < board.length; i++) {
  		for (int j = 0; j < board[0].length; j++) {
  			if (board[i][j] == DEAD) {
  			  code += "- ";
  			} else {
  				code += "o "; 
  			}
  		}
  		code += "\n";
  	}
  	
  	System.out.println(code);
  }
 

}
