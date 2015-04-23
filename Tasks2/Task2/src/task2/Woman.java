package task2;

public class Woman extends HomoSapiens {

    @Override
    public String toString() {
	return "Woman, named " + secondName + " " + firstName + ", weighing "
		+ width + " kilo and growth " + height;
    }

    public Woman(Sex sex, String secondName, String firstName, double width,
	    double height) {
	super(sex, secondName, firstName, width, height);
    }

    public HomoSapiens giveBirth(HomoSapiens man) {
	secondName = man.getSecondName();
	if (random.nextDouble() <= 0.5) {
	    Man boy = new Man(Sex.Male, secondName, "Baby", 3.5, 50);
	    System.out.println(boy.toString() + " is born");

	    return boy;
	} else {
	    Woman girl = new Woman(Sex.Female, secondName, "Baby", 3.5, 50);
	    System.out.println(girl.toString() + " is born");
	    return girl;
	}
    }
}
