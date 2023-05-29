package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ALmethods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(45);
		a.add('a');
		a.add("Asmita");
		a.add(45.3f);
		a.add(null);
		a.add('a');
		System.out.println(a);
		a.add(4,4536.3);
		if(a.contains("Asmita"))
			{
			System.out.println("Element is present at the index :"+a.indexOf("Asmita"));
			}
		ArrayList a1=new ArrayList();
		a1.add(45);
		a1.add('a');
		a1.add("Asmita");
		a1.add(45.3f);
		a1.add(null);
		a.remove(0);
		a.add(45);
		//To check two array have same data or not
		System.out.println(a);
		System.out.println(a1);
		System.out.println("Chek if arraylist a and al have same data "+a.containsAll(a1));
		//Return true if array is empty
		System.out.println("Checks array is empty  "+a.isEmpty());
		//Shows the size of array
		System.out.println("Size of array is "+a.size());
		//Shows the last index of element 
		// If there is a (any duplicate or not) element in the array so lastindexof method show index of the element last time occurred in the array 
		System.out.println("The last index of a is  "+a.lastIndexOf('a'));
		System.out.println("The last index of 45.3f is   "+a.lastIndexOf(45.3F));
		System.out.println("ArrayList before removing the element");
		System.out.println(a);
		a.remove(6);
		System.out.println("ArrayList after removing the element'");
		System.out.println(a);
		a.add("hi");
		// removes element using element.
		System.out.println("ArrayList before removing the element");
		System.out.println(a);
		a.remove("hi");
		System.out.println("ArrayList after removing the element'");
		System.out.println(a);
		//Get(index) is use to returns the element at the index.
		System.out.println("Element at the index 2 is: "+a.get(2));
		//removeall  compares tow array and remove matching elements.
		a.removeAll(a1);
		System.out.println(a);
		System.out.println("Size of array a is "+a.size()+" After remove all ");
		a1.clear();
		System.out.println(a1);
		System.out.println("Size of array  a1 is "+a1.size()+" After clear method");
	}

}
