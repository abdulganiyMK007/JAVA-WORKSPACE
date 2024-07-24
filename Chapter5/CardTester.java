package Chapter5;

import java.util.Scanner;

public class CardTester {

	public static void main(String[] args) {
  
		Scanner in = new Scanner(System.in);



		System.out.print("Enter the card notation: ");
		String note = in.next();

		Card cd = new Card(note);
		System.out.println(cd.getDescription());

		System.out.println();

		in.close();

  	

  }

}
