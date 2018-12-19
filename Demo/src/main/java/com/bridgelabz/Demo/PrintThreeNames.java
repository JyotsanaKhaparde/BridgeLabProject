package com.bridgelabz.Demo;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		
		System.out.println("Enter name: ");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		PrintThreeNames.getPrintThreeName(str);
	}

public static void getPrintThreeName(String str) {
	String a[] = str.split(" ");
	for(int i=0 ; i<a.length ; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println(""); 
	System.out.print("hii ");
	
	
	 // loop for reverse words
	 
	for(int i=a.length-1 ; i>=0 ; i--) {
		System.out.print(a[i]+" ");
	}
	}
}
