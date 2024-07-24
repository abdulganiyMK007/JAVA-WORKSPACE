package Chapter6;

import java.util.Scanner;

public class Reverse {

  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter a word: ");
  	String word = in.next();
  	
  	
  	String reverse = "";
  	for (int i = word.length(); i > 0; i--) {
  		reverse += word.charAt(i - 1);
  	}
		
		System.out.println(reverse);
		in.close();
  }

}
