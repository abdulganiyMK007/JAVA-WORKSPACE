package Chapter6;


import java.util.Scanner;
/*
Write programs that read a line of input as a string and print 

a. Only the uppercase letters in the string. 

b. Every second letter of the string. 

c. The string, with all vowels replaced by an underscore. 

d. The number of vowels in the string. 

e. The positions of all vowels in the string.

*/
public class StringManipulator {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter a line: ");
  	String input = in.nextLine();
  	
  	char ch = ' ';
  	String onlyUppercase = "";
  	String everySecondLetter = "";
  	String vowelsReplaced = "";
  	String vowelPos = "";
  	int vowelCount = 0;
  	
  	
  	for (int i = 0; i < input.length(); i++) {
  		ch = input.charAt(i);
  		
  	  if (ch >= 'A' && ch <= 'Z') 
  	  	onlyUppercase += ch;
  	  	
  	  if (i % 2 != 0)
  	  	everySecondLetter += ch;
  	  	
  	  if (isVowel(ch)) {
  	    vowelsReplaced += '_';
  	    vowelPos += i + " ";
  	    vowelCount++;
  		} else {
  			vowelsReplaced += ch;
  		}
  	  
  	  in.close();
  	}
  	
  	System.out.println("Only uppercase: "+ onlyUppercase);
  	
  	System.out.println("Second letters: "+ everySecondLetter);
  	
  	System.out.println("Vowel removed: "+ vowelsReplaced);
  	
  	System.out.println("Vowel position: "+ vowelPos);
  	
  	System.out.println("Vowel count: "+ vowelCount);

  }
  
  
  private static boolean isVowel(char ch) {
    
    switch (ch) {
      case 'A': case 'a':
      case 'E': case 'e':
      case 'I': case 'i':
      case 'O': case 'o':
      case 'U': case 'u':
      	return true;
      
      default:
      	return false;
    }
  }
  
}

