package com.epam.klymenko.task1;

import java.text.ParseException;

public class Args_sum {
    public static void main(String[] args) throws ParseException {
	  int sum=0;
	  int mult=1;
	  for (int i = 0; i<args.length; i++) {
	    sum+=+Integer.parseInt(args[i]);
	    mult*=Integer.parseInt(args[i]);		    	    
		}
	System.out.print("Sum: " + sum + "\nMult: " + mult);
    }
  

}
