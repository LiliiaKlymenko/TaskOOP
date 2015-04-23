package task0;

import java.util.Date;

public class Car {
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private int registerNumber;
    
    Car(int id, String brand, String model, int year, String color, double price, int registerNumber){
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.year = year;
	this.color = color;
	this.price = price;
	this.registerNumber = registerNumber;
	
    }
    
    Car() {
	id = 0;
	brand = "Ford";
	model = "A";
	year = 2014;
	color = "white";
	price = 200000;
	registerNumber = 2103;
    }

    @Override
    public String toString() {	
	return "Car " + id + "\nbrand: " + brand + "\nmodel: " + model + "\nyear: " + year + "\nprice: " + price + "\nregistration number: " + registerNumber + "\n";
    }
    
   

    

}
