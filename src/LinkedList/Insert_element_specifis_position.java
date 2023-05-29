package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_element_specifis_position {

	public static void main(String[] args) {
	  LinkedList l=new LinkedList();
	  l.add("Asmita");
	  l.add(65);
	  l.add(45.3f);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the index where you wnat to add the element");
      int index=sc.nextInt();
      System.out.println("Enter the string element");
      String  o=sc.next();
      l.add(index, o);
      for(int i=0;i<=l.size()-1;i++)
      {
    	  System.out.println(l.get(i));
      }
	}

}
