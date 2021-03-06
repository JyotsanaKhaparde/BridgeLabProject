package com.bridgelabz.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import utility.Utility;

public class MathFunctions {
//private static  String  = null;
static Scanner scan = new Scanner(System.in);
	
	/*
	 *  This method is used to take integer input from user
	 */
	
	public static int getInt() {
	int Integer = scan.nextInt();
	return Integer;
	}
	
	/*
	 *  This method is used to take float input from user
	 */
	
	public static float getFloat() {
		float Float = scan.nextFloat();
		return Float;
		}
	
	/*
	 *  This method is used to take string input from user
	 */

	public static String getString() {
		String string = scan.nextLine();
		return string;
		}
	public static String stringNext() {
		String string = scan.next();
		return string;
	}
	
	public static String getString(String[] string1) {
		String string = scan.nextLine();
		return string;
		}
	
	/*
	 *  This method is used to take double input from user
	 */

	public static double getDouble() {
		double Double = scan.nextDouble();
		return Double;
		}
	
	/*
	 *  This method is used to take long input from user
	 */

	public static long getLong() {
		long longvalue = scan.nextLong();
		return longvalue;
		}

	
	
	//****************************StringFunction***************************************
	
	/**
	 * @param input1 take first string from user
	 * @param input2 take second string from user
	 * @return true if string is anagram and false if string is not anagram
	 */
	
	public static boolean anagram(String input1, String input2) {
		
        //Remove all whitespace first

		String s1  =  input1.replaceAll("\\s", " ");
		String s2  =  input1.replaceAll("\\s", " ");
		
		boolean status = true;
		
		if(s1.length() != s2.length()) {
			return false;
		}else {
			
            //Convert into character array

			char[] s1Array = s1.toLowerCase().toCharArray();
			char[] s2Array = s2.toLowerCase().toCharArray();
			
            //Sorting both character array
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			//Check if both arrays are equal

			status = Arrays.equals(s1Array, s2Array);
			
		} if(status) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("String are not anagram");

		}

