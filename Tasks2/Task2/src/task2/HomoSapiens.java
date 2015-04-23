package task2;

import java.util.Random;

public class HomoSapiens {

    protected Sex sex;
    protected String secondName;
    protected String firstName;
    protected double width;
    protected double height;
    protected Random random = new Random();

    protected HomoSapiens(Sex sex, String secondName, String firstName,
	    double width, double height) {
	this.sex = sex;
	this.secondName = secondName;
	this.firstName = firstName;
	this.width = width;
	this.height = height;
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

    public HomoSapiens hasRelation(Woman woman) {
	if (this.talk(woman) == true & this.patience(woman) == true
		& this.spendTimeTogether(woman) == true) {
	    System.out.println("Are compatible");
	    if (this.getSex().equals(Sex.Female)) {
		System.out.println("but its hardly...");
		return null;
	    }
	    System.out.println("They have done it!");	    
	    return woman.giveBirth(this);
	}
	else
	    System.out.println("Nothing happens...");	
	    return null;
	
    }

    public HomoSapiens hasRelation(Man man) {
	if (talk(man) == true & patience(man) == true
		& spendTimeTogether(man) == true) {
	    System.out.println("Are compatible");
	    if (man.getSex().equals(this.getSex())) {
		return null;	    }
	    if (man.getSex().equals(Sex.Male))
		return man.hasRelation((Woman) this);
	}
	System.out.println("Nothing doing");
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

}
