/*
 * Purpose:program for find present value bt calculating formula.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.Utility;
import utility.MathFunctions;

public class PresentValue {
public static void main(String[] args) {
	System.out.println("Enter invest dollars: ");
	float c = Utility.getFloat();
	System.out.println("Enter interest rate: ");
	float r = Utility.getFloat();
	System.out.println("Enter time period: ");
	float t = Utility.getFloat();
	double value=MathFunctions.presentValue(c , r, t);

	System.out.println("value is : "+value);
}
}
