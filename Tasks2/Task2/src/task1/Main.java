package task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	
	
	//boolean carbonated, String name, double price, Paking packing
	Water Murgorodska = new Water(true, "Миргородська", 7.80, Paking.Bottle);
	Water Sebek = new Water(true, "Себек", 3.50, Paking.Bottle);
	Water Esentuky = new Water(true, "Ессентуки", 3.50, Paking.Bank);
	//String taste, Date expirationDate, String name, double price, Paking packing
	Date date = new Date("17/07/2015");
	Juice Galicia = new Juice("Apple", date, "Galicia", 12.0, Paking.Bank);
	Juice Sadochok = new Juice("Orange", date, "Садочок", 8.9, Paking.Pack);
	Juice Agusha = new Juice("Pineapple", date, "Агуша", 3.70, Paking.Tetrapack);
	
	ListOfDrinks list = new ListOfDrinks(6);
	list.add(Murgorodska);
	list.add(Sebek);
	list.add(Esentuky);
	list.add(Galicia);
	list.add(Sadochok);
	list.add(Agusha);
	
	System.out.println("Drinks: \n");
	
	System.out.println(list.toString());
	System.out.println("Average price: " + list.avgPrice() + "\n");
	list.sort();
	System.out.println("Sorted drinks: (by price) \n");
	System.out.println(list.toString());

    }

}
