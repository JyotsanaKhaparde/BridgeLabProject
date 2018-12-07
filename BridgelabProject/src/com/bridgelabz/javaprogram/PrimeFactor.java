/*
 * Purpose:To Find prime factorial of a given number
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   29-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Enter value of n: ");
		long n = Utility.getLong();
		
		Utility.primeFactor(n);
	}

}