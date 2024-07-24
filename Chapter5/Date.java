package Chapter5;

/*
The following algorithm yields the season (Spring, Summer, Fall, or Winter) for a given month and day. 
If month is 1, 2, or 3, season = “Winter” 
Else if month is 4, 5, or 6, season = “Spring” Else if month is 7, 8, or 9, season = “Summer” Else if month is 10, 11, or 12, season = “Fall” 
If month is divisible by 3 and day >= 21 
	If season is “Winter”, season = “Spring” 
	Else if season is “Spring”, season = “Summer” 		Else if season is “Summer”, season = “Fall” 
	Else season = “Winter” 
	
Write a program that prompts the user for a month and day and then prints the season, as determined by this algorithm. Use a class Date with a method getSeason.
*/

public class Date {

	private static final String SUMMER = "Summer";
	private static final String WINTER = "Winter";
	private static final String SPRING = "Spring";
	private static final String FALL = "Fall";
	

	private int day;
	private int month;

	public Date(int aDay, int aMonth) {
	  day = aDay;
	  month = aMonth;
	}
	
	public String getSeason() {
		String season = "";
		
		switch (month) {
			case 1: case 2: case 3:
				season = WINTER;
				break;
				
			case 4: case 5: case 6:
				season = SPRING; 
				break;
				
			case 7: case 8: case 9:
				season = SUMMER; 
				break;
				
			default:			
				season = FALL; 
				break; 
		}
		
		if (month % 3 == 0 && day >= 21) {
			if (season.equals(WINTER)) {
				season = SPRING;
			} else if (season.equals(SPRING)) {
		  	season = SUMMER;
			} else if (season.equals(SUMMER)) {
		  	season = FALL;
			} else {
			  season = WINTER;
			}
		}
		
		
		return season;
	  
	} 
	
	/*
	if (month >= 1 && month <= 3) {
			season = WINTER;
				
		} else if (month >= 4 && month <= 6)
			season = SPRING;
	
		} else if (month >= 7 && month <= 9)
			season = SUMMER;
				
		} else {
				season = FALL;
		}
	*/

}
