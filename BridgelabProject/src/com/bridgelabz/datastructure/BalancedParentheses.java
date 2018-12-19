package com.bridgelabz.datastructure;

import java.io.FileNotFoundException;

import utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) throws FileNotFoundException {
		
	
		
		System.out.println("Enter expression: ");
		String str = Utility.getString();
		
		StackMethods<Character> obj = new StackMethods<Character>();

		char[] arr=str.toCharArray();
	
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == '(') {
				obj.push('(');
			}
			if(arr[i] == ')'){
				obj.pop();

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
