package com.epam.klymenko.task1;

import java.io.IOException;
import java.util.Scanner;

public class Random_numbers {

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a number:");
	int n = scanner.nextInt();

	int[] array = new int[n];
	for (int i=0; i<n; i++){
	    array[i] = (int )(Math.random() * 50 + 1);
	}
	
	for (int i=0; i<n; i++){
	    System.out.print(array[i] + " ");
	}
	
	for (int i=0; i<n; i++){
	    System.out.println(array[i]);
	}
	
    }
}