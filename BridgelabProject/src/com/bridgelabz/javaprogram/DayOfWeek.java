/*
 * Purpose:To Find monthly day of week by taking input date from user 
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 *
 */


package com.bridgelabz.javaprogram;

import utility.Utility;

public class DayOfWeek {
public static void main(String[] args) {
	System.out.println("Enter Year: ");
	int y = Utility.getInt();
	System.out.println("Enter Month: ");
	int m = Utility.getInt();
	System.out.println("Enter Day: ");
	int d = Utility.getInt();
	Utility.getDayOfWeek(y,m,d);
	
}
}
