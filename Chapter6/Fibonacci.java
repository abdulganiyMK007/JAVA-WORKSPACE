package Chapter6;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  
  	int fold1, fold2, foldNew, foldSwap;
  	fold1 = fold2 = 1;
  	foldNew = foldSwap = 0;
  	
  	
  	System.out.print("Enter value: ");
  	int value = in.nextInt();
  	
  	if (value > 2) {
  		for (int i = 0; i < (value - 2); i++) {
  	  	foldNew = fold1 + fold2;
  	  
  	  	foldSwap = fold2;
  	  	fold2 = foldNew;
  	  	fold1 = foldSwap;
  		}
  		
  	} else {
  	  foldNew = 1;
  	}
  	
		System.out.println(foldNew);
		in.close();
  }

}
