package Chapter7;
import java.util.Scanner;


public class TheaterSeatingChartDemo {

	private static final int SENTINEL = 0;
	
	
	private static TheaterSeatingChart set;
	private static Scanner in;

  public static void main(String[] args) {
  	in = new Scanner(System.in);
  	set = new TheaterSeatingChart();
  	
		int option = -1;
		boolean isBooked = false;
		
		while (option != SENTINEL) {
			
			while (true) {
				System.out.println("************************");
				System.out.print(">> (1) Seat, (2) Price, ("+ SENTINEL +") Quit. \n>> Choose option: ");
				option = in.nextInt();
			
				if (option == 1) {
			  	isBooked = seatOption();
			  	break;
			  	
				} else if (option == 2) {
			  	isBooked = priceOption();
			  	break;
			  	
				} else if (option == SENTINEL) {
			  	System.out.println("END");
			  	break;
			  	
				} else {
				  System.out.println("[--- INVALID INPUT ---]\n");
				}
			}
			
			if (isBooked) {
			  System.out.println("[--- BOOKED ---]");
			} else {
				 System.out.println("[--- SEAT IS NOT AVAILABLE ---]");
			}
			
			//set.print();
			System.out.println();
			
		}
		
		
		
		System.out.println("[******* END PROGRAM *******]");
		in.close();
  }
  
  
  private static boolean seatOption() {
    int row = 0;
    int col = 0;
    
    while (true) {
    	System.out.println();
    	System.out.print("Enter column number: ");
    	col = in.nextInt();
    	
    	
    	System.out.print("Enter row number: ");
    	row = in.nextInt();
    	
    	if (isValidSeat(row, col)) break;
    	
    	System.out.println("[--- INVALID SEAT ---]");
    }
    
    
    return set.book(row - 1, col - 1);
  }
  
  
  private static boolean priceOption() {
    int price = 0;
    
    while (true) {
    	System.out.println();
    	System.out.print("Enter price: ");
    	price = in.nextInt();
    	
    	if (isValidPrice(price)) break;
    	
    	System.out.println("[--- INVALID PRICE ---]");
    }
    
    return set.book(price);
  }
  
  
  private static boolean isValidPrice(int price) {
    return price == 10 || price == 20 || price == 30 || price == 40 || price == 50;
  }
  
  
  private static boolean isValidSeat(int row, int col) {
  	return (row > 0 && row < 10) && (col > 0 && col <= 10);
  }
  

}
