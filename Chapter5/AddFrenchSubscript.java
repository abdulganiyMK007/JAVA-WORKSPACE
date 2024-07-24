package Chapter5;
import java.util.Scanner;

/*
French country names are feminine when they end with the letter e, masculine otherwise except

• le Belize 
• le Cambodge 
• le Mexique 
• le Mozambique 
• le Zaïre 
• le Zimbabwe 

Write a program that reads the French name of a country and adds the article: le for masculine or la for feminine, such as le Canada or la Belgique. 

 However, if the country name starts with a vowel, use l’; for example, l’Afghanistan. For the following plural country names, use les: 

• les Etats-Unis 
• les Pays-Bas 
*/


public class AddFrenchSubscript {

	private static final String FEMININE_SUBSCRIPT = "la";
	private static final String MASCULINE_SUBSCRIPT = "le";
	private static final String PLURAL_SUBSCRIPT = "les";
	private static final String NEUTRAL_SUBSCRIPT = "l\'";

  public static void main(String[] args) {
  
  	String word = "";
  	
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter a country name: ");
  	word = in.next();
  	
  	if (word.contains("-")) {
  	  word = PLURAL_SUBSCRIPT +" "+ word;
  	  
  	} else if (startsWithVowel(word.substring(0, 1))) {
  	  word = NEUTRAL_SUBSCRIPT + word;
  	  
  	} else if (word.endsWith("e") && !isSpecialFemaleNames(word)) {
  	  word = FEMININE_SUBSCRIPT +" "+ word;
  	  
  	} else {
  	  word = MASCULINE_SUBSCRIPT +" "+ word;
  	}


		System.out.println(word);
		in.close();
	}
  
  
  private static boolean startsWithVowel(String firtsLetter) {
    return firtsLetter.equals("A") || firtsLetter.equals("E") || firtsLetter.equals("I") || firtsLetter.equals("O") || firtsLetter.equals("U");
  }
  
   
  private static boolean isSpecialFemaleNames(String word) {
    return word.equalsIgnoreCase("Belize") || word.equalsIgnoreCase("Cambodge") || word.equalsIgnoreCase("Mexique") || word.equalsIgnoreCase("Mozambique") || word.equalsIgnoreCase("Zaïre") || word.equalsIgnoreCase("Zimbabwe");
  }

}
