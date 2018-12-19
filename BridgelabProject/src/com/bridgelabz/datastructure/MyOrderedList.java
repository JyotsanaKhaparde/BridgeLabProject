package com.bridgelabz.datastructure;
import java.util.*;

public class MyOrderedList<T>{
	private NodeOrderedList<T> lastNode;
    private  NodeOrderedList<T> first;
    NodeOrderedList<T> pre = null;
    private int count = 0; 
    T count1;
    NodeOrderedList<T> head;
    NodeOrderedList<T> traverse;
    NodeOrderedList<T> temp;
    NodeOrderedList<T> temp1;
    
    //**************************************************** 

    public MyOrderedList(){
        this.lastNode = null;
        this.count = 0;
    }
    
    //*****************************************************

  
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    //****************************************************
    
 //Insert element at the end
    
    public void add(T data) {
    	NodeOrderedList<T> next = head;
		NodeOrderedList<T> node = new NodeOrderedList<T>( data);
    	node.data = data;
    	node.next  =null;
    	if(head == null) {
    		head = node;
    		count++;
    	}else {
    		NodeOrderedList<T> n = head;
    		while(n.next != null) {
    			n = n.next;
    			count++;
    		}
    		n.next = node; //Refer next node.
    	}
    }
   
  /*  public void add(int data){
   
		NodeOrderedList node = new NodeOrderedList( data);

        if (head == null) {
            head = node;
        	count++;
        }

        else {
            traverse = head;
            if (head.data > node.data){
                head = node;
                node.next = traverse;
                }

            if (head.data < node.data){
                temp = head;
                while (traverse.next != null){
                    if( traverse.data < node.data) {
                        temp = traverse;
                    traverse = traverse.next;
                    }

               if (traverse.data < node.data) 
                    temp = traverse;
               
               
                    temp1 = temp.next;
                    temp.next = node;
                    node.next = temp1;
               
            }
            }
        }
    }*/
    
 //*******************************************************
    
    //show element 
    
    public void show() {
    	NodeOrderedList<T> node = head;
    	while(node.next != null) {
    		System.out.println(node.data);
    		node = node.next; //shift the next node
    	}
    	System.out.println(node.data);
    }
    
    //*******************************************************
    
    public int size() {
    	return count;
    	/*int count1=0;
    	NodeOrderedList  t =head;
    	while(t.next != null) {
    		count1++;
    	}
    	t = t.next;
        return count1;*/

    }
    
    //********************************************************

    //add element at the start
    
    public void insertAtStart(T data) {
    	NodeOrderedList<T> next = head;

    	NodeOrderedList<T> node = new NodeOrderedList<T>(data,next);
    	node.data = data;
    	node.next  =null;  
    	node.next = head;
    	head = node;
    	count++;
    }
    
    //***************************************************************
    
 //insert at any location
    
    public void insertAt(int index , T data) {
    	NodeOrderedList<T> next = head;

    	NodeOrderedList<T>  node = new NodeOrderedList<T>(data,index);
    	node.data = data;
    	node.next = null;
    	NodeOrderedList<T> travel = head;
    	
    	if(index == 0) {
    		insertAtStart(data);
    		count++;
    	}else {
    	for(int i = 0 ; i < index-1 ; i++) {
    		travel = travel.next;
    	}
    	node.next = travel.next;
    	travel.next = node;
    	count++;
    	}
    }
    
    
    //**********************************************************
    
    //delete element of any location
    
  
    public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
			count--;
		}
		else
		{
			NodeOrderedList<T> n = head;
			NodeOrderedList<T> n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			count--;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
}
    
    //*********************************************************
    
    
    //Remove and return the last item in the list
    
   public T pop() {
    	NodeOrderedList<T> travel = head;
    	NodeOrderedList<T> t1 ;
    	while(travel.next != null)
    		{
    		t1 = travel.next;
    		if(t1.next == null)
    		{
    			travel.next = null;
    			count--;
    			//System.out.println("t1 = "+t1.data);
    			return  t1.data;
    		}
    		travel = travel.next;
    		}
		return null;
            } 
    
    //**********************************************************
    
    //search for the item in the list.
    
   
    public boolean search(T data)
    {
		NodeOrderedList<T> temp=head;
        for(int i=0; i<size(); i++)
        {
//System.out.println("data is:  "+temp.data);
            if(temp.data.equals(data))
            {
                return true;
            }
            else 
            {
                temp = temp.next;
                if( temp.data != data) {
                	return false;
                }else {
                	return true;
                }
            }
        }
        return true;
        
     }
    
 //*****************************************************************
    
  /*  public int index(int data) {
    	NodeOrderedList temp = head;
    	for(int i = 0 ; i < size() ; i++) {
    		if(temp.data == data) {
    			return i ;
    		}else {
        		temp = temp.next;

    		}
    	}
		return 1;
    	
    }*/
    
    public int index(T data) {
    	NodeOrderedList<T> temp = head;
    	for(int i = 0 ; i < size() ; i++) {
    		if(temp.data.equals(data)) {
    			return i ;
    		}
    		temp = temp.next;
    	}
		return -1;
    	
    }
    
 //*******************************************************
    
    
   public T pop(int index)
    {
        if(index==0)
        {
        	head = head.next;
           // T firstData=head.data;
            count--;
            //return firstData;
        }else {
        	NodeOrderedList<T> temp=head;
        for(int i=0; i<index-1; i++)
        {
            temp=temp.next;
        }
        T dataOfIndex=temp.next.data;
        temp.next=temp.next.next;
        count--;
        return dataOfIndex;

        }
		return count1;
    }
    
    //*************************************************************
    
    public Object[] toArray() {
        Object[] result = new Object[size()];
        int i = 0;
        for (NodeOrderedList<T> x = head; x != null; x = x.next)
            result[i++] = x.data;
        return result;
    }
    
    //***************************************************************
    
    
    /* function to insert a new_node in a list. */
    public void sortedInsert(NodeOrderedList<T> new_node) 
	{ 
		NodeOrderedList<T> current; 

	
		/* Special case for head node */
		if (head == null || head.data.toString().compareTo(new_node.data.toString())>=0 ) 
		{ 
			new_node.next = head; 
			head = new_node; 
			//changes
			//count++;
		} 
		else { 

			/* Locate the node before point of insertion. */
			current = head; 

			while (current.next != null && 
				current.next.data.toString().compareTo(new_node.data.toString())<0) 
				current = current.next; 
			//changes
				//count++;

			new_node.next = current.next; 
			current.next = new_node; 
		} 
} 

				/*Utility functions*/

	public NodeOrderedList<T> newNode(T data) 
	{ 
		NodeOrderedList<T> x = new NodeOrderedList<T>(data); 
		//changes
		//x.data = data;
		count++;
		return x; 
	} 

	/* Function to print linked list */
	public void printList() 
	{ 
		
		NodeOrderedList<T> temp = head; 
		while (temp != null) 
		{ 
			System.out.print(" "+temp.data); 
			temp = temp.next; 
		} 
	} 

    
}
