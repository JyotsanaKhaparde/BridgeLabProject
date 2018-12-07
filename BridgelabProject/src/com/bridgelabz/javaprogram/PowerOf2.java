/*
 * Purpose:To print the table of power of 2.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   29-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class PowerOf2 {
public static void main(String[] args) {
	int n;
 System.out.println("Enter number: ");	
 n = Utility.getInt();
 Utility.getPowerOf2(n);
}
}
