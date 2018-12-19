package com.bridgelabz.datastructure;

public class StackTest<T> {
	public static void main(String[] args) {
		
		StackMethods<Integer> obj = new StackMethods<Integer>();

		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.push(15);
		//obj.peek();
		//obj.pop();
		System.out.println(obj.getSize());
		//obj.pop();
		System.out.println(obj.isEmpty());

		obj.display();
		//MyStack<Integer> obj = new MyStack<Integer>();
		
		
		//System.out.println("Is it Empty: "+obj.isEmpty());

	/*	Stack<Integer> obj = new StackMethods<>();
		obj.push(10);
		obj.push(20);
		System.out.println("content: "+obj);
		
		obj.push(30);
		System.out.println("Pop top value: "+obj.pop());
		
		System.out.println("new content: "+obj);
		
		Stack<String> obj1 = new StackMethods<>();
		obj1.push("rupali");
		obj1.push("komal");
		System.out.println("content string: "+obj1);
		System.out.println("peek : "+obj.peek());
		*/
		

		//System.out.println(obj.pop());
		//System.out.println(obj.pop());

		//System.out.println(obj.pop());

		//System.out.println(obj.pop());
	//	System.out.println(obj.pop());

		//System.out.println(obj.pop());


		
		//System.out.println("Top item in the stack is: "+obj.peek());
		//System.out.println("size is: "+obj.size());

		//obj.show();

	}
}
