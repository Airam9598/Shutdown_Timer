package refactor;

public class Countdown {
	private int hour,minute,seconds;
	public Countdown(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public String getHour() {
		if (hour<10) {
			return "0"+hour;
		}else {
			return hour+"";
		}
	}

	public String getMinute() {
		if (minute<10) {
			return "0"+minute;
		}else {
			return minute+"";
		}
	}

	public String getSeconds() {
		if (seconds<10) {
			return "0"+seconds;
		}else {
			return seconds+"";
		}
	}
	
	public int update(){
		seconds-=1;
	    if(seconds<0) {
	    	minute-=1;
	       	if(minute<0) {
	       		hour-=1;
	        	if(hour<=0) {
	        		return 1;
	        	}else {minute=59;seconds=59;}
	        }else {seconds=59;}
	    }
	    return 0;
	}
	
}
