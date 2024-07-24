package Chapter5;

import java.util.Scanner;
/*
Roman numbers. Write a program that converts a positive integer into the Roman number system. The Roman number system has digits 

I 1 
V 5 
X 10 
L 50 
C 100 
D 500 
M 1,000 

Numbers are formed according to the following rules: 

a. Only numbers up to 3,999 are represented. 

b. As in the decimal system, the thousands, hundreds, tens, and ones are expressed separately. 

c. The numbers 1 to 9 are expressed as 

I 1 
II 2 
III 3 
IV 4 
V 5 
VI 6 
VII 7 
VIII 8 
IX 9 

As you can see, an I preceding a V or X is subtracted from the value, and you can never have more than three I’s in a row. 

d. Tens and hundreds are done the same way, except that the letters X, L, C and C, D, M are used instead of I, V, X, respectively. 

Your program should take an input, such as 1978, and convert it to Roman numerals, MCMLXXVIII. 
*/

	

public class RomanNumbers {
	
	private static final String I = "I"; 
	private static final String V = "V";
	private static final String X = "X"; 
	private static final String L = "L"; 
	private static final String C = "C"; 
	private static final String D = "F";
	private static final String M = "M"; 
	

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	int value = 0;
  	int valueCopy = 0;
  	int digitCount = 0;
  	int aDigit = 0;
  	String romanLetter = "";
  	
  	
  	System.out.print("Enter an integer (< 4000): ");
  	value = in.nextInt();
  	valueCopy = value;
  	
  	while (value > 0) {
  		digitCount++;
  		
  		aDigit = value % 10;
  		romanLetter = getSymbol(aDigit, digitCount) + romanLetter;
  		value /= 10;
  	  
  	}
  	
  	
  	System.out.println(valueCopy +" = "+ romanLetter);
  
  	in.close();
  	
  }
  
  
  public static String getSymbol(int num, int indexSet) {
  	
  	String index1, index2, index3;
  	index1 = index2 = index3 = "";
  	
  	switch (indexSet) {
  		case 1:
  			index1 = I;
  			index2 = V;
  			index3 = X;
  			break;
  		
  		case 2:
  			index1 = X;
  			index2 = L;
  			index3 = C;
  			break;
  			
  		case 3:
  			index1 = C;
  			index2 = D;
  			index3 = M;
  			break;
  			
  		default:
  			index1 = M;
  			break;
  	}
  	
  	
  	switch (num) {
  	  case 1: 
  	  	return index1;
  	  	
  	  case 2: 
  	  	return index1 + index1;
  	  	
  	  case 3: 
  	  	return index1 + index1 + index1;
  	  	
  	  case 4: 
  	  	return index1 + index2;
  	  	
  	  case 5: 
  	  	return index2;
  	  	
  	  case 6: 
  	  	return index2 + index1;
  	  	
  	  case 7: 
  	  	return index2 + index1 + index1;
  	  	
  	  case 8: 
  	  	return index2 + index1 + index1 + index1;
  	  	
  	  case 9: 
  	  	return index1 + index3;
  	  	
  	  default:
  	  	return "";
  	  	
  	}
    
  }
  
  	

}
