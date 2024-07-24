package Chapter5;
import java.util.Scanner;
/*
Write a program that reads in three strings and sorts them lexicographically. 
Enter three strings: Charlie Able Baker 
	Able 
	Baker 
	Charlie
*/

public class ArrangeThreeStrings {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	String str1, str2, str3, swap;
  	str1 = str2 = str3 = swap = "";
  	
  	System.out.print("Enter three strings: ");
  	str1 = in.next();
  	str2 = in.next();
  	str3 = in.next();
  	
  	System.out.println(str1 +" "+ str2 +" "+ str3);
  	
  	if (str3.compareTo(str2) < 0) {
  		swap = str2;
  		str2 = str3;
  		str3 = swap;
  	}
  	
  	if (str2.compareTo(str1) < 0) {
  		swap = str1;
  		str1 = str2;
  		str2 = swap;
  	}
  	
  	if (str3.compareTo(str2) < 0) {
  		swap = str2;
  		str2 = str3;
  		str3 = swap;
  	}
  	
  	System.out.println(str1 +" "+ str2 +" "+ str3);
		

		in.close();
  }
  
  

}
