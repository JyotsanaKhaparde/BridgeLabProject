package com.bridgelabz.datastructure;


public class MyLinkedListTest {
	public static void main(String[] args) {
    	MyOrderedList obj = new MyOrderedList();
 

    	//obj.add(18);
    	//obj.add(45);
    	//obj.add(12);
    	//obj.add(37);
    	//obj.add(15);
    	//obj.show();
    	NodeOrderedList new_node1; 
		new_node1 = obj.newNode(8); 
		obj.sortedInsert(new_node1); 
		
		new_node1 = obj.newNode(5); 
		obj.sortedInsert(new_node1); 
		
		new_node1 = obj.newNode(1); 
		obj.sortedInsert(new_node1); 
		
		new_node1 = obj.newNode(2); 
		obj.sortedInsert(new_node1); 

		obj.printList();
		//System.out.println("size is: "+obj.size());
		//obj.insertAtStart(50);
		//obj.add(100);
		//obj.pop();
		//obj.pop(2);
		if(obj.search(12)) {
			System.out.println("p");
		}else {
			System.out.println("not");
		}
		System.out.println("size is : "+obj.size());
		
		
		System.out.println("index: "+obj.index(8));
		obj.show();
    	
    	

	
	}

}
