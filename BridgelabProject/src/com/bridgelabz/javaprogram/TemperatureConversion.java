/*
 * Purpose:Take tempreature from user in fahrenhit or celcius and convert it.
 *
 *  @author: Jyotsana Khaparde 
 *  @version 1.0
 *  @since   28-11-2018
 *
 */package com.bridgelabz.javaprogram;
import utility.Utility;

public class TemperatureConversion {
public static void main(String[] args) {
	System.out.println("Enter 1 to convert from celcius to fahrenhit");
	System.out.println("Enter 2 to convert from fahrenhit to celcius ");
	int choice=Utility.getInt();
	Utility.getTemperatureConversion(choice);

}
}
