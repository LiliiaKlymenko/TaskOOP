package task2;

import java.util.Scanner;

public class Woman extends HomoSapiens {

    @Override
    public String toString() {
	return "Woman, named " + secondName + " " + firstName + ", weighing "
		+ width + " kilo and growth " + height;
    }

    public Woman(String secondName, String firstName, double width,
	    double height) {
	super(Sex.Female, secondName, firstName, width, height);
    }

    public HomoSapiens giveBirth(HomoSapiens man) {
	secondName = man.getSecondName();
	if (random.nextDouble() <= 0.5) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Congradulations!!! You have a boy! Type the baby`s name:");
	    String firstName = sc.nextLine();
	    double width = (man.getWidth()*0.1+(man.getWidth()-this.getWidth()))*0.1  ;
	    double height = ((man.getHeight()*0.1)+(this.getHeight()*0.1)+0.2);
	    HomoSapiens boy = new Man(secondName, firstName, width, height);
	    System.out.println(boy.toString() + " is born");

	    return boy;
	} else {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Congradulations!!! You have a girl! Type the baby`s name:");
	    String firstName = sc.nextLine();
	    double width = (this.getWidth()*0.1+(man.getWidth())-this.getWidth())*0.1;
	    double height = ((this.getHeight()*0.1)+(man.getHeight()*0.1)+0.2);
	    HomoSapiens girl = new Woman(secondName, firstName, width, height);
	    System.out.println(girl.toString() + " is born");
	    return girl;
	}
    }
}
