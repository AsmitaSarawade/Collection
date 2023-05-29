package ArrayList;

import java.util.ArrayList;

public class Converting_arraylistto_array {

	public static void main(String[] args) {
		ArrayList<String> fru_list = new ArrayList<String>();
		fru_list.add("Papaya");
		fru_list.add("Mulberry");
		fru_list.add("Apple");
		fru_list.add("Banana");
		fru_list.add("Cherry");
		fru_list.add("Watermelon"); 
		System.out.println("ArrayList : "+fru_list);
		System.out.println("\nConvert an ArrayList to Array ..");
		Object[] fruit=fru_list.toArray();
		for(Object o:fruit)
		{
			System.out.println(o);
		}

	}

}
