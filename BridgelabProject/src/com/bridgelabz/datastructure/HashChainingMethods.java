package com.bridgelabz.datastructure;

import com.bridgelabz.functionandlibraries.CheckPrime;

import utility.Utility;

/**
 * @author Jyotsana Khaparde
 * Date 17-12-2018
 *
 */

public class HashChainingMethods {

	private HashNode[] table;
	private int size;
	
	//************************************************
	
	
	public  HashChainingMethods(int tableSize) {
		
		table = new HashNode[nextPrime(tableSize)]; 
		size = 0;
		
	}
	
	//************************************************
	
	
	
	public boolean isEmpty() {
		
		return size == 0;
		
	}
	
	//*************************************************
	
	
	public void makeEmpty() {
		
		int l = table.length;
		table = new HashNode[l];
		size = 0;
		
	}
	
	//*************************************************
	
	
	public int getSize() {
		
		return size;
		
	}
	
	//*************************************************
	
	
	public void insert(int val)
	{
		
		size++;
		int pos = myhash(val);
		HashNode nptr = new HashNode(val);
		if(table[pos] == null)
			
		{
			
			table[pos]=nptr;
			
		}
		
		else 
			
		{
			nptr.next = table[pos];
			table[pos] = nptr;
		}
	}
	
	
	//***************************************************
	
	
	public void remove(int val)
	{
		int pos = myhash(val);
		HashNode start = table[pos];
		HashNode end = start;
		if(start.data == val) 
		{
			size--;
			table[pos] = start.next;
			return;
		}
		
		while(end.next != null && end.next.data != val)
		{
			end = end.next;
			if(end.next == null) 
			{
				System.out.println("Element not found ");
				return;
			}
			size--;
			
			if(end.next.next == null) 
			{
				end.next = null;
				return;
			}
			
			end.next = end.next.next;
			table[pos] = start;
			
		}
	}
	
	
	//********************************************************
		
		
	
	private int myhash(Integer x)
	{
		int hashval = x.hashCode();
		hashval = hashval % table.length;
		
		if(hashval < 0) 
			hashval = hashval + table.length;
			return hashval;
			
		}
	
	//*******************************************************
	
		
		private static int nextPrime(int n) 
		{
			if(n % 2 == 0) 
				n++;
				for( ; ! isPrime(n) ; n = n+2) ;
					
					
				return n;
			
		}
		
		//****************************************************

		private static boolean isPrime(int n) 
		{
			int n1;
			if(n<0) 
			{
				System.out.println("please enter positive number: ");
				 n1 = Utility.getInt();
				 return CheckPrime.isPrime(n1);
			}
			
			if(n<=1) 
			{
				return false;
			}else 
			{
				for(int i = 2 ; i < Math.sqrt(n) ; i++) 
				{
					if(n%i==0) 
					{
						return false;
					}
				}
			}
			return true;
		}
		
		//*******************************************************
		
		
		public void printHashTable()
		{
			System.out.println();
			for(int i = 0 ; i < table.length ; i++) 
			{
				System.out.println("Slot "+i+" : ");
				HashNode start = table[i];
				while(start != null) 
				{
					System.out.println(start.data+" ");
				}
				System.out.println();
			}
		}

	
}

