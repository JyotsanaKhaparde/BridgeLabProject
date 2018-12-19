package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.Deque;
public class MyDeque<E>{
	 
    Deque<E> front;
    Deque<E> rear;
    int counter=0;
    
    //*******************************************************************
    
    
    public MyDeque(){    
    }
    
    //******************************************************************
    @SuppressWarnings("null")
    //add front
    public void addToFront(E data)
    {
        //if no element in list
        if(front==null) 
        {
        	 Deque<E>tNode=new Deque<E>(data);
             front=tNode;
             rear=front;
        }
        else  //if element in list
        {
           // Deque<E>tNode=null;
       	 Deque<E>tNode=new Deque<E>(data);

            tNode.data=data;
            tNode.next=front;
            front.prev=tNode;
            front=tNode;
        }
        counter++;
		//return data;
    }
    
    //*********************************************************************
    
    //add the element in the rear 
    public void addToRear(E data)
    {
        if(front==null) //if no element in list
        {
            Deque<E>tNode=new Deque<E>(data);
            front=tNode;
            rear=front;
        }
        else  //if element in list
        {
            Deque<E>tNode=new Deque<E>(data);
            rear.next=tNode;
            tNode.prev=rear;
            rear=tNode;
        }
        counter++;
		//return data;
    }
    
    //**********************************************************************
    

    /**
     * Function is used to remove the elements in front of the deque
     * 
     * @return output is the element of front in the deque
     */
    public E removeFront()
    {
        E value=null;
        if(front==null)
        {
            System.out.println("No elements to delete");
        }
        else
        {
            value=front.data;
            front=front.next;
        }
        counter--;
        return value;
    }
    
    //***********************************************************************
    
    /**
     * Function is used to remove the last element in the dqueue
     * 
     * @return the element which are remove in the deqeue
     */
    public E removeRear()
    {
        E value=null;
        if(front==null)
        {
            System.out.println("No element to delete");
        }
        else
        {
            value=rear.data;
            rear=rear.prev;
            //changes
           // rear.next=null;
        }
        counter--;
        return value;
    }
    
    //****************************************************************************
    
    
    /**
     * Function is used to remove the element in the deque
     * @return 
     */
    
    public boolean isEmpty()
    {
        if(front==null)
            return true;
        else
            return false;
    }
    
    //*****************************************************************************
 
    /**
     * @return the size of the element in the deque
     */
    
    public int size()
    {
        return counter;
    }
    
    //******************************************************************************
    
  //show element 
    
    public void show() {
    	Deque<E> node = front;
    	while(node.next != null) {
    		System.out.println(node.data);
    		node = node.next; //shift the next node
    	}
    	System.out.println(node.data);
    }
}