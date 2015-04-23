package task0_1;

public class Wagon {    
  
    private int comfortLevel;
    private int passangerCapacity;
    private int baggageCapacity;
    
    Wagon(int comfortLevel, int passangerCapacity, int baggageCapacity){	
	this.comfortLevel = comfortLevel;
	this.passangerCapacity = passangerCapacity;
	this.baggageCapacity = baggageCapacity;	
    }
    
    Wagon(){
   	comfortLevel = 8;
   	passangerCapacity = 98;
   	baggageCapacity = 100;	
       }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    @Override
    public String toString() {
	return "Wagon"  + " [comfortLevel=" + comfortLevel + ", passangerCapacity="
		+ passangerCapacity + ", baggageCapacity=" + baggageCapacity
		+ "]";
    }

    

}
