package by.epam.saleiko.task04;

public class Time {
	private int hours=0;
	private int minutes=0;
	private int seconds=0;
	Time(int hours, int minutes, int seconds){
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}
	
	protected void setHours(int hours) {
		if (hours >= 0) this.hours = hours;
		else this.hours = 0;
	}
	
	protected void setMinutes(int minutes) {
		if(minutes >= 0 && minutes <= 60) this.minutes = minutes;
		else this.minutes = 0;
	}

	protected void setSeconds(int seconds) {
		if(seconds >= 0 && seconds <= 60) this.seconds = seconds;
		else this.seconds = 0;
	}
	
	protected int getHours() {
		return hours;
	}
	
	protected int getMinutes() {
		return minutes;
	}
	
	protected int getSeconds() {
		return seconds;
	}
	
	protected void add(int hours, int minutes, int seconds) {
		this.hours += hours;
		this.minutes += minutes;
		this.seconds += seconds;
		while (this.seconds > 60) {
			seconds -= 60;
			minutes ++;
		}
		while (this.minutes > 60) {
			minutes -= 60;
			hours ++;
		}
	}
}
