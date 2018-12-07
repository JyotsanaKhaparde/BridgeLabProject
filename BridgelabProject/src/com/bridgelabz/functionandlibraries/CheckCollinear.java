/*
 * Purpose:program to check collinear or not by using slop and triangle method.
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

public class CheckCollinear {
public static void main(String[] args) throws Exception {
	System.out.println("Enter value of x1 :");
	int x1 = Utility.getInt();
	System.out.println("Enter value of x2 :");
	int x2 = Utility.getInt();
	System.out.println("Enter value of x3 :");
	int x3 = Utility.getInt();
	System.out.println("Enter value of y1 :");
	int y1 = Utility.getInt();
	System.out.println("Enter value of y2 :");
	int y2 = Utility.getInt();
	System.out.println("Enter value of y3 :");
	int y3 = Utility.getInt();
	boolean x = MathFunctions.isSlope(x1,x2,x3,y1,y2,y3);
	boolean y = MathFunctions.triangle(x1, x2, x3, y1, y2, y3);
	if(x) {
		System.out.println("points are collinear if formed by slope");
	}else {
		System.out.println("points are not collinear formed by slope");
	}
	
	if(y) {
		System.out.println("points are collinear formed by triangle");
	}else {
		System.out.println("points are not collinear formed by triangle");

	}
}
}
