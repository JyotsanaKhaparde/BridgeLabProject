package com.bridgelabz.datastructure;

public class Node<T> {
  /*  public Node<T> nextNode = null;
    public Node<T> previousNode = null;
    public int index;
    public T data;

    public Node(T data){
        this.data = data;
    }*/
	
	
	
	T data;
	//T front;
	Node<T> next;
   // Node<T> pre;
    //super();
  Node(T data){
    	this.data = data;
    }
    Node(T data, Node<T> next){
    	this.next = next;
    	this.data = data;
    }
}
