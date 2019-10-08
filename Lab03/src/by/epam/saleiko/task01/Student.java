package by.epam.saleiko.task01;

public class Student {
	private String surname;
	private String initials;
	private int group;
	private int[] marks;
	
	Student(){
		marks = new int[5];
	}
	
	Student(String surname, String initials) {
		this();
		this.surname = surname;
		this.initials = initials;
	}
	
	protected String getSurname(){
		return surname;
	}
	
	protected String getInitials() {
		return initials;
	}
	
	protected void setGroup(int group) {
		this.group = group;
		
	}
	protected int getGroup() {
		return group;
	}
	
	protected void setMarks(int[] marks) {
		if (marks.length == 5) this.marks = marks.clone();
		else System.out.println("Неверное количесво оценок");	
	}
	
	protected int[] getMarks() {
		return marks;
	}
	
}
