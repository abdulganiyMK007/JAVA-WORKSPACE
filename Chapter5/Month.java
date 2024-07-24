package Chapter5;

/*
Write a program that asks the user to enter a month (1 for January, 2 for February, etc.) and then prints the number of days in the month. For February, print “28 days”. 

Enter a month: 5 
30 days 

Use a class Month with a method 
public int getLength() 

Do not use a separate if/else branch for each month. Use Boolean operators.
*/

public class Month {

	public Month() {
	  
	}
	
	public int getLength(int aMonthInt) {
	  
	  switch(aMonthInt) {
	    
	    case 2:
	    	return 28;
	    case 4: case 6: case 9: case 11:
	    	return 30;
	    default:
	    	return 31;
		}
		
	}
	
	

	

}
