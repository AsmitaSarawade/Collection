package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class Remove_duplicates {

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
		System.out.println("Before removing duplicates from ArrayList a is:"+a);
		HashSet hs=new HashSet(a);
		System.out.println("After removing duplicates from ArrayList a is:"+hs);
	}

}