		return false;
			}
	//***********************************************StringFunctionB*********************************

	/**
	 * @param input take string from user 
	 * @return true if string is palindrom and false if string is not palindrom
	 */
	
	public static boolean isPalindrome(String input) {
		String temp=input;
		String rev="";
		int length = input.length(); 
		

		 for(int i = length - 1 ;i >= 0 ; i --) {
			 
			 rev = rev + input.charAt(i);
		 } 
		System.out.println(rev);
		boolean status = temp.equals(rev);
		System.out.println(status);
		 if(status) {
			// System.out.println("string is palindrom");
			 return true ;
		 }
		 else
		 {
			 //System.out.println("string is not palindrom");
			 return false;
		 }
		
		
	}
	
	//**********************************StringFunctionC*************************************************

	/**
	 * @param str take string from user
	 * @param l take integer from user 
	 * @param r take integer from user
	 */
	
	public static void permutation(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		}else {
			for(int i = l ; i <= r; i++) {
			str = swap(str , l ,i);
			permutation(str , l+1, r);
			str = swap(str, l, i);

		}
		}
		//return str;
		
	}

	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
	}
	
	//*******************Calender*****************************************************

	/**
	 * @param y  take integer from user 
	 * @param m  take integer from user 
	 * @param d  take integer from user 
	 * @return value of d0
	 */
	
	public static int dayOfWeek(int y, int m, int d) {
		if(y < 0 && m < 0 && d < 0) {
			y = MathFunctions.getInt();
			m = Utility.getInt();
			d = Utility.getInt();
			dayOfWeek(y, m, d);
		}
		
		
		int y0 = y - (14 - m) / 12;
        
        int x = y0 + y0/4 - y0/100 + y0/400;
        
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        int d0 = (d + x + (31*m0)/12) % 7;
		
		return d0;	
		}
	
	//*********************MathFunction10*********************************************

	/**
	 * @param n take integer from user
	 * @param take list of array from user
	 * @return maximum value 
	 */
	
	public static int maxValue(int n, int[] arry) {
		int max = arry[0];
		
		
		for(int i = 0 ; i <  arry.length ; i++ ) {
				if(arry[i] > max) {
					max = arry[i];
				}
			
		}
		return max;
	}

	/**
	 * @param n taking integer from user
	 * @param taking list of array from user 
	 * @return minimum value 
	 */
	
	public static int minValue(int n, int[] arry) {
		int temp;
		
		
		
		for(int i = 0 ; i <  arry.length ; i++ ) {
			for(int j = i+1 ; j < arry.length ; j++) {
				if(arry[i] > arry[j]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
 				}

			}
				
				}
		return arry[0];
			
		}
	
	//********************MathFunction12************************************************
	

	/**
	 * @param x1 take integer from user
	 * @param x2 take integer from user
	 * @param x3 take integer from user
	 * @param y1 take integer from user
	 * @param y2 take integer from user
	 * @param y3 take integer from user
	 * @return true if points are collinear and false if points are not collinear
	 */
	
	public static  boolean isSlope(int x1, int x2, int x3, int y1, int y2, int y3) {
		int slopAB = 0;
		int slopAC = 0;
		int slopBC = 0;
		try {
			 slopAB = (y2 - y1)/(x2 - x1);
			 slopBC = (y3 - y2)/(x3 - x2);
			 slopAC = (y1 - y3)/(x1 - x3);

		} catch (Exception e) {
			System.out.println("dividede by zero exception");
		}
				if(slopAB == slopBC && slopBC  == slopAC) {
					return true;
			//System.out.println("points are collinear if formed by slope");
		}else {
			return false;

			//System.out.println("points are not collinear formed by slope");

		}

	}
	
	
	public static  boolean triangle(int x1, int x2, int x3, int y1, int y2, int y3) throws Exception{
		int a = (x1 - x2);
		int b = (x2 - x3);
		int c = (y1 - y2);
		int d = (y2 - y3);
		
		int determine = (a*d) - (b*c);
		int triangle = (1/2)*determine;
		
		if(triangle == 0) {
			return true;
		}else {
			return false;
		}

	}
	
	//*************************StringFunctionE***************************************

	/**
	 * @param string1 take string from user
	 * @param string2 take string from user
	 */
	
	public static void stringFunctionE(String string1, String string2) {
		if(string1.equals(string2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("String are not equal");
		}
		
	}
	




//*********************MathFunction 8*******************************************

	/**
	 * @param c take float from user
	 * @param r take float from user
	 * @param t take float from user
	 * @return value by using formula
	 */
	
	public static double futureValue(float c, float r, float t) {
		double value;
		float c1;
		float r1;
		float t1;
		if(c<0 || r<0 || t<0) {
			System.out.println("please enter positive value: ");
			System.out.println("Enter invested dollars: ");
			 c1 = Utility.getFloat();
			System.out.println("Enter interest rate: ");
			r1 = Utility.getFloat();
			System.out.println("Enter time period: ");
			t1 = Utility.getFloat();
		}else {
		 value = (c*Math.pow((1+r), t));
			return value;

		}
		return MathFunctions.futureValue(c1 , r1, t1);


		
	}
	
	//**************************MathFunction9****************************************

	/**
	 * @param c take float from user
	 * @param r take float from user
	 * @param t take float from user
	 * @return value by using formula
	 */
	
	public static double presentValue(float c, float r, float t) {
		double value;
		float c1;
		float r1;
		float t1;
		if(c<0 || r<0 || t<0) {
			System.out.println("please enter positive value: ");
			System.out.println("Enter invest dollars: ");
			 c1 = Utility.getFloat();
			System.out.println("Enter interest rate: ");
			r1 = Utility.getFloat();
			System.out.println("Enter time period: ");
			t1 = Utility.getFloat();
		}else {
		 value = (c/Math.pow((1+r), t));
			return value;

		}
		return MathFunctions.futureValue(c1 , r1, t1);

	}
	
	//************************MathFunction4***************************************

	/**
	 * @param x take double from user
	 * @return result by using formula
	 */
	
	public static float sinAngle(double x) {
		float result  = (float) Math.sin( Math.toRadians( x ) ) ;
		return result;
		
	}

	public static double cosAngle(double xx) {
		float result  = (float) Math.cos( Math.toRadians( xx ) ) ;
		return result;
		//double x2 = Math.cos(xx);
		//double q = Math.toDegrees(x2);
		//return q;
	}
}


		

	

