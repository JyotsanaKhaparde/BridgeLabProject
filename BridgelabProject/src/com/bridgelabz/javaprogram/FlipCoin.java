/*
 * Purpose:To Find number of times the coin flip and also calculate percentage.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   29-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		int flip = 0;
		System.out.println("Enter number of flip: ");
		if(flip<0) {
			System.out.println("Please enter positive value");
			flip = Utility.getInt();

		}else {
			flip = Utility.getInt();
		}
	Utility.getFlipCoin(flip);
	}

}
