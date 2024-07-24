package Chapter5;

import java.util.Scanner;


/*
When two points in time are compared, each given as hours (in military time, ranging from 0 and 23) and minutes, the following pseudocode determines which comes first. 

If hour1 < hour2 
	time1 comes first. 
Else if hour1 and hour2 are the same 
	If minute1 < minute2 
		time1 comes first. 
	Else if minute1 and minute2 are the same 
		time1 and time2 are the same. 
	Else 
		time2 comes first. 
Else 
	time2 comes first.
	
	
Write a program that prompts the user for two points in time and prints the time that comes first, then the other time. In your program, supply a class Time and a method public int compareTo(Time other) that returns –1 if the time comes before the other, 0 if both are the same, and 1 otherwise.
*/

public class CompareMilitaryTime {

	private static final int HUNDRED = 100;

	public static void main(String[] args) {
  	int time1, hour1, minute1, time2, hour2, minute2;
  	time1 = hour1 = minute1 = time2 = hour2 = minute2 = 0;
  	String orderedTime = "";
  
  	Scanner in = new Scanner(System.in);
  
  	System.out.print("Please enter the time 1: ");
  	time1 = in.nextInt();
  	System.out.print("Please enter the time 2: ");
  	time2 = in.nextInt();
  	
  	hour1 = time1 / HUNDRED;
  	minute1 = time1 % HUNDRED;
  	
  	hour2 = time2 / HUNDRED;
  	minute2 = time2 % HUNDRED;
  	
		if (hour1 < hour2) {
		  orderedTime = time1 +"\n"+ time2;
		  
		} else if (hour1 == hour2) {
		  if (minute1 < minute2) {
		    orderedTime = time1 +"\n"+ time2;
		    
			} else if (minute1 == minute2) {
			  orderedTime = time1 +" = "+ time2;
			  
			} else {
			  orderedTime = time2 +"\n"+ time1;
			}
		} else {
		  orderedTime = time2 +"\n"+ time1;
		}
	
		System.out.println(orderedTime);
		in.close();
	}

}
