/*
 * Purpose:To print three name in reverse order.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   27-11-2018
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class PrintThreeName {
	public static void main(String[] args) {
		System.out.println("Enter name: ");
		String str=Utility.getString();
		Utility.getPrintThreeName(str);
	}
		 
}	