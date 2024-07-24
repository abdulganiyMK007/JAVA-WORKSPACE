package Chapter4;

import java.util.Scanner;


public class NumberTeat {

	private static final int TEN = 10;
	private static final int HUNDRED = 100;
	private static final int THOUSAND = 1000;

  public static void main(String[] args) {
  
  	int a, b, n, m, r;
  	a = b = n = m = r = 0;
  	
  	Scanner in = new Scanner(System.in);
  	
		System.out.print("Enter a digit: ");
		m = in.nextInt() % THOUSAND;
		
		System.out.println("Input :"+ m);
		n = m;
		
		a = n / HUNDRED;
		n %= HUNDRED;
		b = n / TEN;
		n %= TEN;
		
		r = n * HUNDRED + b * TEN + a;
		
		System.out.println("Reversed :"+ r);
		
		n = m - r;
		System.out.println("Difference :"+ n);
		
		m = n;
		a = n / HUNDRED;
		n %= HUNDRED;
		b = n / TEN;
		n %= TEN;
		
		
		r = n * HUNDRED + b * TEN + a;
		
		System.out.println("Reversed :"+ r);
		System.out.println("Sum :"+ (m + r));
		
		
		in.close();
		
  }

}
