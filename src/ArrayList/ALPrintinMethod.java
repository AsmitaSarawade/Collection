package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ALPrintinMethod {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(45);
		a.add('a');
		a.add("Asmita");
		a.add(45.3f);
		a.add(null);
		System.out.println(a);
		a.add(4,4536.3);
		
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

	}

}
