/**
 * purpose :Read in a list of words from File. Then prompt the user to enter a word to
 *  search the list. The program reports if the search word is found in the list.
 * @author Jyotsana Khaparde 
 *  @version 1.0
 *  @since   06-12-2018
 *  
 */
package com.bridgelabz.stringandarrays;

import java.io.IOException;
import utility.Utility;


public class BinarySearchOfWord {
	public static void main(String[] args) throws IOException {
		
		//take integer from user
		
		System.out.println("Enter any word for checking : ");
		String word = Utility.getString();
		Utility.binarySearch(word);
		}
	}
	 
	
	

