package Chapter6;
import java.util.Scanner;
/*
Write a program that reads a word and prints all substrings, sorted by length. For example, if the user provides the input "rum", the program prints r 
u 
m 
ru 
um
rum
*/
public class Print {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter a word: ");
  	String word = in.next();
  	int size = 1;
  
  	for (int i = word.length(); i > 0; i--) {
  		for (int j = 0; j < i; j++) {
  	  	System.out.println(word.substring(j, j + size));	
  	  }
  	  size++;
  	}

		in.close();
  }

}
