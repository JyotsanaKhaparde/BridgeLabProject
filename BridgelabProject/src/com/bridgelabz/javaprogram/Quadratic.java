/*
 * Purpose:To Find quadratic root.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;


public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter value of a,b,c: ");
		double a = Utility.getDouble();
		double b = Utility.getDouble();
		double c = Utility.getDouble();
		Utility.getQuadratic(a,b,c);
	
	}

}
