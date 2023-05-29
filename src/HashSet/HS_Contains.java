package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HS_Contains {

	public static void main(String[] args) {
		HashSet<String> HS=new HashSet<String>();
		HS.add("Apple"); 
		HS.add("Mango");     
		HS.add("Pineapple");  
		HS.add("Cherry");    
		HS.add("Guava");
		HS.add("Banana");
		HS.add("Watermelon"); 
		Iterator i=HS.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
		if(HS.contains("Banana"))
		{
			System.out.println("Set Contains Banana");
		}
		if(!HS.contains("Iceapple"))
		{
			System.out.println("Set doesn't contains Iceapple");
		}
		
		
	}

}
