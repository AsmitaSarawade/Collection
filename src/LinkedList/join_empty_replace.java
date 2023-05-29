package LinkedList;

import java.util.LinkedList;

public class join_empty_replace {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		  l1.add("Asmita");
		  l1.add(65);
		  l1.add(45.3f);
		  
		  LinkedList l=new LinkedList();
			l.add("Asmita");
			  l.add(65);
			  l.add(45.3f);
			  l.add('A');
			  l.add("hi");
			  l.add(36);
			  l.add('A');
			  l.add("Asmita");
			  System.out.println("Elements from l is: "+l);
			  l.set(7, "hello");
			  System.out.println("After  repacing element in l, l is : "+l);
			  System.out.println("Elements in l is: "+l);
			  System.out.println("Elements on l1 is: "+l1);
			  l.addAll(l1);
			  System.out.println("After joining l and l1,l1 is : "+l);
			  l.removeAll(l1);
			  System.out.println("After removing l1 from l,l is : "+l);
			  System.out.println(l1.isEmpty());
			  
			
		
	}
	

}
