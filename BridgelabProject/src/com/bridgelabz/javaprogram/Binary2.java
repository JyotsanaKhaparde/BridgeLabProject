/*
 * Purpose:Take decimal number and convert it into binary then take two nibbles and swap that niubble and convert it into decimal.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   30-12-2018
 *
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class Binary2 {
	public static void main(String[] args) {
		System.out.println("Please enter decimal number: ");
		int decimal = Utility.getInt();
		Utility.swapNibbles(decimal);
	}

}
