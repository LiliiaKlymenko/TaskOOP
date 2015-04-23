package task0_1;

public class Main {

    public static void main(String[] args) {

	Train train = new Train();

	Wagon wagon1 = new Wagon(10, 98, 98);
	Wagon wagon2 = new Wagon(12, 68, 70);
	Wagon wagon3 = new Wagon(8, 79, 50);
	Wagon wagon4 = new Wagon(10, 79, 79);
	train.attachWagon(wagon1);
	train.attachWagon(wagon2);
	train.attachWagon(wagon2);
	train.attachWagon(wagon3);

	System.out.println("Train " + train.getNumber() + " "
		+ train.getStations() + " consists of "
		+ train.getSumPassangers() + " seats and "
		+ train.getSumBaggage() + " baggage spaces");

	train.printWagons();
	train.sortWagons();
	System.out.println("Before sort by comfort level");
	train.printWagons();
	System.out.println("Find wagons from range");
	train.findWagonsByPassangers(20, 90);
    }

}
