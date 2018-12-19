package com.bridgelabz.datastructure;

public class Stack<T> {
	

	
    protected T data;
    protected Stack<T> next;

 

    /*  Constructor  */

    public Stack()

    {

        next = null;

        data = null;//0

    }    

    /*  Constructor  */

    public Stack(T d,Stack<T> n)

    {

        data = d;

        next = n;

    }    

    /*  Function to set link to next Node  */

    public void setLink(Stack<T> n)

    {

        next = n;

    }    

    /*  Function to set data to current Node  */

   public void setData(T d)

    {

        data = d;

    }    

    /*  Function to get link to next node  */

    public Stack<T> getLink()

    {

        return next;

    }    

    /*  Function to get data from current Node  */

    public T getData()

    {

        return data;

    }
}
