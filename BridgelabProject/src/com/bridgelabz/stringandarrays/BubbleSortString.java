package com.bridgelabz.stringandarrays;

import utility.Utility;

public class BubbleSortString {
	public static void main(String[] args) {
		System.out.println("Enter number of string you want to enter : ");
		int n = Utility.getInt();
		
		
		String array[] = new String[n];
		Utility.bubbleSortString(array,n);
	}

}
