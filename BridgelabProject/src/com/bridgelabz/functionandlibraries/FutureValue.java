/*
 * Purpose:program to check fututeCalue take dollers, rate, period as input and 
 * calculate the formula.
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

public class FutureValue {

	public static void main(String[] args) {
		System.out.println("Enter invested dollars: ");
		float c = Utility.getFloat();
		System.out.println("Enter interest rate: ");
		float r = Utility.getFloat();
		System.out.println("Enter time period: ");
		float t = Utility.getFloat();
		double value=MathFunctions.futureValue(c , r, t);

		System.out.println("value is : "+value);
	}

}
