package LinkedList;

import java.util.*;
import java.util.LinkedList;

public class Swap_elements_collection {

	public static void main(String[] args) {
		LinkedList <String> col_list = new LinkedList <String> ();
		col_list.add("Blue");
		col_list.add("Green");
		col_list.add("Pink");
		col_list.add("Black");
		col_list.add("Red");
		col_list.add("orange");
		System.out.println("The Given linked list : " + col_list);
		Collections.swap(col_list, 0, 5);
		
	}

}
