package com.bridgelabz.lib;


import utility.Utility;

//import java.util.Scanner;

import utility.MathFunctions;

public class StringFunctions {
	public static void main(String[] args) {
		System.out.println("Enter 1 for anagram,Enter 2 from palindrome,"
				+"Enter 3 for permutation using Iterative,"
		+ " Enter 4 for permutation recursion,Enter 5 for String function : ");
		int x = MathFunctions.getInt();
		
		switch(x){
		case 1:
			System.out.println("Enter first string :");
			String input1 =  MathFunctions.stringNext();
			System.out.println("Enter second string :");
			String input2 =  MathFunctions.stringNext();
			MathFunctions.anagram(input1,input2);
			break;
			
		case 2:
			System.out.println("Enter first string :");
			String input =  MathFunctions.stringNext();
			boolean x1 = MathFunctions.isPalindrome(input);
			if(x1) {
				System.out.println("string is palindrom");
			}else {
				System.out.println("string is not palindrom");
			}
			break;
			
		case 3:
			System.out.println("Enter string: ");
			String str = MathFunctions.stringNext();
			int l = str.length();
			MathFunctions.permutation(str,0,l-1);
			break;
			
		case 4:
			break;
			
		case 5:
			System.out.println("Enter first string: ");
			String string1 = Utility.getString();
			
			System.out.println("Enter first string: ");
			String string2 = Utility.getString();
			
			MathFunctions.matchString(string1, string2);
			break;
		default:
			break;	
			
		}

		
	}
}
