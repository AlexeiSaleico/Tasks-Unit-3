package by.epam.saleiko.task02;

import java.util.Date;

public class Train {
	private String destination;
	private int number;
	private Date date;
	Train(String destination,int number,Date date){
		this.destination = destination;
		this.number = number;
		this.date = date;
	}
	
	protected String getDestination() {
		return destination;
	}
	
	protected int getNumber() {
		return number;
	}
	
	protected Date getDate() {
		return date;
	}
	
}
