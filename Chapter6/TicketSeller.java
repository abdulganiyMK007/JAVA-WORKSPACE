package Chapter6;

import java.util.Scanner;
/*
Business P6.13 Write an application to pre-sell a imited number of cinema tickets. Each buyer can buy as many as 4 tickets. No more than 100 tickets can be sold. Implement a program called TicketSeller that prompts the user for the desired number of tickets and then displays the number of remaining tickets. Repeat until all tickets have been sold, and then display the total number of buyers.
*/
public class TicketSeller {

	private static final int TOTAL_NUMBER_OF_TICKETS = 100;
	private static final int MAX_TICKET_PER_BUYER = 4; 

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	int availableTickets, numOfBuyers, nTicket;
  	
  	availableTickets = TOTAL_NUMBER_OF_TICKETS;
  	numOfBuyers = nTicket = 0;
  
  
		while (availableTickets > 0) {
		
			while (true) {
			  System.out.print("Enter number of tickets: ");
			  nTicket = in.nextInt();
			  
			  if (nTicket > availableTickets) {
			    System.out.println("You can\'t purchase more than "+ availableTickets +" tickets");
			    break;
				}
			  
			  
			  if (nTicket >= 0 && nTicket <= MAX_TICKET_PER_BUYER) {
			    numOfBuyers++;
			    availableTickets -= nTicket;
			    break;
				} else {
				  System.out.println("You can\'t purchase more than "+ MAX_TICKET_PER_BUYER +" tickets");
				}
			}
			
			System.out.println("AVAILABLE TICKETS: "+ availableTickets);
		}
		
		System.out.println("Number of Buyers: "+ numOfBuyers);
		in.close();

  }

}
