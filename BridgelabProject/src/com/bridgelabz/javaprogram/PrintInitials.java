package com.bridgelabz.javaprogram;
import java.io.*;
import java.util.Scanner;

import utility.Utility;

public class PrintInitials {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please Enter 1 for print K or 2 for print D or 3 for print W : ");
		int s = Utility.getInt();
		PrintInitials.enterValue(s);
	}
		


private static void enterValue(int s) throws FileNotFoundException {
		switch (s) {
		case 1:
			System.out.println("Entered String is K");
			PrintInitials.patternOfK(s);
			break;
		case 2:
			System.out.println("Entered String is D");
			PrintInitials.patternOfD(s);
			break;
		case 3:
			System.out.println("Entered String is W");
			PrintInitials.patternOfW(s);
			break;

		default:
			System.out.println("invalid input please enter again : ");
			int s1 = Utility.getInt();
			PrintInitials.enterValue(s1);
			break;
		}

	}



	private static void patternOfK(int s) throws FileNotFoundException {
		String str="";
		Scanner reader = new Scanner(new File("KPrintInitials.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();

		for(int j = 0 ; j<13 ; j++) {
			
			char x = str.charAt(j);
			if(x=='1') {
				System.out.print("*");
			}
			if(x=='0') {
				System.out.print(" ");
			}
		}
		System.out.println("");
		}
			
			}
			
	
			
		
	static void patternOfD(int s) throws FileNotFoundException {
		String str="";
		Scanner reader = new Scanner(new File("DPrintInitials.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();

		for(int j = 0 ; j<14 ; j++) {
			
			char x = str.charAt(j);
			if(x=='1') {
				System.out.print("*");
			}
			if(x=='0') {
				System.out.print(" ");
			}
		}
		System.out.println("");
		}
	
			
			}
		
	



	private static void patternOfW(int s) throws FileNotFoundException {
		String str="";
		Scanner reader = new Scanner(new File("WPrintInitials.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();

		for(int j = 0 ; j<31 ; j++) {
			
			char x = str.charAt(j);
			if(x=='1') {
				System.out.print("*");
			}
			if(x=='0') {
				System.out.print(" ");
			}
		}
		System.out.println("");
		}
		
	}
}

		
	


