package task2;

import java.util.Random;
import java.util.Scanner;

public abstract class  HomoSapiens {

    protected Sex sex;
    protected String secondName;
    protected String firstName;
    protected double width;
    protected double height;
    protected Random random = new Random();

    protected HomoSapiens() {
    };

    protected HomoSapiens(Sex sex, String secondName, String firstName,
	    double width, double height) {
	this.sex = sex;
	this.secondName = secondName;
	this.firstName = firstName;
	this.width = width;
	this.height = height;
    }

    public static HomoSapiens createHomoSapiens() {

	HomoSapiens person;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Type the person`s sex (Male or Female): ");	
	String sex = sc.next();	    
	System.out.println("Type the First name: ");
	String firstName = sc.next();
	System.out.println("Type the Second name: ");
	String secondName = sc.next();
	System.out.println("Type the Weight: ");
	double width = Double.parseDouble((sc.next()));
	System.out.println("Type the Height: ");
	double height = Double.parseDouble((sc.next()));
	
	if (sex.equals("Male")) {
	    person = new Man(secondName, firstName, width, height);
	   } else if (sex.equals("Female")) {
	       person = new Woman(secondName, firstName, width, height);
	} else {
	    throw new IllegalArgumentException("unknown");
	}
	
	return person;
    }

    public boolean talk(HomoSapiens man) {
	if (man.getSex().equals(Sex.Male) && this.getSex().equals(Sex.Male)) {
	    if (random.nextDouble() <= 0.5) {
		System.out.println("Easy to talk...");
		return true;
	    } else
		System.out.println("Ñannot find common ground...");
	    return false;
	} else
	    System.out.println("Easy to talk...");
	return true;
    }

    public boolean patience(HomoSapiens man) {
	if (!man.getSex().equals(this.getSex())) {
	    if (random.nextDouble() <= 0.7) {
		System.out.println("Make peace");
		return true;
	    } else
		System.out.println("Ñannot stand each other...");
	    return false;
	}
	if (man.getSex().equals(Sex.Male) && this.getSex().equals(Sex.Male)) {
	    if (random.nextDouble() <= 0.056) {
		System.out.println("Make peace");
		return true;
	    } else
		System.out.println("Ñannot stand each other...");
	    return false;
	}

	if (man.getSex().equals(Sex.Female) && this.getSex().equals(Sex.Female)) {
	    if (random.nextDouble() <= 0.05) {
		System.out.println("Make peace");
		return true;
	    } else
		System.out.println("Ñannot stand each other...");
	    return false;
	}
	System.out.println("Ñannot stand each other...");
	return false;

    }

    public boolean spendTimeTogether(HomoSapiens man) {
	Double dif = Math.abs(man.getHeight() - this.getHeight());
	if (dif > man.getHeight() * 0.1 && dif > this.getHeight() * 0.1) {
	    if (random.nextDouble() <= 0.85) {
		System.out.println("Have a good time together");
		return true;
	    } else
		System.out.println("Had a falling out");
	    return false;
	} else if (random.nextDouble() <= 0.95) {
	    System.out.println("Have a good time together");
	    return true;
	} else
	    System.out.println("Had a falling out");
	return false;

    }

    public HomoSapiens hasRelation(HomoSapiens partner) {

	if (this.talk(partner) == true & this.patience(partner) == true
		& this.spendTimeTogether(partner) == true) {
	    System.out.println("Are compatible");
	    if (this.getSex().equals(partner.getSex())) {
		System.out.println("but its hardly...");
		return null;
	    }
	    if (this.getSex().equals(Sex.Female)) {
		System.out.println("They have done it!");
		return ((Woman) this).giveBirth(this);
	    }
	    if (partner.getSex().equals(Sex.Female)) {
		System.out.println("They have done it!");
		Woman woman = (Woman) partner;
		woman.toString();
		return woman.giveBirth(this);
	    }

	} else
	    System.out.println("Nothing happens...");
	return null;

    }

    public Sex getSex() {
	return sex;
    }

    public void setSex(Sex sex) {
	this.sex = sex;
    }

    public String getSecondName() {
	return secondName;
    }

    public void setSecondName(String secondName) {
	this.secondName = secondName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public double getWidth() {
	return width;
    }

    public void setWidth(double width) {
	this.width = width;
    }

    public double getHeight() {
	return height;
    }

    public void setHeight(double height) {
	this.height = height;
    }

    @Override
    public String toString() {
	if (this.getSex().equals(Sex.Female))
	    return "Woman, named " + secondName + " " + firstName
		    + ", weighing " + width + " kilo and growth " + height;
	else
	    return "Man, named " + secondName + " " + firstName + ", weighing "
		    + width + " kilo and growth " + height;

    }
}
