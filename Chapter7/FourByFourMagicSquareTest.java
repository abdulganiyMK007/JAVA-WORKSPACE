package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class FourByFourMagicSquareTest {
	
	private static final int SIZE = 4;
	private static final int MAGIC_CONSTANT = 34;

  public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
    
    /*
    int[][] magicSquare = {
      {16, 3, 2, 13},
      {5, 10, 11, 8},
      {9, 6,  7, 12},
      {4, 15, 14, 1}
    };
    */
    
    
    int[][] magicSquare = new int[SIZE][SIZE];
    
		for (int i = 0; i < magicSquare.length; i++) {
      for (int j = 0; j < magicSquare.length; j++) {
      	System.out.print("Enter value at ["+ i +", "+ j +"]: ");
      	magicSquare[i][j] = in.nextInt();
      }
    }
    
    System.out.println();
    print(magicSquare);
    
    boolean isMagicSquare = isMagicSumsValid(magicSquare) && containValidNumbers(magicSquare);
    
    
    if (isMagicSquare) {
      System.out.println("VALID MAGIC SQUARE");
    } else {
      System.out.println("NOT A MAGIC SQUARE");
    }
    
		in.close();
  }
  
  
  private static boolean containValidNumbers(int[][] magicSquare) {
    int[] magicArray = new int[SIZE * SIZE];
    int arrayIndex = 0;
    
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
      	magicArray[arrayIndex] += magicSquare[i][j];
      	arrayIndex++;
      }
    }
    
    Arrays.sort(magicArray);
    //System.out.println(Arrays.toString(magicArray));
    
    arrayIndex = 1;
    for (int i = 0; i < SIZE; i++) {
    	if (magicArray[i] != arrayIndex) return false;
    	arrayIndex++;
    }
    
    
    return true;
  }
  
  
  
  
  private static boolean isMagicSumsValid(int[][] magicSquare) {
    
    int sumRow, sumCol, sumDiagonal1, sumDiagonal2;
    sumRow = sumCol = sumDiagonal1 = sumDiagonal2 = 0;
    
    for (int i = 0; i < SIZE; i++) {
    	sumDiagonal1 += magicSquare[i][i];
    	sumDiagonal2 += magicSquare[i][SIZE - i - 1];
    	
      for (int j = 0; j < SIZE; j++) {
      	sumRow += magicSquare[i][j];
      	sumCol += magicSquare[j][i];
      }
      
      if (sumRow != MAGIC_CONSTANT || sumCol != MAGIC_CONSTANT) return false;
      
      sumRow = sumCol = 0;
    }
    
    if (sumDiagonal1 != MAGIC_CONSTANT || sumDiagonal2 != MAGIC_CONSTANT) return false;
      
    
    return true;
  }
  
  
  
  
  
  private static void print(int[][] magicSquare) {
  	String square = "";
  	
    for (int i = 0; i < SIZE; i++) {
    	square += Arrays.toString(magicSquare[i]) +"\n";
    }
    
    System.out.println(square);
  }

}
