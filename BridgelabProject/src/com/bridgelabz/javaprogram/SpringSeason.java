/*
 * Purpose:program that takes two input values from user and print true or false.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */


package com.bridgelabz.javaprogram;



import utility.Utility;

public class SpringSeason {
	public static void main(String[] args) {
		System.out.println("Enter Month is: ");
		int m = Utility.getInt();
		System.out.println("Enter day is: ");
		int d = Utility.getInt();

		Utility.getSpringSeason(m,d);
		
		 
	}

}
