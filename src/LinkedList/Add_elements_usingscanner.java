package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Add_elements_usingscanner {

	public static void main(String[] args) {
		 LinkedList l=new LinkedList();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of elements you want to add in linked list");
		 int no=sc.nextInt();
		 for(int i=0;i<no;i++) {
		  System.out.println("Enter the index of  element");
	      int index=sc.nextInt();
	      System.out.println("Enter the string element");
	      String  o=sc.next();
	      l.add(index, o);
		 }
		 ListIterator li=l.listIterator();
		 while(li.hasNext())
		 {
			 System.out.println(li.next());
		 }
	}

}
