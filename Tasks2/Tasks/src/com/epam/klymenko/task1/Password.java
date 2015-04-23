package com.epam.klymenko.task1;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a password:\n");
	while (scanner.hasNext()) {
	    String pass = scanner.nextLine();
	    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,10}";
	    String numbers = "(.*[0-9].*)";
	    if (pass.matches(pattern)) {
		System.out.println("Good password!");
	    }
	    else if  (pass.length() < 8)
		System.out
			.println("Make your password at least 8 characters in length!");
	    else if (pass.contains(" "))
		System.out.println("No whitespace allowed in the password!");
	    else if (!pass.matches(numbers))
		System.out
			.println("Make your password contain at least one number!");
	    else
		System.out
			.println("Let me explain!\n- a lower case letter must occur at least once\n- an upper case letter must occur at least once\nExample: aaZZa445");
	}

    }
}
