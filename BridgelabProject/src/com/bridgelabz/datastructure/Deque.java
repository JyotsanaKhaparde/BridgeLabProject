package com.bridgelabz.datastructure;

public class Deque <E> {
    public Deque<E> next;
    public Deque<E> prev;
    public E data;
    public Deque()
    {
        this.next=null;
        this.prev=null;
    }
    public Deque(E element)
    {
        this.data=element;
        this.next=null;
        this.prev=null;
    }
}