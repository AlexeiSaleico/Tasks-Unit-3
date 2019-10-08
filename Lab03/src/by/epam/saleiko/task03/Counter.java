package by.epam.saleiko.task03;

public class Counter {
	private int position;
	private int lower;
	private int upper;
	Counter(){
		position = 0;
		lower = 0;
		upper = 10;	
	}
	
	Counter(int position, int lower, int upper){
		this.lower = lower;
		this.upper = upper;
		if (testBound(position))
			this.position = position;
		else this.position = lower;	
	}
	
	private boolean testBound(int position) {
		if ( position < lower || position > upper ) {
			System.out.println("—чЄтчик вне диапозона!");
			return false;
		}
		return true;
	}
	
	protected void inc() {
		if (testBound(position + 1)) position++;
	}
	
	protected void dec() {
		if (testBound(position - 1)) position--;
	}
	
	protected int value() {
		return position;
	}
	
	protected int getLower() {
		return lower;
	}
	
	protected int getUpper() {
		return upper;
	}
}
