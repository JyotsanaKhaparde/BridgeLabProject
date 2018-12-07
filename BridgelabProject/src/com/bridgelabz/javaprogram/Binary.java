/*
 * Purpose:Take decimal number and convert it into binary number.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   01-12-2018
 *
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Please enter decimal number: ");
		int decimal = Utility.getInt();
		Utility.decimalToBinary(decimal);
	}

}