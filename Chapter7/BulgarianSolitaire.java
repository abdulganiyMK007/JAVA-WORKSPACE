package Chapter7;

import java.util.ArrayList;
import java.util.Random;

/*
In this assignment, you will model the game of Bulgarian Solitaire. The game starts with 45 cards. (They need not be playing cards. Unmarked index cards work just as well.) Randomly divide them into some number of piles of random size. For example, you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one card from each pile, forming a new pile with these cards. For example, the sample starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5. The solitaire is over when the piles have size 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order. (It can be shown that you always end up with such a configuration.) In your program, produce a random starting configuration and print it. Then keep applying the soli taire step and print the result. Stop when the solitaire final configuration is reached.
*/
public class BulgarianSolitaire {

	private static final int SOLITAIRE_SIZE = 9;
	private static final int TOTAL_PILE = 45;
	
	private static ArrayList<Integer> pile;

  public static void main(String[] args) {
		pile = new ArrayList<Integer>();
		
		init();
		print();
		play();
  }
  
  
  private static void init() {
  	Random rgen = new Random();
  	
    int sum = 0;
    int aPile = 0;
    
    while (sum < TOTAL_PILE) {
      aPile = 1 + rgen.nextInt(TOTAL_PILE - sum);
      sum += aPile;
      
      pile.add(aPile);
    }
    
  }
  
  
  private static void play() {
    int size, tempSize, index;
		size = tempSize = index = 0;
		
		while (!isSolitaire()) {
			size = pile.size();
			tempSize = size;
			
			index = 0;
			while (index < tempSize) {
			  pile.set(index, pile.get(index) - 1);
			  
			  if (pile.get(index) == 0) {
			    pile.remove(index);
			    index--;
			    tempSize--;
				}
				
				index++;
			}
			
			pile.add(size);
			print();
			
		}
  }
  
  
  private static boolean isSolitaire() {
    if (pile.size() != SOLITAIRE_SIZE) return false;
    
    for (int i = 1; i < SOLITAIRE_SIZE; i++) {
      if (pile.get(i - 1) != pile.get(i) - 1)
      	return false;
    }
    
    return true;
  }
  
  
  private static void print() {
    String data = "[";
    
    for (int i = 0; i < pile.size() - 1; i++) {
      data += pile.get(i) + ", ";
    }
    
    data += pile.get(pile.size() - 1) +"]";
    System.out.println(data);
  }
  

}
