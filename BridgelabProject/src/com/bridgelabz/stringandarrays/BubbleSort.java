package com.bridgelabz.stringandarrays;

import utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		int n ;
		System.out.println("Enter any number: ");
		n = Utility.getInt();
		int array[] = new int[n];
		Utility.bubbleSort(array,n);
		
		

		if(n<0) {
			System.out.println("please enter positive number: ");
			n = Utility.getInt();
			Utility.bubbleSort(array,n);
		}else {
			Utility.bubbleSort(array,n);

		}
	}

}
