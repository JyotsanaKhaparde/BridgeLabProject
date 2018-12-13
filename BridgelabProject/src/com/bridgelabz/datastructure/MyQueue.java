package com.bridgelabz.datastructure;

import java.time.temporal.IsoFields;

public class MyQueue<T> implements IQueue<T>
{
	private static final int DEFAULT_CAPACITY = 10;
	private T[] queue;
	private int size = 0;
	private int capacity;
	int rear;
	int front;
	
		//****************************************************
	
		public MyQueue() {
			capacity = DEFAULT_CAPACITY;
			queue = (T[]) new Object[DEFAULT_CAPACITY];
		}
		
		//*****************************************************
		
		public MyQueue(int capacity) {
			this.capacity = capacity;
			queue = (T[]) new Object[capacity];

		}
		
		//*****************************************************

		@Override
		public int size() {
			return size;
		}
		
		//*****************************************************

		@Override
		public void enQueue(T data) {
			if(! isFull()) {
			queue[rear] = data;
			rear++;
			size++;
			}else {
				System.out.println("queue is full");
			}
		}
		
		//*****************************************************

		@Override
		public void show() {
			System.out.println("Element: ");
			for(int i = 0 ; i < size ; i++) {
				System.out.println(queue[(front+i)%capacity]+" ");
			}
		}
		
		//****************************************************

		@Override
		public T deQueue() {
			T data =  queue[front];

			if(! isEmpty()) {
			front = (front+1)%capacity;
			size--;
			}
			else 
			{
				System.out.println("queue is empty");
				//return data;
			}
			return data;
		}
		
		//***************************************************

		@Override
		public boolean isEmpty() {
			return size==0;
		}
		
		//***********************************************

		@Override
		public boolean isFull() {
			return size == capacity;
		}

}
