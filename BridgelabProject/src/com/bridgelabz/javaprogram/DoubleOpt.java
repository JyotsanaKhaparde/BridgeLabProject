/*
 * Purpose:To Find the operation and take double value from user.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   27-11-2018
 *
 */

package com.bridgelabz.javaprogram;


import utility.Utility;

public class DoubleOpt {
	public static void main(String[] args) {
		
		System.out.println("Enter the value of a,b,c: ");
		double a = Utility.getDouble();
		double b = Utility.getDouble();
		double c = Utility.getDouble();
		
        Utility.getDoubleopt(a, b, c);
	}

}
