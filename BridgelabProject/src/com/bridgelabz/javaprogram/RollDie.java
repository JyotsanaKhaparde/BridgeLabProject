/*
 * Purpose:To generate the result of rolling a fair six-sided die and suggest which number between 1 to 6
 * is maximum number.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   30-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class RollDie {
	public static void main(String[] args) {
		//int k=8;
		System.out.println("Enter that how many times that die will be roll: ");
		int n = Utility.getInt();
		Utility.rollingDie(n);
	}

}
