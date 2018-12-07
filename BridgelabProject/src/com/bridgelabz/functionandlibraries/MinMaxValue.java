/*
 * Purpose:program to find minimum and maximum value of an array.
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

public class MinMaxValue {
	public static void main(String[] args) {
		
		//take any random value from user
		
		System.out.println("Enter random value: ");
		int n = MathFunctions.getInt();
		int [] arry = new int[n];

		System.out.println("Enter value in array :");
		for(int i = 0 ; i < n ;i++ ) {
			arry[i]=Utility.getInt();

		}
		
		 //it will call maxValue(int n) method

		int max = MathFunctions.maxValue(n, arry);
		System.out.println("Maximum value is : "+max);
		
		 //it will call minValue(int n) method

		int min = MathFunctions.minValue(n, arry);
		System.out.println("Minimum value is : "+min );

		
	}

}
