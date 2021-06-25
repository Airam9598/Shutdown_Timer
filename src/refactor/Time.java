package refactor;

import java.util.Calendar;

public class Time {
	private Calendar calendario ;
	
	
	public Time() {
		calendario = Calendar.getInstance();
	}
	
	public boolean comparehour(int hour, int minute) {
		if(hour==Integer.parseInt(getActualHour()) && minute==Integer.parseInt(getActualMinute()))return true;
		return false;
	}


	public String getActualHour() {
		calendario = Calendar.getInstance();
		int hour=calendario.get(Calendar.HOUR_OF_DAY);
		if (hour<10) {
			return "0"+hour;
		}
		return ""+hour;
	}
	public String getActualMinute() {
		calendario = Calendar.getInstance();
		int min=calendario.get(Calendar.MINUTE);
		if (min<10) {
			return "0"+min;
		}
		return ""+min;
	}

}
