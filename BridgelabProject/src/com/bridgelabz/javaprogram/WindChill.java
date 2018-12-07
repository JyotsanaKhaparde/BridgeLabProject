/*
 * Purpose:program that take 2 double values from user and print windchill
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter t in fahrenheit: ");
		double t = Utility.getDouble();
		System.out.println("Enter v in miles per hour: ");
		double v = Utility.getDouble();
		Utility.getWindChill(t,v);
	}

}
