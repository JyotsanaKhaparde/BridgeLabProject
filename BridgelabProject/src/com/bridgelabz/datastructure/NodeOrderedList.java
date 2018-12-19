package com.bridgelabz.datastructure;


public class NodeOrderedList<T> {

		T data; 
		NodeOrderedList<T> next;
		NodeOrderedList<T> head;
		int next1;
		
		NodeOrderedList(T data) 
		{
			this.data = data; 
			next = null;
		} 
		
		NodeOrderedList(T data, NodeOrderedList<T> next)
		{
	    	this.next = next;
	    	this.data = data;
	    }
		
		NodeOrderedList(T data, int next1)
		{
	    	this.next1 = next1;
	    	this.data = data;
	    }
	} 

