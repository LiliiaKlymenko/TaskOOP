package task1;

public class Water extends Drink {
    
   
    public Water(boolean carbonated, String name, double price, Paking packing) {	
	super(name, price, packing);
	this.carbonated = carbonated;
    }
    
    public Water() {		
    }

    @Override
    public String toString() {
	return "Water [carbonated:" + carbonated + ", name:" + name
		+ ", price:" + price + ", packing:" + packing + "]\n";
    }

    protected boolean carbonated;

    public boolean isCarbonated() {
        return carbonated;
    }

    public void setCarbonated(boolean carbonated) {
        this.carbonated = carbonated;
    }   

}
