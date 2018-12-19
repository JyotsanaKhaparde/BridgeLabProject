package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

public class StackMethods<T> extends Stack<T> {
	private int size = 0;
	protected Stack<T> top ;
	Stack<T> n;

 

    /*  Constructor  */

    public StackMethods()

    {

        top = null;

        size = 0;

    }    

    /*  Function to check if stack is empty */

    public boolean isEmpty()

    {

    	if(top==null)
            return true;
        else
            return false;
    }    


    

    /*  Function to get the size of the stack */

    public int getSize()

    {

        return size;

    }    

    /*  Function to push an element to the stack */

    public void push(T data)

    {

        Stack<T> nptr = new Stack<T> (data, null);

        if (top == null)

            top = nptr;

        else

        {

            nptr.setLink(top);

            top = nptr;

        }

        size++ ;

    }    

    /*  Function to pop an element from the stack */

    public T pop()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        Stack<T> ptr = top;

        top = ptr.getLink();//get link to next node

        size-- ;

        return ptr.getData();

    }    

    /*  Function to check the top element of the stack */

    public T peek()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        return top.getData();

    }    

    /*  Function to display the status of the stack */

    public void display()

    {

        System.out.print("\nStack = ");

        if (size == 0) 

        {

            System.out.print("Empty\n");

            return ;

        }

        Stack<T> ptr = top;

        while (ptr != null)

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getLink();

        }

        System.out.println();        

    }

}

	

	


