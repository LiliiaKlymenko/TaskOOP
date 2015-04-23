package task1;

import java.util.AbstractList;
import java.util.Arrays;

import task0_1.Wagon;

public class ListOfDrinks {

    private Drink[] listOfDrinks;
    static final int DEFAULT_CAPACITY = 100;
    int capacity;
    int num;

    public ListOfDrinks(int capacity) {
	this.capacity = capacity;
	listOfDrinks = new Drink[capacity];
	num = 0;
    }

    public Object get(int index) {
	// find the element at given index
	if (index < 0 || index >= num) {
	    throw new RuntimeException("index out of bounds");
	}
	return listOfDrinks[index];
    }

    public void add(Drink element) {
	if (num == capacity) {
	    Drink[] newListOfDrinks = new Drink[num + 1];
	    for (int i = 0; i < num; i++) {
		newListOfDrinks[i] = listOfDrinks[i];
	    }
	    listOfDrinks = newListOfDrinks;
	    capacity = capacity + 1;
	}
	listOfDrinks[num] = element;
	num++;
    }

    public int count() {
	return listOfDrinks.length;

    }

    public void sort() {
	for (int i = 0; i < listOfDrinks.length; i++) {
	    for (int j = 0; j < listOfDrinks.length - 1; j++) {
		if (listOfDrinks[j].getPrice() < listOfDrinks[j + 1].getPrice()) {
		    Drink temp = listOfDrinks[j];
		    listOfDrinks[j] = listOfDrinks[j + 1];
		    listOfDrinks[j + 1] = temp;
		}
	    }
	}
    }

    @Override
    public String toString() {
	String str = " ";
	for (int i = 0; i < listOfDrinks.length; i++) {
	    // if (!(listOfDrinks[i].equals(null))) {
	    // break;
	    // }
	    str += listOfDrinks[i].toString().toString() + " ";
	}
	return str;
    }

    public double avgPrice() {
	double sumPrice = 0;
	for (int i = 0; i < listOfDrinks.length; i++) {
	    sumPrice += listOfDrinks[i].getPrice();
	}
	return sumPrice / listOfDrinks.length;

    }

}
