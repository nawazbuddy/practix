package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeduplicate {
	
	public static void main(String[] args) {
		
		int [] a= {2,3,3,1,0,2,7};

		LinkedHashSet<Integer> set = new  LinkedHashSet<Integer>();		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			//System.out.println(set);
		}
		
		for( Integer inte: set) {
			System.out.print(inte+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
