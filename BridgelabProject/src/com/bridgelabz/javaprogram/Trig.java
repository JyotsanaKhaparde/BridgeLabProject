/*
 * Purpose:To Find the trigonometric number.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class Trig {
public static void main(String[] args) {
	System.out.println("Enter degrees: ");
	double degrees;
	degrees = Utility.getDouble();
	Utility.getTrig(degrees);
}
}