package LinkedList;

import java.util.LinkedList;

public class size_find_indexofspecifoicobject {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple"); 
		list.add("Mango");     
		list.add("Pineapple");  
		list.add("Cherry");    
		list.add("Guava");
		list.add("Banana");
		list.add("Watermelon"); 
		System.out.println("Size of the LinkList is: "+list.size());
		System.out.println("Position of cherry is :"+list.indexOf("Cherry"));
	}

}
