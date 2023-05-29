package LinkedList;

import java.util.LinkedList;

public class find_element_print_index {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple"); 
		list.add("Mango");     
		list.add("Pineapple");  
		list.add("Cherry");    
		list.add("Guava");
		list.add("Banana");
		list.add("Watermelon"); 
		if(list.contains("Cherry"))
				{
					System.out.println("Index of cherry is: "+list.indexOf("Cherry"));
				}
	}
}
