package com.bridgelabz.datastructure;

public interface IQueue<T> {
// T Queue[];
 int size();
// T front;
// T rear;
 public void enQueue(T data);
 public boolean isFull();
 public void show();
 public T deQueue();
 boolean isEmpty();


}