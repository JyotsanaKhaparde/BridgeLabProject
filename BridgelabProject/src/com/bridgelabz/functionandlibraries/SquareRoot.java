/*
 * Purpose:program to give sqrareRoot of a given number.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.Utility;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		double c = Utility.getDouble();
        double t = Utility.getSqrt(c);
        System.out.println("square root of c is : "+t);
	}

}
