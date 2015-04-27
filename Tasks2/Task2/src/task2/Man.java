package task2;

public class Man extends HomoSapiens{

    @Override
    public String toString() {
	return "Man, named " + secondName
		+ " " + firstName + ", weighing " + width + " kilo and growth "
		+ height;
    }

    public Man(String secondName, String firstName,  double width, double height) {
	super(Sex.Male, secondName, firstName, width, height);	
    }
    
    

}
