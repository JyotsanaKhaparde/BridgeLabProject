/*
 * Purpose:Take year , month and day and display day of date.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.MathFunctions;

public class Calender {
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		int y = MathFunctions.getInt();
		System.out.println("Enter Month: ");
		int m = MathFunctions.getInt();
		System.out.println("Enter Day: ");
		int d = MathFunctions.getInt();
		int day = MathFunctions.dayOfWeek(y, m, d);

		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		System.out.println("day of date is: "+week[day]);

		
	}

}
