package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Collections_methodon_linkedlist {

	public static void main(String[] args) {
		LinkedList <String> col_list = new LinkedList <String> ();
		col_list.add("Blue");
		col_list.add("Black");
		col_list.add("Green");
		col_list.add("Black");
		col_list.add("Pink");
		col_list.add("Black");
		col_list.add("Red");
		col_list.add("orange");
		col_list.add("Black");
		System.out.println("The Given linked list : " + col_list);
		//Suffel the linklist
		Collections.shuffle(col_list);
		System.out.println("After suffling the elements from the linkedlist is:"+col_list);
		int frequency=Collections.frequency(col_list, "Black");
	    System.out.println("Frequency of Black is: "+frequency);
		Collections.fill(col_list, null);
		System.out.println("Replacing all the elements from the list with given object'null' "+col_list);
	}

}
