package LinkedList;

import java.util.LinkedList;

public class Remove_both_ends {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Asmita");
		  l.add(65);
		  l.add(45.3f);
		  l.add('A');
		  l.add("hi");
		  l.add(36);
		  l.add('A');
		  l.add("Asmita");
		  l.add(36);
		  l.add('A');
		  l.add("Asmita");
		  l.addFirst(0);
		  l.addLast(10);
		  System.out.println("Before removing first and last object of linklist "+l);
		  l.removeFirst();
		  l.removeLast();
		
		  System.out.println("After removing first and last object of linklist "+l);
		  System.out.println("Before removing first and last occurence of A "+l );
		  l.removeFirstOccurrence('A');
		  l.removeLastOccurrence('A');
		  System.out.println("After removing first and last occurence of A "+l );
	}

}
