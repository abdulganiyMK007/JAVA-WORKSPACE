package Chapter7;
import java.util.Arrays;
import java.util.Random;

/*
In this assignment, you will implement a simulation of a popular casino game usually called video poker. The card deck contains 52 cards, 13 of each suit. At the beginning of the game, the deck is shuffled. You need to devise a fair method for shuffling. (It does not have to be efficient.) The player pays a token for each game. Then the top five cards of the deck are presented to the player. The player can reject none, some,  or all of the cards. The rejected cards are replaced from the top of the deck. Now the  hand is scored. Your program should pronounce it to be one of the following: 

• No pair—The lowest hand, containing five separate cards that do not match up to create any of the hands below.  

• One pair—Two cards of the same value, for example two queens. Payout: 1 

• Two pairs—Two pairs, for example two queens and two 5’s. Payout: 2 

• Three of a kind—Three cards of the same value, for example three queens.  Payout: 3 

• Straight—Five cards with consecutive values, not necessarily of the same suit,  such as 4, 5, 6, 7, and 8. The ace can either precede a 2 or follow a king.  Payout: 4 

• Flush—Five cards, not necessarily in order, of the same suit. Payout: 5 

• Full House—Three of a kind and a pair, for example three queens and two 5’s.  Payout: 6 

• Four of a Kind—Four cards of the same value, such as four queens. Payout: 25 

• Straight Flush—A straight and a flush: Five cards with consecutive values of  the same suit. Payout: 50 

• Royal Flush—The best possible hand in poker. A 10, jack, queen, king, and ace,  all of the same suit. Payout: 250

*/

	
public class VideoPoker {

	
	private int[][] cardDeck;
	private int[][] cards;
	
	private Random rgen = new Random();
	
	
	
	public VideoPoker() {
		initCardDeck();
		cards = new int[2][N_CARDS];
	}
	
	public int getPoint() {
		
		Arrays.sort(cards[0]);
		Arrays.sort(cards[1]);
		
		int similarRankCount = getSimilarRankCount();
		
		if (similarRankCount == 3) {
		
		  if (isFourOfAKind()) {
		    System.out.println("FOUR OF A KIND");
		    return FOUR_OF_A_KIND_PAYOUT;
		    
			} else  {
			  System.out.println("FULL HOUSE");
			  return FULL_HOUSE_PAYOUT;
			}  
			
		} else if (similarRankCount == 2) {
		
		  if (isThreeOfAKind()) {
		    System.out.println("THREE OF A KIND");
		    return THREE_OF_A_KIND_PAYOUT;
		    
			} else  {
			  System.out.println("TWO PAIRS");
			  return TWO_PAIRS_PAYOUT; 
			}  
			
		} else if (similarRankCount == 1) {
		
			System.out.println("ONE PAIR");
			return ONE_PAIR_PAYOUT;
			
		} else {
		
		  if (isFlush()) {
		  	if (isStraight()) {
		  	
		    	if (cards[0][0] == 10) {
		    		System.out.println("ROYAL FLUSH");
		    		return ROYAL_FLUSH_PAYOUT;
		    		
					} else {
				  	System.out.println("STRAIGHT FLUSH");
				  	return STRAIGHT_FLUSH_PAYOUT;
					}
					
				} else {
					System.out.println("FLUSH");
					return FLUSH_PAYOUT;
				}
				
			} else if (isStraight()) {
			
		  	System.out.println("STRAIGHT");
		  	return STRAIGHT_PAYOUT;
		  
			} else {
		  	System.out.println("NO PAIR");
		  	return NO_PAIR_PAYOUT;
			}
		}
	}
	
	
	private int getSimilarRankCount() {
		int count = 0;
		
		if (cards[0][0] == cards[0][1]) count++;
		if (cards[0][1] == cards[0][2]) count++;
		if (cards[0][2] == cards[0][3]) count++;
		if (cards[0][3] == cards[0][4]) count++;
		
		return count;
	}
	
	
	private boolean isThreeOfAKind() {
		boolean combo1 = (cards[0][0] == cards[0][1]) && (cards[0][1] == cards[0][2]) &&  (cards[0][2] != cards[0][3]) &&  (cards[0][3] != cards[0][4]);
	  
	  boolean combo2 = (cards[0][0] != cards[0][1]) && (cards[0][1] == cards[0][2]) &&  (cards[0][2] == cards[0][3]) &&  (cards[0][3] != cards[0][4]);
	  
	  boolean combo3 = (cards[0][0] != cards[0][1]) && (cards[0][1] != cards[0][2]) &&  (cards[0][2] == cards[0][3]) &&  (cards[0][3] == cards[0][4]);
	  
	  return combo1 || combo2 || combo3;
	}
	
	
	private boolean isFourOfAKind() {
	  boolean combo1 = ((cards[0][0] == cards[0][1]) && (cards[0][0] == cards[0][2]) &&  (cards[0][0] == cards[0][3]) &&  (cards[0][0] != cards[0][4]));
	  
	  boolean combo2 = ((cards[0][0] != cards[0][1]) && (cards[0][1] == cards[0][2]) &&  (cards[0][1] == cards[0][3]) &&  (cards[0][1] == cards[0][4]));
	  
	  return combo1 || combo2;
	}
	
	
	// same as isConsecutiveRank
	private boolean isStraight() {
		return (cards[0][0] == cards[0][1] - 1) && (cards[0][0] == cards[0][2] - 2) &&  (cards[0][0] == cards[0][3] - 3) &&  (cards[0][0] == cards[0][4] - 4);
	}
	
	
	// same as isSameSuit
	private boolean isFlush() {
		return (cards[1][0] == cards[1][1]) && (cards[1][0] == cards[1][2]) &&  (cards[1][0] == cards[1][3]) &&  (cards[1][0] == cards[1][4]);
	}
	

