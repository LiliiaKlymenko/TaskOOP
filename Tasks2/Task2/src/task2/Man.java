package task2;

public class Man extends HomoSapiens{

    @Override
    public String toString() {
	return "Man, named " + secondName
		+ " " + firstName + ", weighing " + width + " kilo and growth "
		+ height;
    }

    public Man(Sex sex, String secondName, String firstName,  double width, double height) {
	super(sex, secondName, firstName, width, height);	
    }
    
    

}
