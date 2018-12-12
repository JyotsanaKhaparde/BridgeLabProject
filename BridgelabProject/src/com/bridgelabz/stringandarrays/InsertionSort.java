package com.bridgelabz.stringandarrays;

import utility.Utility;

/**
* Purpose:program to perform insertion sort and give sorted number.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   08-12-2018 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int n;

		//take ant number from user till want you want to display sorted value
		
		System.out.println("Enter any number : ");
		n = Utility.getInt();
		int array[] = new int[n];
		Utility.insertionSort(array,n);

		if(n<0) {
			System.out.println("please enter positive number: ");
			n = Utility.getInt();
			Utility.insertionSort(array,n);
		}else {
			Utility.insertionSort(array,n);

		}
		
				
	}

}
