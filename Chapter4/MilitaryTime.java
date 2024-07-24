package Chapter4;

import java.util.Scanner;


/*
Write a program that reads two times in military format (0900, 1730) and prints the number of hours and minutes between the two times. Here is a sample run. User input is in color. 

Please enter the first time: 0900 
Please enter the second time: 1730 
8 hours 30 minutes 

Extra credit if you can deal with the case where the first time is later than the  second: 

Please enter the first time: 1730 
Please enter the second time: 0900 
15 hours 30 minutes
*/
public class MilitaryTime {

	private static final int HUNDRED = 100;
	
	private static final int MINUTE_PER_HOUR = 60;
	private static final int HOUR_PER_DAY = 24;

  public static void main(String[] args) {
  
  	int time1, hour1, minute1, time2, hour2, minute2, diffHour, diffMinute;
  	
  	time1 = hour1 = minute1 = time2 = hour2 = minute2 = diffHour = diffMinute = 0;
  
  	Scanner in = new Scanner(System.in);
  
  	
  	System.out.print("Please enter the time1: ");
  	time1 = in.nextInt();
  	System.out.print("Please enter the time2: ");
  	time2 = in.nextInt();
  	
  	hour1 = time1 / HUNDRED;
  	minute1 = time1 % HUNDRED;
  	
  	hour2 = time2 / HUNDRED;
  	minute2 = time2 % HUNDRED;
  	
  	diffHour = hour2 - hour1;
  	diffMinute = minute2 - minute1;
  	
  	if (diffMinute < 0) {
  	  diffHour--;
  	  diffMinute += MINUTE_PER_HOUR;
  	}
  	
  	if (diffHour < 0) {
  		diffHour += HOUR_PER_DAY; 
  	}
  	
  	String ans = diffHour +" hours "+ diffMinute +" minutes";

		System.out.println(ans);
		
		in.close();
  }






}
