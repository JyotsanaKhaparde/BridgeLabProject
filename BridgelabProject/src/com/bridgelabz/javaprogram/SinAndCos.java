/*
 * Purpose:taylor series of sinx and cosx.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   01-12-2018
 *
 */
package com.bridgelabz.javaprogram;


import utility.Utility;

public class SinAndCos {
	public static void main(String[] args) {
		System.out.println("Enter value of x: ");
		double x = Utility.getDouble();
		System.out.println("Enter any number till that you want taylor series: ");
		int n = Utility.getInt();
		int sinx= (int) Utility.sin(x,n);
		System.out.println(sinx);
		int cosx=(int) Utility.cos(x, n);

		System.out.println(cosx);

		//System.out.println("Enter number for factorial: ");
		//int fact = Utility.getInt();
		//int resultfact =(int) Utility.factorial(fact);
		//System.out.println("factorial: "+resultfact);
		
	   

	}

	}

