package task0_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Train {

    private int number;
    private String stations;
    private int wagonCout;
    private List<Wagon> wagons;

    Train() {
	number = 795;
	stations = "Kharkiv-Dnipropetrovsk";
	wagonCout = 10;
	wagons = new ArrayList<Wagon>();
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

    public String getStations() {
	return stations;
    }

    public void setStations(String stations) {
	this.stations = stations;
    }

    public int getWagonCout() {
	return wagonCout;
    }

    public void setWagonCout(int wagonCout) {
	this.wagonCout = wagonCout;
    }

    @Override
    public String toString() {
	return "Train [number=" + number + ", stations=" + stations
		+ ", wagonCout=" + wagonCout + "]";
    }

    public void attachWagon(Wagon wagon) {
	if (wagons.size() == 10) {
	    System.out.println("Train can attach only 10 wagons");
	    return;
	}
	wagons.add(wagon);
    }

    public int getSumPassangers() {
	int sumPassagers = 0;
	for (Wagon a : wagons) {
	    sumPassagers += a.getPassangerCapacity();
	}
	return sumPassagers;
    }

    public int getSumBaggage() {
	int sumBaggage = 0;
	for (Wagon a : wagons) {
	    sumBaggage += a.getBaggageCapacity();
	}
	return sumBaggage;
    }
    
    public void sortWagons() {
	for(int i=0; i<wagons.size(); i++){
	    for(int j = 0; j < wagons.size()-1; j++ ){
		if (wagons.get(j).getComfortLevel()<wagons.get(j+1).getComfortLevel()){
		    Wagon temp = wagons.get(j);
		    wagons.set(j, wagons.get(j+1));
		    wagons.set(j+1, temp);
		}
	    }
	}
   
    }
    
    public void findWagonsByPassangers(int passanger0, int passanger1) {
	for (Wagon a : wagons) {
	    if(a.getPassangerCapacity() > passanger0 &&  a.getPassangerCapacity() < passanger1) {
		System.out.println(a.toString());
	    }
	}
	
	
    }
    
    public void printWagons(){
	for (Wagon a : wagons) {
	   System.out.println(a.toString());
	}
    }

}
