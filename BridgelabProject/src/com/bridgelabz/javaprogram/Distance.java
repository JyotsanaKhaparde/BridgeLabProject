/*
 * Purpose:To Find Euclidean distance.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */


package com.bridgelabz.javaprogram;

import utility.Utility;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter  value of x : ");
		double x = Utility.getDouble();
		System.out.println("Enter  value of x : ");
		double y = Utility.getDouble();
		double distance = 0;
		distance = Utility.getDistence(x,y);
		System.out.println("Euclidean distance is : "+distance);
	}

}
