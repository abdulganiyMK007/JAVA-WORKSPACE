package Chapter4;

public class PrintTicTacToeGrid {

  public static void main(String[] args) {
  
  	String plusMinus = "+--+--+--+\n";
  	String horizontal = "|  |  |  |\n";
  	String tictactoeGrid = plusMinus + horizontal + plusMinus + horizontal + plusMinus + horizontal + plusMinus;
  	System.out.println(tictactoeGrid);
  }

}
