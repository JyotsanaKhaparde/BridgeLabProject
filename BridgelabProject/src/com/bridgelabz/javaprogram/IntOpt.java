/*
 * Purpose:To Find operation and take integer value from user.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   27-11-2018
 *
 */

package com.bridgelabz.javaprogram;


import utility.Utility;

public class IntOpt {
	public static void main(String[] args) {
		System.out.println("Enter the value of a,b,c: ");
		int a = Utility.getInt();
		int b = Utility.getInt();
		int c = Utility.getInt();
		Utility.getIntOpt(a,b,c);
		
		
		
		
	}

}
