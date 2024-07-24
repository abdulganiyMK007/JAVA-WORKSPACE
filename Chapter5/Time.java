package Chapter5;

public class Time {

	private static final int HUNDRED = 100;
	
	private static final int MINUTE_PER_HOUR = 60;
	private static final int HOUR_PER_DAY = 24;

	
	private int hour;
	private int minute;

	public Time(int time) {
	  hour = time / HUNDRED;
  	minute = time % HUNDRED;
	}
	
	
	
	public int getTimeDifference(int newTime) {
	  int newHour = newTime / HUNDRED;
  	int newMinute = newTime % HUNDRED;
  	
  	int diffHour = newHour - hour;
  	int diffMinute = newMinute - minute;
  	
  	if (diffMinute < 0) {
  	  diffHour--;
  	  diffMinute += MINUTE_PER_HOUR;
  	}
  	
  	if (diffHour < 0) {
  		diffHour += HOUR_PER_DAY; 
  	}
  	
  	//String ans = diffHour +" hours "+ diffMinute +" minutes";
		//System.out.println(ans);
		
		System.out.println(diffHour * HUNDRED + diffMinute);
  	return diffHour * HUNDRED + diffMinute;
	}
	
	public int compareTime(int newTime) {
	
		int newHour = newTime / HUNDRED;
  	int newMinute = newTime % HUNDRED;
  	
		if (hour < newHour) {
		  return 1;
		  
		} else if (hour == newHour) {
		  if (minute < newMinute) {
		    return 1;
		    
			} else if (minute == newMinute) {
			  return 0;
			  
			} else {
			  return -1;
			}
		} else {
		  return -1;
		}
		
	  
	}

}
