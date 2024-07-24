package Chapter5;

/*
Write a program that takes user input describing a playing card in the following shorthand notation: 

A Ace 
2 ... 10 Card values 
J Jack 
Q Queen 
K King 

D Diamonds 
H Hearts 
S Spades 
C Clubs 

Your program should print the full description of the card. For example, 

Enter the card notation: QS 
Queen of Spades 

Implement a class Card whose constructor takes the card notation string and whose getDescription method returns a description of the card. If the notation string is not in the correct format, the getDescription method should return the string "Unknown".
*/

public class Card {
	
	
	private char suit;
	private char rank;
	
	public Card(String cardNotation) {
	  	suit = cardNotation.charAt(1);
		rank = cardNotation.charAt(0);
	}
	
	
	public String getDescription() {
		String rank = getRank();
		String suit = getSuit();

		return (rank == null || suit == null) ? "Unknown" : (getRank() +" of "+ getSuit());
	}
	
	public String getRank() {
		switch (rank) {
		  
			case '2':
				return "Two";
			
			case '3':
				return "Three";
			
			case '4': 
				return "Four";
				
			case '5': 
				return "Five";
				
			case '6':
				return "Six";
			
			case '7':
				return "Seven";
			
			case '8': 
				return "Eight";
				
			case '9': 
				return "Nine";
				
			case 'K': case 'k':
				return "King";
				
			case 'Q': case 'q':
				return "Queen";
			
			case 'J': case 'j':
				return "Jack";
				
			case 'A':
				return "Ace";

			default:
				return null;
		}
	
	}
	
	
	
	public String getSuit() {
		
		switch (suit) {
		  
			case 'H': case 'h':
				return "Hearts";
			
			case 'D': case 'd':
				return "Diamond";
			
			case 'S': case 's':
				return "Spade";
				
			case 'C': case 'c':
				return "Clubs";

			default:
				return null;
		}
		
	} 
	



}
