/*
 * Purpose:program for show harmonic number, sinx, cosx, and convert decmal to binary.
 *
 *  @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   05-12-2018
 *
 *
 */
package com.bridgelabz.functionandlibraries;

import utility.Utility;
import utility.MathFunctions;

public class PartOfWeek1 {
public static void main(String[] args) {
	
	System.out.println("Enter 1 for HarmonicNumber,Enter 2 for sinx,"
			+"Enter 3 for cosx,"
	+ " Enter 4 for Binary : ");
	int x = MathFunctions.getInt();

	switch (x) {
	case 1:
		//HarmonicNumber
		
		System.out.println("Enter any number : ");
		int n = Utility.getInt();
		double sum =  Utility.getHarmonic(n);
		System.out.println(sum);
		break;
		
	case 2:	
		//sinx
	    System.out.println("Enter value of angle: ");
		double x1 = Utility.getDouble();
		double x11 = MathFunctions.sinAngle(x1);
		System.out.println("value of sin "+x1+" is : "+x11);
		break;

	case 3: 
		
		//cosx
		 System.out.println("Enter value of x: ");
		double xx = Utility.getDouble();
		double x2 = MathFunctions.cosAngle(xx);
		System.out.println("value of cos "+xx+" is : "+x2);
		break;

	case 4:
		//Binary
				System.out.println("Please enter decimal number: ");
				int decimal = Utility.getInt();
				String reverse = Utility.decimalToBinary(decimal);
				System.out.println(" decimal to binary: "+reverse);
				break;

	default:
		break;
	}


	    
	   
		
	/*	System.out.println("Enter any number till that you want taylor series: ");
		int n1 = Utility.getInt();
		double sinx= Utility.sin(x,n);
		System.out.println("Sinx = "+sinx);*/
		
		
				
		
		
		



	  

}
}
