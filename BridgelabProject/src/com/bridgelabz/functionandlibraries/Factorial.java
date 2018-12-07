/*
 * Purpose:program to check factorial of a number.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.Utility;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		int n = Utility.getInt();
		if(n<0) {
			System.out.println("please enter positive number: ");
			int n1 = Utility.getInt();
			long fact = Utility.factorial(n1);
			System.out.println("factorial is : "+fact );


		}else {
		long fact = Utility.factorial(n);
		System.out.println("factorial is : "+fact );
		}
		}

}
