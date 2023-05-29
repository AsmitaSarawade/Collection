package LinkedList;

import java.util.LinkedList;
import java.util.TreeSet;

public class Retrive_not_remove {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple"); 
		list.add("Mango");     
		list.add("Pineapple");  
		list.add("Cherry");    
		list.add("Guava");
		list.add("Banana");
		list.add("Watermelon"); 
		System.out.println(list);
 
		//Retrieving the elements from the head 
		System.out.println(list.element()); 
		System.out.println(list.getFirst());
		System.out.println(list.peek()); 
		System.out.println(list.peekFirst()); 
 
		//Retrieving the elements from the tail
		System.out.println(list.peekLast());    
		System.out.println(list.getLast()); 
		System.out.println("Printing data with TreeSet in ascending order");
		TreeSet tr=new TreeSet(list);
		System.out.println(tr);

	}

}
