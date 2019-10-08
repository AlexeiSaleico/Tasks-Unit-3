package by.epam.saleiko.task01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n = 10;
		String[] popSurnames = {"�������",
				"������",
				"��������",
				"�������",
				"�����",
				"�������",
				"������",
				"�������",
				"�������",
				"������",
				"������",
				"��������",
				"��������",
				"������",
				"������",
				"������",
				"�������",
				"����������",
				"��������",
				"��������",
				"Ը�����",
				"��������",
				"������",
				"�������",
				"�����",
				"�������",
				"�����",
				"������",
				"�������",
				"�������",
				"������",
				"�����",
				"�����",
				"�������",
				"���������",
				"�������",
				"�������"};
		Student[] arr = new Student[n];
		
		for (int i = 0; i < n; i++) {
			String name = popSurnames[(int)(Math.random()*popSurnames.length)];
			if ( Math.random() < 0.5 ) name +="�";
			String initials = (char)(Math.random()*(1066-1040)+1040) + "."+ (char)(Math.random()*(1066-1040)+1040) + "." ;
			arr[i] = new Student(name,initials);
			arr[i].setGroup( (int)(Math.random()*10+1) );
			int[] marks = new int[5];
			
			for(int j = 0; j < 5; j++) {
				double temp = Math.random();
				marks[j] = (int)( 2.2*temp *(16*temp*temp -32*temp+21));
			}
			arr[i].setMarks(marks);
			System.out.println( arr[i].getSurname() +" "+ arr[i].getInitials() +" "+ arr[i].getGroup() +" ������"+"\n"+ Arrays.toString(arr[i].getMarks()));
			
		}
		
		System.out.println("���������:");
		for (int i = 0; i < n; i++) {
			boolean good = true;
			int [] marks = arr[i].getMarks();
			for (int j = 0; j < 5; j++) {
				if (marks[j] < 9) good = false;
			}
			if (good) {
				System.out.println(arr[i].getSurname()+" "+ arr[i].getGroup() +" ������ ");
			}
			
		}
	}
}
