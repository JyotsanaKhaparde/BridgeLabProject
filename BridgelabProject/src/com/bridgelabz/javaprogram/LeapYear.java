/*
 * Purpose:To Find leap year.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   27-11-2018
 *
 */

package com.bridgelabz.javaprogram;


import utility.Utility;

public class LeapYear {
public static void main(String[] args) {
	System.out.println("Enter year: ");
	int year = Utility.getInt();
	boolean x = Utility.getLeapYear(year);
	if(x) {
		System.out.println(year+" is leap year");

	}else {
		System.out.println(year+" is not leap year");

	}


	
}
}