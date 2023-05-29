package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Vector1 {

	public static void main(String[] args) {
		Vector a=new Vector();
		a.add(45);
		a.add('a');
		a.add("Asmita");
		a.add(45.3f);
		a.add(null);
		Vector v=new Vector();
		v.addAll(a);
		System.out.println(v);
		// addelement method adds the element at the end of vector.
		v.addElement("good");
		v.add("night");
		v.add("sweet");
		v.add("Dreams");
		v.add(28);
		v.add(04);
		v.add(23);
		System.out.println(v.size());
		//shows the capacity of the vector, how many elements it can store.
		System.out.println(v.capacity());
		//creates the copy of given vector.
		System.out.println(v);
		Object v1=v.clone();
		System.out.println("Clone vector "+v1);
		System.out.println("Printing vector with enumaration");
	    Enumeration e=v.elements() ;
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    	
	    }
	    System.out.println("Printing vector with foeeach loop");
	    for(Object s1:v)
	    {
	    	System.out.println(s1);
	    }
	    System.out.println("printing vector with for loop");
		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Printing vector with Iterator");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		System.out.println("Printing vector with ListIterator");
		ListIterator i1=v.listIterator(6);
		while(i1.hasNext())
		{
		System.out.println(i1.next());
		}
	}

}
