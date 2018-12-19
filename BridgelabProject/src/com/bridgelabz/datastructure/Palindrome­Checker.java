package com.bridgelabz.datastructure;

import utility.Utility;

public class Palindrome­Checker {
	public static void main(String[] args) {
		
		MyDeque<Character> obj = new MyDeque<Character>();

		
		System.out.println("Enter any string : ");
		String string = Utility.getString();
		for(int i = 0 ; i < string.length() ; i++) {
			char data = string.charAt(i);
			obj.addToFront(data);
		}
		boolean count=true;
		
		while(obj.size() > 0) {
			if(obj.removeFront() != obj.removeRear()) {
				count = false;
				break;
			}
		}
		if(count==true) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrom");
		}
	}

}
