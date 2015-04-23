package task0;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Car[] array = new Car[] {
		new Car(),
		new Car(1, "chevrolet", "cruse", 2012, "black", 23000, 7887),
		new Car(2, "lada", "kalina", 2007, "red", 15000, 0112),
		new Car(3, "landrover", "evoque", 2014, "silver", 2300000, 7777),
		new Car(4, "daewoo", "sence", 2010, "blue", 19000, 3249) };
	
	System.out.println("func1:\n");
	brandList(array, "chevrolet");
	System.out.println("func2:\n");
	modelAndYearList(array, "kalina");
	System.out.println("func3:\n");
	yearAndPriceList(array, 2014, 10000);

    }

    public static void brandList(Car[] array, String brand) {
	for (Car car : array) {
	    if (car.getBrand().equals(brand)) {
		System.out.println(car.toString());
	    }
	}
    }

    public static void modelAndYearList(Car[] array, String model) {
	Date date = new Date();
	for (Car car : array) {
	    if (car.getModel().equals(model)) {
		int operationYears = date.getYear() - car.getYear() + 1900;		
		if (operationYears > 6) {
		    System.out.println(car.toString());
		}

	    }
	}
    }

    public static void yearAndPriceList(Car[] array, int year, double price) {
	for (Car car : array) {
	    int carYear = car.getYear();	   
	    if ((carYear == year) && (car.getPrice() > price)) {
		System.out.println(car.toString());
	    }
	}
    }

}
