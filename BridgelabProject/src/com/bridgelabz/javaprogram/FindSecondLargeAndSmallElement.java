/*
 * Purpose:To Find second largest and smallest number in array
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   29-11-2018
 *
 */

package com.bridgelabz.javaprogram;

import utility.Utility;

public class FindSecondLargeAndSmallElement {
	public static void main(String[] args) {
		System.out.println("Please Enter positive values : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]<0) {
				System.out.println("please enter positive number: ");
				a[i] = Utility.getInt();

			}else {
			a[i] = Utility.getInt();
			}
		}
		Utility.getSecondLargeAndSmallElement(a);
	}

}