package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_method {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(45);
		a.add(58);
		a.add(98);
		a.add(100);
		a.add(2);
		a.add(85);
		a.add(2, 20);
		a.set(4, 101);
		a.add(4, 102);
		a.add(856);
		a.add(982);
		a.add(0);
		a.add(25);
		System.out.println("Max number from arraylist is :"+Collections.max(a));
		System.out.println("Min number from arraylist is :"+Collections.min(a));
		System.out.println("The Given arraylist : " + a);
		//Suffel the arraylist
		Collections.shuffle(a);
		System.out.println("After suffling the elements from the arraylist is:"+a);
		Collections.sort(a);
		System.out.println("After sorting the elements from the arraylist is:"+a);
		Collections.reverse(a);
		System.out.println("After reversing the elements from the arraylist is:"+a);
		
		

	}

}
