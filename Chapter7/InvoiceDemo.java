package Chapter7;
import java.util.Scanner;


public class InvoiceDemo {
	
	private static final int SENTINEL = -1;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	int quantity = 0;
  	double price = 0;
  	boolean isPet = false;
  	String petResponse = "";
  	
  	Invoice keep = new Invoice();
  	
  	while (true) {
  	  System.out.print("Enter quantity: ");
  	  quantity = in.nextInt();
  	  
  	  if (quantity == SENTINEL) break;
  	  
  	  System.out.print("Is item a pet (Y or N): ");
  	  petResponse = in.next();
  	  isPet = petResponse.contains("Y");
  	  
  	  
  	  System.out.print("Enter price: ");
  	  price = in.nextDouble();
  	  
  	  
  	  Item anItem = new Item(price, isPet, quantity);
  	  keep.add(anItem);
  	  
  	  
  	  System.out.println();
  	}
  
  
  	double discount = keep.getDiscount();
  	
  	System.out.println("Discount: "+ discount);
  	in.close();
  	
  	/*
  	Item one = new Item(10, true, 1);
  	
  	Item a = new Item(10, false, 1);
  	Item b = new Item(10, false, 1);
  	Item c = new Item(10, false, 1);
  	Item d = new Item(10, false, 1);
  	Item e = new Item(10, false, 2);
  	Item f = new Item(10, false, 2);
  	Item g = new Item(10, false, 3);
  	Item h = new Item(10, false, 3);
  	
  	Invoice in = new Invoice();
  	in.add(one);
  	in.add(a);
  	in.add(b);
  	in.add(c);
  	in.add(d);
  	in.add(e);
  	in.add(f);
  	in.add(g);
  	in.add(h);
  	
  	System.out.println(in.getDiscount());
		*/
  }

}
