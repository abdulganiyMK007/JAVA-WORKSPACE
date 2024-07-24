package Chapter7;
import java.util.Arrays;

/*
A theater seating chart is implemented as a two-dimensional array of ticket prices, like this: 

					10 10 10 10 10 10 10 10 10 10 
					10 10 10 10 10 10 10 10 10 10 
					10 10 10 10 10 10 10 10 10 10 
					10 10 20 20 20 20 20 20 10 10 
					10 10 20 20 20 20 20 20 10 10 
					10 10 20 20 20 20 20 20 10 10 
					20 20 30 30 40 40 30 30 20 20 
					20 30 30 40 50 50 40 30 30 20 
					30 40 50 50 50 50 50 50 40 30 

Write a program that prompts users to pick either 
a seat or a price. Mark sold seats by changing the 
price to 0. When a user specifies a seat, make sure
it is available. When a user specifies a price, 
find any seat with that price.

*/

public class TheaterSeatingChart {
	
	private static final int N_ROW = 9;
	private static final int N_COL = 10;
	private static final int SOLD = 0;

	private int[][] chart;
	
  public TheaterSeatingChart() {
  	chart = new int[N_ROW][N_COL];
  	
  	init();
		print();
  }
  
  
  
  
  public boolean book(int row, int col) {
  	if (chart[row][col] == SOLD) return false;
  	
  	chart[row][col] = SOLD;
    return true;
  }
  
  
  public boolean book(int price) {
    for (int i = 0; i < chart.length; i++) {
      for (int j = 0; j < chart[0].length; j++) {
      
      	if (chart[i][j] == price) {
      		chart[i][j] = SOLD;
      		return true;
      	}
      }
    }
    
    return false;
  }
  
  
  private void init() {
    
    for (int i = 0; i < chart.length; i++) {
      for (int j = 0; j < chart[0].length; j++) {
      	
      	chart[i][j] = (i < 6) ? 10 : 30;
      	
      	if ((i > 2 && i < 6 && j > 1 && j < 8) || (i == 6 && !(j > 1 && j < 8)) || ((i == 7) && !(j > 0 && j < 9)))	chart[i][j] = 20;
      		
      		
      	if ((i == 8) && (j > 1 && j < 8) || (i == 7 && (j == 4 || j == 5))) chart[i][j] = 50;
      	
      	
      	if (i == 6 && (j == 4 || j == 5) || (i == 7 && (j == 3 || j == 6) || (i == 8 && (j == 1 || j == 8)))) chart[i][j] = 40;
      }
    }
  }
  
  
  public void print() {
  	String row = "";
  	
    for (int i = 0; i < chart.length; i++) {
    	row += Arrays.toString(chart[i]) +"\n";
    }
    
    System.out.println("\n"+ row);
  }
  
  
  

}
