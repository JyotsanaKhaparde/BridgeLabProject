/*
 * Purpose: to find number of won made.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   30-11-2018
 *
 */
package com.bridgelabz.javaprogram;

import utility.Utility;

public class gamlingSimulator {
	public static void main(String[] args) {
		System.out.println("Enter stake: ");
		int stake = Utility.getInt();
		System.out.println("Enter goal: ");
		int goal = Utility.getInt();
		System.out.println("Enter trails: ");
		int trails = Utility.getInt();
		Utility.trails(stake,goal,trails);
		
	}

}
