/*
 * Purpose:program to check the number is prime or not.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.Utility;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		int n = Utility.getInt();
		if(isPrime(n)) {
			System.out.println("true");
		}else {
			System.out.print("false");
		}
	}

	public static boolean isPrime(int n) {
		int n1;
		if(n<0) {
			System.out.println("please enter positive number: ");
			 n1 = Utility.getInt();
			 return CheckPrime.isPrime(n1);
		}
		
		if(n<=1) {
			return false;
		}else {
			for(int i = 2 ; i < Math.sqrt(n) ; i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

}
