/*
 * Purpose:To Find print the sum of two random integers between 1 and 6.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class SumOfTwoDice {
	public static void main(String[] args) {
		
		// calling method 
		
		int sum;
		sum=Utility.getSumOfTwoDice();

		System.out.println("Sum of both random number is:  "+sum);

		
		
	}

}