	public void shuffle() {
		
		for (int i = 0; i < cards[0].length; i++) {
			pickACard(i);
		}
	}
	
	
	public void rejectCard(int i) {
		pickACard(i - 1);
	}
	
	
	private void pickACard(int i) {
		int randomRank = 0;
		int randomSuit = 0;
		int cardDeckIndex = 0;
	
		while (true) {
			randomRank = 2 + rgen.nextInt(NUM_OF_RANK);
			randomSuit = 1 + rgen.nextInt(NUM_OF_SUIT);
		  cardDeckIndex = randomRank + NUM_OF_RANK * (randomSuit - 1) - 2;
			  
		  if (cardDeck[0][cardDeckIndex] != 0) break;
		}
			
			cards[0][i] = cardDeck[0][cardDeckIndex];
			cards[1][i] = cardDeck[1][cardDeckIndex];
			
			cardDeck[0][cardDeckIndex] = EMPTY;
			cardDeck[1][cardDeckIndex] = EMPTY;
		
	}
		
		
	// index is between 1 - 5
	public void reshuffle(int index) {
		if (index >= 1 && index <= 5) {
			index--;
			cards[0][index] = 2 + rgen.nextInt(NUM_OF_RANK);
			cards[1][index] = rgen.nextInt(NUM_OF_SUIT);
		} else {
			System.out.println("Invalid Card");
		}
	}
	
	
	public void showCards() {
		String description = ""; 
		Card aCard = new Card();
	  for (int i = 0; i < cards[0].length; i++) {
			description += ("Card "+ (i + 1) +": "); 
			description += aCard.getDescription(cards[0][i], cards[1][i]);
			description += "\n";
		} 
		
		String coverDesign = "* * * * * * * * * * * * * *\n";
		
		description = "\n"+ coverDesign + description + coverDesign;
		System.out.println(description);
		
	}
	
	
	private void initCardDeck() {
	  cardDeck = new int[2][N_ALL_CARDS];
		
		int rankValue = 2;
		int suitValue = 1;
		
		for (int i = 0; i < cardDeck[0].length; i++) {
			cardDeck[0][i] = rankValue++;
			cardDeck[1][i] = suitValue;
			
			if (rankValue == NUM_OF_RANK + 2) rankValue = 2;
			
			if ((i + 1) % NUM_OF_RANK == 0) {
				suitValue++;
			} 
		}
	}
	
	
	
	private static final int NO_PAIR_PAYOUT = 0;
	private static final int ONE_PAIR_PAYOUT = 1;
	private static final int TWO_PAIRS_PAYOUT = 2;
	private static final int THREE_OF_A_KIND_PAYOUT = 3;
	private static final int STRAIGHT_PAYOUT = 4;
	private static final int FLUSH_PAYOUT = 5;
	private static final int FULL_HOUSE_PAYOUT = 6;
	private static final int FOUR_OF_A_KIND_PAYOUT = 25;
	private static final int STRAIGHT_FLUSH_PAYOUT = 50;
	private static final int ROYAL_FLUSH_PAYOUT = 250;

	private static final int N_ALL_CARDS = 52;
	public static final int N_CARDS = 5;
	
	private static final int EMPTY = 0;
	
	private static final int NUM_OF_RANK = 13;
	private static final int NUM_OF_SUIT = 4;


	

	
}
