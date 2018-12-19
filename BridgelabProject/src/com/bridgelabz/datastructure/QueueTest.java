package com.bridgelabz.datastructure;

public class QueueTest {
	public static void main(String[] args) {
		MyQueue<Integer> obj = new MyQueue<>();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.peek();
		System.out.println(obj.size);
		System.out.println(obj.isEmpty());
		//obj.remove();
		obj.display();


	}

}
