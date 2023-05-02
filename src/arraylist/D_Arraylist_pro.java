package arraylist;

import java.util.ArrayList;

public class D_Arraylist_pro {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();

		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(null);
		list.add(null);
		list.add(40);
		list.add(58);
		System.out.println(list);
		
		ArrayList olis = new ArrayList<>();

		olis.add(12);
		olis.add("hey");
		olis.add("hey");
		olis.add(null);
		olis.add(null);
		olis.add(28);
		olis.add(38);
		System.out.println(olis);
		
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
          
          
          System.out.println();
          System.out.println(" passing element in particular index");
          
          list.add(3, "ashir");
           
          System.out.println(" ashir is shifted in array list  "+list);
          
          System.out.println(list.remove("10")+ "   remove element hi from list ----> " +list);
          System.out.println();
          
          System.out.println(list.set(6, "30")  +" element is set element in asper index ---> " +list);
          System.out.println();
          System.out.println(list.get(6)+ "   get element  from list 6  " +list);
          
	}

}
