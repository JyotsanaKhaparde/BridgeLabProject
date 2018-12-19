package com.bridgelabz.datastructure;

public class DequeueTest {
	public static void main(String[] args) {
		MyDeque<Character> obj = new MyDeque<Character>();
		obj.addToFront('a');
		obj.addToFront('b');

		obj.addToFront('c');
		System.out.println();
		obj.addToRear('a');
		obj.addToRear('b');
		obj.addToRear('c');


		//obj.addToRear("jyotsana");
		//obj.removeFront();
		//obj.removeFront();
		
		obj.show();
		//obj.addFront(10);
		//obj.addFront(20);
	//	obj.addFront(30);
		//obj.addRear(40);
		//obj.show();

	}

}
