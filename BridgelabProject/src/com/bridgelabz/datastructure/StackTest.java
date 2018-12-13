package com.bridgelabz.datastructure;

public class StackTest<T> {
	public static void main(String[] args) {
		//MyStack<Integer> obj = new MyStack<Integer>();
		
		
		//System.out.println("Is it Empty: "+obj.isEmpty());

		IStack<Integer> obj = new StackMethods<>();
		obj.push(10);
		obj.push(20);
		System.out.println("content: "+obj);
		
		obj.push(30);
		System.out.println("Pop top value: "+obj.pop());
		
		System.out.println("new content: "+obj);
		
		IStack<String> obj1 = new StackMethods<>();
		obj1.push("rupali");
		obj1.push("komal");
		System.out.println("content string: "+obj1);
		System.out.println("peek : "+obj.peek());
		
		

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
