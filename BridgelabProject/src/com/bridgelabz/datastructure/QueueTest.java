package com.bridgelabz.datastructure;

public class QueueTest {
	public static void main(String[] args) {
		IQueue<Integer> obj = new MyQueue<>();
		//obj.enQueue(10);
		//obj.enQueue(20);
		obj.deQueue();
		System.out.println(obj.isEmpty());
		System.out.println("size is : "+obj.size());
		obj.show();

	}

}
