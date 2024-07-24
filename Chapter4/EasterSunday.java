package Chapter4;

import java.util.Scanner;


public class EasterSunday {

  public static void main(String[] args) {
  
  	int y, a, b, c, d, e,g, h, j, k, m, n, r, p;
  	y = a = b = c = d = e = g = h = j = k = m = n = r = p = 0;
  	
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter a year: ");
  	y = in.nextInt();
  	
  	a = y % 19;
  	b = y / 100;
  	c = y % 100;
  	d = b / 4;
  	e = b % 4;
  	g = (8 * b + 13) / 25;
  	h = (19 * a + b - d - g + 15) % 30;
  	j = c / 4;
  	k = c % 4;
  	m = (a + 11 * h) / 319;
  	r = (2 * e + 2 * j - k - h + m + 32) % 7;
  	n = (h - m + r + 90) / 25;
  	p = (h - m + r + n + 19) % 32;
  	
  	String values = "y = "+ y +"\n" + "a = "+ a +"\n" + "b = "+ b +"\n" + "c = "+ c +"\n" + "d = "+ d +"\n" + "e = "+ e +"\n" + "g = "+ g +"\n" + "h = "+ h +"\n" + "j = "+ j +"\n" + "k = "+ k +"\n" + "m = "+ m +"\n" + "r = "+ r +"\n" + "n = "+ n +"\n" + "p = "+ p +"\n";
  	
  	System.out.println(values);
  	
  	ExtractMonth mt = new ExtractMonth();
  	
  	
  	System.out.println("Easter Sunday fell on "+ mt.getMonth(n).trim() +" "+ p);
  	
  	in.close();
  }

}
