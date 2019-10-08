package by.epam.saleiko.task02;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		Train[] arr = new Train[n];
		String[] cities = {"Барановичи","Иваново","Петриков","Барань","Ивацевичи"};
		for (int i = 0; i < n; i++) {
			Date date = new Date();
			long temp = date.getTime() + (long)(Math.random() * 259200000) ;
			date = new Date(temp);
			arr[i] = new Train(cities[(int)(Math.random()*cities.length)], (int)(Math.random()*1000), date);
			System.out.println(arr[i].getDestination() +" "+ arr[i].getNumber() +" "+ arr[i].getDate().toString());
		}
		
		System.out.println("\nСписок поездов отсортированных по номеру");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if( arr[i].getNumber() > arr[j].getNumber() ) {
					Train temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i].getDestination() +" "+ arr[i].getNumber() +" "+ arr[i].getDate().toString());
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nВведите номер поезда: ");
		int number = scan.nextInt();
		for (int i = 0; i < n; i++) {
			if ( arr[i].getNumber() == number )
				System.out.println(arr[i].getDestination() +" "+ arr[i].getNumber() +" "+ arr[i].getDate().toString());		
		}
		
		System.out.println("\nСписок поездов отсортированных по пункуту назначения");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if( arr[i].getDestination().compareTo(arr[j].getDestination())>0 || ( arr[i].getDestination().compareTo(arr[j].getDestination())==0 && arr[i].getDate().compareTo(arr[j].getDate()) > 0 )) {
					Train temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i].getDestination() +" "+ arr[i].getNumber() +" "+ arr[i].getDate().toString());
		}
		
		
	}

}
