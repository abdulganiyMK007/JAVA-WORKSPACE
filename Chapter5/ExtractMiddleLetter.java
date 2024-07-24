package Chapter5;

import java.util.Scanner;


public class ExtractMiddleLetter {

  public static void main(String[] args) {
  
  	String str = "";
  	
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter a string: ");
  	str = in.nextLine();
  	
  	
  	if (str.length() % 2 == 0) {
  		str = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
  	} else {
  	  str = str.substring(str.length() / 2, str.length() / 2 + 1);
  	}

		
		System.out.println(str);
		in.close();
  }

}
