package com.bridgelabz.datastructure;

public class Queue<T> {
    protected T data;

    protected Queue<T> next;

 

    /*  Constructor  */

    public Queue()

    {

    	next = null;

        data = null;

    }    

    /*  Constructor  */

    public Queue(T d,Queue<T> n)

    {

        data = d;

        next = n;

    }    

    /*  Function to set link to next Node  */

    public void setLink(Queue<T> n)

    {

    	next = n;

    }    

    /*  Function to set data to current Node  */

    public void setData(T d)

    {

        data = d;

    }    

    /*  Function to get link to next node  */

    public Queue<T> getLink()

    {

        return next;

    }    

    /*  Function to get data from current Node  */

    public T getData()

    {

        return data;

    }


}
