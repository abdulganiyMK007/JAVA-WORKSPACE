package Chapter7;
import java.util.Scanner;


public class VideoPokerSimulator {

	private static final int N_CARDS = 5;
	private static final int SENTINEL = 0;
	
	private static Scanner in;

  public static void main(String[] args) {
		in = new Scanner(System.in);
  	int anotherGame = 1;
  	
  	while (anotherGame != SENTINEL) {
  		
  		System.out.println("=============== START GAME ===============");
    	playPoker();
	  	System.out.println("=============== END GAME ===============\n");
  		
  		System.out.print(">> Play another game? ("+ SENTINEL +" to QUIT): ");
  		anotherGame = in.nextInt();
  		
  	}
  	
  	System.out.println("[--- PROGRAM TERMINATED ---]");
  	in.close();
  }
  
  
  
  private static void playPoker() {
  	VideoPoker poker = new VideoPoker();
  	poker.shuffle();
  	poker.showCards();
  	
  
  	System.out.print(">> How many card(s) do you want to reject: ");
  	int numOfCardsRejected = in.nextInt();
  
  	
  	
  	while (numOfCardsRejected < 0 || numOfCardsRejected > N_CARDS) {
		
			System.out.println("[--- Invalid. You can only reject 0 to 5 cards ---]");
			System.out.println();
			System.out.print(">> How many card(s) do you want to reject: ");
  		numOfCardsRejected = in.nextInt();
  	}
  	
  	
  	
  	if (numOfCardsRejected == N_CARDS) {
  			poker.shuffle();
  	  	poker.showCards();
  	  	
  	} else if (numOfCardsRejected == 0) {
  		System.out.println("[--- NO CARDS REJECTED ---]");
  	
  	} else {
  	  int rejectCardIndex = -1;
  	  int[] tracker = new int[N_CARDS];
  	  
  		for (int i = 0; i < numOfCardsRejected; i++) {
  		
  			while (true) {
  				System.out.print(">> Enter card index: ");
  				rejectCardIndex = in.nextInt();
  			
  				if (rejectCardIndex > 0 && rejectCardIndex <= N_CARDS) {
						
						if (tracker[rejectCardIndex - 1] == 0) {
						  tracker[rejectCardIndex - 1] = 1;
						  break;
						} else {
						  System.out.println("[--- Card "+ rejectCardIndex +" already rejected ---]");
						}
  				} else {
  				  System.out.println("[--- Invalid card index ---] ");
  				  continue;
  				}
  			}
  			poker.rejectCard(rejectCardIndex);
  		}
  		
  		poker.showCards();
  	}
  	
  	int point = poker.getPoint();
  	System.out.println("SCORE: "+ point);
  	
  	
  	
  }

}
