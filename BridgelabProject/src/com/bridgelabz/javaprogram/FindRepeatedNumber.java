/*
 * Purpose:To Find repeated number of unshorted array
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   29-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class FindRepeatedNumber {
	public static void main(String[] args) {
		int[] number = new int[5];
		System.out.println("Please enter positive numbers: ");
      for(int i=0;i<number.length;i++) {
	 number[i] = Utility.getInt();
}
		
		Utility.getRepeatedNumber(number);
	}

}
