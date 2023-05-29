package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.HashSet;

public class methods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(45);
		a.add('a');
		a.add("Asmita");
		a.add(45.3f);
		a.add(null);
		a.add('a');
		a.add(2, 20);
		a.set(4, "hi");
	
		
		System.out.println("Printing ArrayList with foreach");
		for(Object o:a)
		{
			System.out.println(o);
		}
		System.out.println("Printing ArrayList with for");
		for(int i=0;i<a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("Printing ArrayList with Iterator");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Printing ArrayList with ListIterator");
		ListIterator li=a.listIterator();
		li.add(0);
	
		while(li.hasNext())
		{
			System.out.println(li.nextIndex());
			System.out.println(li.next());
			
			
		}
		//System.out.println(li.previous());
		//System.out.println(li.previous());
		System.out.println("Printing ArrayList with ListIterator desc");
		while(li.hasPrevious())
		{
			System.out.println(li.previousIndex());
			System.out.println(li.previous());
			
		}
		LinkedHashSet LHS=new LinkedHashSet(a);
		System.out.println(LHS);
		
		HashSet HS=new HashSet(a);
		System.out.println(HS);
	}

}
