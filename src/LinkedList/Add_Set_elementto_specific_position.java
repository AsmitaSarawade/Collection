package LinkedList;

import java.util.LinkedList;

public class Add_Set_elementto_specific_position {

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
		  System.out.println("Before adding element LinkedList is: "+l);
		  l.add(4, "Hello");
		  System.out.println("After adding element LinkedList is: "+l);
		  System.out.println("Before replacing the specific  element  LinkedList is: "+l);
		  l.set(4, "Welcome");
		  System.out.println("After replacing the specific  element  LinkedList is: "+l);
		  l.push(1);
		 		  System.out.println(l);
	}

}
