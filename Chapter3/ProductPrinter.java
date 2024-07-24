package Chapter3;



/*
Supply a program ProductPrinter that makes two products, prints each name and price, reduces their prices by $5.00, and then prints the prices again.
*/
public class ProductPrinter {

  public static void main(String[] args) {

		Product pd = new Product("Toaster", 25);
		Product pr = new Product("Pan", 13);
		Product pt = new Product("Sardine", 2);
		
		pd.print();
		pr.print();
		pt.print();
		
		pd.reducePrice(5);
		pr.reducePrice(5);
		pt.reducePrice(5);
		
		pd.print();
		pr.print();
		pt.print();
		
  }

}
