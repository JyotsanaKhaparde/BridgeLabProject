package com.bridgelabz.stringandarrays;

import utility.Utility;

public class MergeSortOfString {
	public static void main(String[] args) {
		System.out.println("Enter number till that you want to print string : ");
		int n = Utility.getInt();
		String array[] = new String[n];
		Utility.mergeSort(array, n);
		}
	
}
