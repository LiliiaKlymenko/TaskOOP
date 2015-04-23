package task1;

public abstract class Drink implements Comparable<Drink>{

    @Override
    public String toString() {
	return "Drink [name:" + name + ", price:" + price + ", packing:"
		+ packing + "]";
    }

    protected String name;
    protected double price;
    protected Paking packing;

    Drink() {
    }

    Drink(String name, double price, Paking packing) {
	this.name = name;
	this.price = price;
	this.packing = packing;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public Paking getPacking() {
	return packing;
    }

    public void setPacking(Paking packing) {
	this.packing = packing;
    }

    @Override
    public int compareTo(Drink o) {	
	return 0;
    }

}
