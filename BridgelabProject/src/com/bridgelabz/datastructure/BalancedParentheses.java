package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) throws FileNotFoundException {
		//Utility.or(number);
		//String str="";
		//int count1 = 0;
		//int count2 =0;
		/*Scanner reader = new Scanner(new File("BalancedParentheses.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();
	
		}*/
		System.out.println("Enter expression: ");
		String str = Utility.getString();
		
		IStack<Character> obj = new StackMethods<>();

		char[] arr=str.toCharArray();
	/*	for(int i = 0 ; i < arr.length ; i ++) {
			obj.push(arr[i]);
		}*/
		
		for(int i = 0 ; i < arr.length ; i++) {
		 //while(size != null) {
			
			if(obj.contain('(')) {
				System.out.println(obj.push('('));
				//count1++;
			}
			if(obj.contain(')')){
				System.out.println(obj.pop());
				//count2++;

			}
			
		}
		if(obj.isEmpty()) {
			System.out.println("Parentheses are balanced");
		}else {
			System.out.println("Parentheses are not balanced");
		}
		//System.out.println("count1 is: "+obj.);
		//System.out.println("count2 is: "+count2);


		
		/*if(count1 == count2) {
			System.out.println("Parentheses are balanced");
		}else {
			System.out.println("Parentheses are not balanced");
		}*/
		
		//System.out.println(obj);

	}

}
