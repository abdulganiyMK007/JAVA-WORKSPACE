package Chapter4;

import Chapter4.ExtractMonth;
import java.util.Scanner;


public class ExtractMonth {

	private static final int MONTHS_LENGTH = 10;
	
	private String months;
	
	public ExtractMonth() {
	  months = "January   February  March     April     May       June      July      August    September October   November  December  ";
	}
	
	public String getMonth(int index) {
		String aMonth = "";
		int start, stop;
		start = stop = 0;
		
	  start = (index - 1) * MONTHS_LENGTH;
		stop = start + MONTHS_LENGTH;
		aMonth = months.substring(start, stop);
		
		return aMonth;
	}

  public static void main(String[] args) {
  	ExtractMonth mt = new ExtractMonth();
  	
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter between 0-13: ");
			int index = in.nextInt();
			
			if (index == 0) break;
			if (index <= 0 || index >= 13) continue;
			
			System.out.println(mt.getMonth(index));
			System.out.println();
		}
		
		in.close();
		
		
		
  }

}
