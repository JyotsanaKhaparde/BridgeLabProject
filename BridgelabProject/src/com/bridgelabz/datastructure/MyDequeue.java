package com.bridgelabz.datastructure;

public class MyDequeue<T> implements IDequeue<T>{
	private static final int DEFAULT_CAPACITY = 10;
	private T[] dequeue;
	private int size = 0;
	private int capacity;
	int rear=0;
	int front=0;
	
		//****************************************************
	
		public MyDequeue() {
			capacity = DEFAULT_CAPACITY;
			dequeue = (T[]) new Object[DEFAULT_CAPACITY];
		}
		
		//*****************************************************
		
		public MyDequeue(int capacity) {
			this.capacity = capacity;
			dequeue = (T[]) new Object[capacity];

		}
			
		//***************************************************
	
	
		@Override
		public int size() {
			return size;
		}
		
		//***************************************************

		@Override
		public boolean isEmpty() {
			return size == 0;
		}
		
		//************************************************

		@Override
		public void addFront(T data) {
			if(front == -1 && rear == -1) {
				dequeue[rear++] = data ;
				//rear++;
				size++;
				
			}
			//else{
					//front = rear;
					//front--;

					//dequeue[front] = data;
					//size++;
				//}
			
			
			//dequeue[front--] = data;
			//size++;
		
		}

		
		//**************************************************

		@Override
		public void addRear(T data) {
			if(front == -1 && rear == -1) {

			dequeue[rear] = data;
			rear--;
			size++;
			}
		}
		
		//**************************************************

		@Override
		public T removeFront() {
			T data = dequeue[front];
			dequeue[front--] = data;
			return data;
		}
		
		//***********************************************

		@Override
		public T removeRear() {
			T data = dequeue[rear];
			 dequeue[rear--]=data;
			return data;
		}
		
		//**********************************************
		
		@Override
		public boolean isFull() {
			return size == capacity;
		}
		
		//*****************************************************

		@Override
		public void show() {
				System.out.println("Element: ");
				for(int i = 0 ; i <= size ; i++) {
					System.out.println(dequeue[i]+" ");
				}
			}

	
}
