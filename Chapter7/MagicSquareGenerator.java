package Chapter7;
import java.util.Scanner;

import java.util.Arrays;
public class MagicSquareGenerator {

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
    System.out.print("Enter an odd number: ");
    int size = in.nextInt();
    
    int[][] magicSquare = new int[size][size];
    
    int row = size - 1;
    int col = size / 2;
    int prevRow, prevCol;
    prevRow = prevCol = 0;
    
		for (int k = 1; k <= (size * size); k++) {
			prevRow = row;
			prevCol = col;
			
			magicSquare[row][col] = k;
			row++; col++;
			
			if (row == size) row = 0;
			if (col == size) col = 0;  
			
		
			if (magicSquare[row][col] != 0) {
				row = prevRow;
				col = prevCol;
				row--; 
			}
		}
		
		print(magicSquare);
		in.close();
  }
  
  
  private static void print(int[][] magicSquare) {
  	String square = "";
  	
    for (int i = 0; i < magicSquare.length; i++) {
    	square += Arrays.toString(magicSquare[i]) +"\n";
    }
    
    System.out.println(square);
  }
  
  

}
