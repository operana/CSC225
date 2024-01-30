public class ShowCurrentTime {
	public static void main(String[] args) {
		//System class has method to show time, it returns a long int, giving us the time in milliseconds
		//obtain the total milliseconds since Midnight, Jan 1, 1970 in GMT (all programming languages typically use this date, the unix epoch)
		long totalMilliseconds = System.currentTimeMillis();
		
		//milliseconds too much for our purposes, so convert to seconds. number is truncated with integer division.
		long totalSeconds = totalMilliseconds / 1000;
		
		//convert seconds to find how many minutes have occurred. to do, find how many seconds go into 60, then give me the remainder of that
		long currentSecond = (int)(totalSeconds % 60);
		
		//obtain total minutes by dividing total seconds by 60
		long totalMinutes = totalSeconds / 60;
		
		//obtain current minute, what minute of the hour are we up to?
		long currentMinute = (int)(totalMinutes % 60);
		
		//convert minutes to find how many hours 
		long totalHours = totalMinutes / 60;
		
		//obtain current hour
		long currentHour = (int)(totalHours % 24);
		
		//now we have current sec, min, and hr. just print to console
		System.out.println("Current time is " + currentHour + ":" 
				+ currentMinute + ":" + currentSecond + " GMT");
		
	}

}