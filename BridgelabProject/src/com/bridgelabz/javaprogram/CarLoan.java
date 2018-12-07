/*
 * Purpose:write a program to calculate monthly payment and taking y,p,r as a input by user.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class CarLoan {
	public static void main(String[] args) {
		System.out.println("Enter year : ");
		int Y = Utility.getInt();
		
		System.out.println("Enter principal : ");
		float P = Utility.getFloat();
		
		System.out.println("Enter rate : ");
		float R = Utility.getFloat();
		
		double payment = 0;
		payment = Utility.getCarLoan(Y,P,R);

		System.out.println("Monthly payment is: "+payment);

	}

}
