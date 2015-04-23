package task1;

import java.util.Date;

public class Juice extends Drink {
    
   
    protected String taste;
    protected Date expirationDate;

    public Juice(String taste, Date expirationDate, String name, double price, Paking packing) {	
	super(name, price, packing);
	this.taste = taste;
	this.expirationDate = expirationDate;	
    }
    
    public Juice() {		
    }
    
    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    @Override
    public String toString() {
	return "Juice [taste=" + taste + ", expirationDate=" + expirationDate
		+ ", name=" + name + ", price=" + price + ", packing="
		+ packing + "]\n";
    }
  

}
