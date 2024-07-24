package Chapter7;

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
	
	
	public Card() {
	  
	}
	
	
	public String getDescription(int rank, int suit) {
		return getRank(rank) +" of "+ getSuit(suit);
	}
	
	
	public String getRank(int rank) {
		switch (rank) {
		  
			case 2:
				return "Two";
			
			case 3:
				return "Three";
			
			case 4: 
				return "Four";
				
			case 5: 
				return "Five";
				
			case 6:
				return "Six";
			
			case 7:
				return "Seven";
			
			case 8: 
				return "Eight";
				
			case 9: 
				return "Nine";
				
			case 10: 
				return "Ten";
				
			case 11:
				return "King";
				
			case 12:
				return "Queen";
			
			case 13:
				return "Jack";
				
			case 14: case 1:
				return "Ace";
				
			default:
				return "Unknown";
		}
	}
	
	
	public String getSuit(int suit) {
		
		switch (suit) {
		  
			case 1:
				return "Clubs";
				
			case 2:
				return "Diamond";
			
			case 3:
				return "Hearts";
			
			case 4:
				return "Spade";
				
			default:
				return "Unknown";
		}
	} 
	


}
