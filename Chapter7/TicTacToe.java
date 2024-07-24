package Chapter7;

/*
Write a program that plays tic-tac-toe. The tic-tac-toe game is played on a 3 × 3 grid as in the photo at right. The game is played by two players, who take turns. The first player marks moves with a circle, the second with a cross. The player who has formed a horizontal, vertical, or diagonal sequence of three marks wins. Your program should draw the game board, ask the user for the coordinates of the next mark, change the players after every successful move, and pronounce the winner.
*/
public class TicTacToe {
	
	private int[][] board;
	private String playerTracker;
	private int spotTracker;
	
	
	public TicTacToe() {
		board = new int[BOARD_SIZE][BOARD_SIZE];
		playerTracker = CROSS;
		spotTracker = 0;
		print();
	}
	
	
	
	public boolean isFilled() {
		return !(spotTracker < 9);
	}
	
	
	
	public boolean isEmptySpot(int pos) {
		int[] index = getBoardIndex(pos);
		
		return (board[index[0]][index[1]] == 0);
	}
	
	
	
	public boolean play(int pos) {
		spotTracker++;
		int[] index = getBoardIndex(pos);
		
		board[index[0]][index[1]] = (playerTracker.equals(CIRCLE)) ? PLAYER_CIRCLE_TAG : PLAYER_CROSS_TAG;
		
		playerTracker = (playerTracker.equals(CIRCLE)) ? CROSS : CIRCLE;
		
		return isAWin();
	}
	
	
	
	private boolean isAWin() {
    boolean isRowMatch, isColMatch;
    isRowMatch = isColMatch = true;
    
    for (int i = 0; i < BOARD_SIZE; i++) {
      isRowMatch = board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0;
      
      isColMatch = board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0;
      
      if (isRowMatch || isColMatch) return true;
    }
  
  
    boolean isDiagOneMatch = board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0;
    
    boolean isDiagTwoMatch = board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != 0;
    
    return isDiagOneMatch || isDiagTwoMatch;
  }
  
  
	
	private int[] getBoardIndex(int pos) {
	  int[] index = new int[2];
	  
	  switch (pos) {
	  
	  	case 1: 
	  		index[0] = 0;
	  		index[1] = 0;
	  		break;
	  		
	  	case 2: 
	  		index[0] = 0;
	  		index[1] = 1;
	  		break;
	  		
	  	case 3: 
	  		index[0] = 0;
	  		index[1] = 2;
	  		break;
	  		
	  	case 4: 
	  		index[0] = 1;
	  		index[1] = 0;
	  		break;
	  		
	  	case 5: 
	  		index[0] = 1;
	  		index[1] = 1;
	  		break;
	  		
	  	case 6: 
	  		index[0] = 1;
	  		index[1] = 2;
	  		break;
	  		
	  	case 7: 
	  		index[0] = 2;
	  		index[1] = 0;
	  		break;
	  		
	  	case 8: 
	  		index[0] = 2;
	  		index[1] = 1;
	  		break;
	  		
	  	default: 
	  		index[0] = 2;
	  		index[1] = 2;
	  		break;
		}
	  
		return index;
	}
	
	
	
	public void print() {
		String draw = "";
		
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
			
				if (board[i][j] == PLAYER_CROSS_TAG) {
				  draw += CROSS;
				  
				} else if (board[i][j] == PLAYER_CIRCLE_TAG) {
				  draw += CIRCLE;
				  
				} else {
				  draw += EMPTY;
				  
				}
				
				if (j < BOARD_SIZE - 1) draw += "|";
			}
			
			draw += "\n";
			if (i < BOARD_SIZE - 1) draw += "- - -\n";
		} 
		 
		String stars = "******\n";
		draw = stars + draw + stars;
		
		System.out.println(draw);
	}
	
	
	private static final int BOARD_SIZE = 3;
	private static final int PLAYER_CROSS_TAG = 1;
	private static final int PLAYER_CIRCLE_TAG = 2;
	
	private static final String CROSS = "X";
	private static final String CIRCLE = "O";
	private static final String EMPTY = " ";

}
