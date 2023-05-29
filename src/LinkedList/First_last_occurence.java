package LinkedList;

import java.util.LinkedList;

public class First_last_occurence {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Asmita");
		  l.add(65);
		  l.add(45.3f);
		  l.add('A');
		  l.add("hi");
		  l.add(36);
		  l.add("Asmita");
		  l.add(36);
		  l.add('A');
		  l.add("Asmita");
		  System.out.println("First object of LinkList is:"+l.getFirst());
		  System.out.println("Last object of LinkList is:"+l.getLast());

	}

}
