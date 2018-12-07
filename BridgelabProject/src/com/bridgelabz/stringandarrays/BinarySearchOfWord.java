/**
 * purpose :Read in a list of words from File. Then prompt the user to enter a word to
 *  search the list. The program reports if the search word is found in the list.
 * @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   06-12-2018
 *  
 */
package com.bridgelabz.stringandarrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import utility.Utility;


public class BinarySearchOfWord {
	public static void main(String[] args) throws IOException {
		
		//take integer from user
		
		System.out.println("Enter any word for checking : ");
		String word = Utility.getString();
		
		//Read in a list of words from File
		
		String str="";
		Scanner reader = new Scanner(new File("BinarySrarchOfWord.txt"));
		while (reader.hasNext()){
			str = reader.nextLine();
	  }
		//System.out.println(str);
		String s = str;
		String check = "";
        String[] arrOfStr = s.split(",", 4); 
        
        // this code is for same output without binary search.
        
		/* String[] string = new String[str];
        
     	for (String a : arrOfStr) 
            System.out.println(a); 
		for(int i = 0 ; i < arrOfStr.length ; i++) {
			if(word.equals(arrOfStr[i])) {
				check = arrOfStr[i];
			}
			}*/
        
        // search the word with binary search.
        
        int first = 0;
        int last = arrOfStr.length;
        int mid  =  (first + last)/2;
        
        //loop for search words upto mid point.
        
        
        for(int i = 0 ; i <= mid ; i++) {
        	if(word.equals(arrOfStr[i])) {
        		check = arrOfStr[i];
        	}
        }
        
        //loop for search word after mid point.
        
        for(int i = mid ; i < last ; i++) {
        	if(word.equals(arrOfStr[i])) {
        		check = arrOfStr[i];
        	}
        }
		
			if(word.equals(check)) {
				System.out.println("yes, word is found");

			}
		else {
				System.out.println("word is not found");
			}
		}
	}
	 
	
	
