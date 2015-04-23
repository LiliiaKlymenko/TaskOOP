package com.epam.klymenko.task1;

import java.io.IOException;
import java.util.Scanner;

public class Hello  {

    public static void main(String[] args) throws IOException {
	
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("What is your name?\n");

	    while (scanner.hasNext()) {
		String name = scanner.nextLine();
		System.out.println("Hello, " + name);

	    }	

    }

}