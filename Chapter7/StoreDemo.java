package Chapter7;
import java.util.Scanner;



public class StoreDemo {
	
	private static final int SENTINEL = 0;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  
  	double price = 0;
  	String name = "";
  	
  	Store data = new Store();
  	
  	while (true) {
  	  System.out.print("Enter price: ");
  	  price = in.nextDouble();
  	  
  	  if (price == SENTINEL) break;
  	  
  	  System.out.print("Enter name: ");
  	  name = in.next();
  	  
  	  data.addSale(name, price);
  	  System.out.println();
  	  
  	}
  	
  	System.out.println("Best customer of the day: "+ data.nameOfBestCustomer());
  	
  	in.close();
  	
  	
  	/*
		Store data = new Store();
		data.addSale("Harry", 1300);
		data.addSale("Berym", 100);
		data.addSale("Castano", 2700);
		data.addSale("Fintian", 130);
		data.addSale("Esther", 30);
			System.out.println(data.nameOfBestCustomers(7).toString());
		*/
  }

}
