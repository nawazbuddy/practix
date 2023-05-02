package practice;

import java.util.LinkedHashSet;

import Map.Linkedhashmap;

public class CountHowManyDuplicate {

	public static void main(String[] args) {

		int [] a= {2,3,2,1,0,3,5,5};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer inte : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(inte==a[i]) {
					count++;
				}
		
			}
			if(count>1) {
				System.out.println(inte+" is repeating "+count);
			}
			
		}
		

	}

}
