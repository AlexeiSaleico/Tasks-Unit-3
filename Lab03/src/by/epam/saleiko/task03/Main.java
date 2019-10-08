package by.epam.saleiko.task03;

public class Main {
	public static void main(String[] args) {
		Counter c = new Counter();
		for (int i = 0; i < 11; i++) {
			c.inc();
			System.out.println(c.value());
		}
		c = new Counter(3,5,10);
		System.out.println(c.value());
		c = new Counter(7,5,10);
		c.dec();
		System.out.println(c.value());
		System.out.println(c.getLower()+" "+c.getUpper());
		
	}
		
}
