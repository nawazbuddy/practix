package linkedarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static <E> void main(String[] args) {
		 LinkedList list = new LinkedList();

		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(40);
		list.add(58);
		System.out.print(list);
		System.out.println();
		
	   LinkedList olis = new	LinkedList();
		olis.add(12);
		olis.add("hey");
		olis.add("hey");
		olis.add(null);//multi null is store
		olis.add(null);
		olis.add(50);
		olis.add(28);
		olis.add(38);
		System.out.print(olis);
		
		list.addAll(olis);// add olis in list
          System.out.println(list+"   checked all element present ");
          System.out.println();
          System.out.println("----- checking element is present-----");
          if(list.contains("hi"))
          {
        	  System.out.println(" hi element is found in list");
          }
          else {
        	  System.out.println(" hi element is not found");
        	  
          }
          for(Object obj : list) {
        	  System.out.println(obj);
        	  
          }
          
          
          list.remove("hi");
          System.out.println(list);
          System.out.println(list.indexOf(40));
          System.out.println(list.getFirst()+"  get first from the collection---->"+list);
          System.out.println();
           System.out.println(list.getLast()+"  get last element from collection--->"+list);
           System.out.println(list.size()+"  size of the collection");
           
           
           Iterator it = list.iterator();
           while(it.hasNext())
           {
        	   System.out.println(it.next());
           }
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
	}

}
