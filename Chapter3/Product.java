package Chapter3;


/*
Implement a class Product. A product has a name and a price, for example new Product("Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a program ProductPrinter that makes two products, prints each name and price, reduces their prices by $5.00, and then prints the prices again.
*/
public class Product {
	
	private String name;
	private double price;


	public Product(String productName, double productPrice) {
		name = productName;
		price = productPrice; 
	}
	
	public String getName() {
	 	return name;
	}


	public double getPrice() {
		return price;
	}

	public void reducePrice(double priceReduction) {
  	price -= priceReduction;
  	if (price < 0) price = 0;
	}
	
	public String print() {
		String text = "Name: "+ getName();
		text += ", Price: $"+ getPrice();
		
		
		System.out.println(text);
		return text;
	}

}
