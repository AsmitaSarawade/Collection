package LinkedList;

import java.util.LinkedList;

public class Add_element_At_first_last_position {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		 l.add("Asmita");
		  l.add(65);
		  l.add(45.3f);
		  System.out.println("Before adding first and last elements "+l);
		  l.addFirst("First");
		  l.addLast("Last");
		  System.out.println("After adding first and last elements "+l);
			}

}
