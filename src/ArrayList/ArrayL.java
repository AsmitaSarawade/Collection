package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.List;

public class ArrayL {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
		a.add(45);
		a.add('a');
		a.add("Asmita");
		a.add(45.3f);
		a.add(null);
		a.add(4, "Manu");
		System.out.println(a);
		 System.out.println("printing ArrayList with Iterator");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println("Element of array is "+i.next());
		}
		 System.out.println("printing ArrayList with ListIterator");
		ListIterator li=a.listIterator();
		while(li.hasNext())
		{
			System.out.println("Element of array is "+li.next());
		}
		 System.out.println("printing ArrayList with for loop");
		for(int j=0;j<=a.size()-1;j++)
		{
			System.out.println("Element of ArrayList is "+a.get(j));
		}
		 System.out.println("printing ArrayList with for each loop");
		 for(Object o:a)
		 {
			 System.out.println("Element of ArrayList is "+o);
		 }

		
	}

}
