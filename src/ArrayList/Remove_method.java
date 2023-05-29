package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Remove_method {

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
		a.add(45);
		a.add("Asmita");
		a.add("hi");
		for(int i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}
		System.out.println("After removing element at index 2 arraylist is :");
		a.remove(2);
		ListIterator li=a.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("After removing element Asmita arraylist is :");
		a.remove("Asmita");
		for(Object o:a)
		{
			System.out.println(o);
		}
		System.out.println("After removing all the elements from arraylist,arraylist is:");
		a.removeAll(a);
		System.out.println(a);
	
	}

}
