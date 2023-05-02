package practice;

import java.util.LinkedHashSet;

public class findthepostionofeachnuminarray {

	public static void main(String[] args) {
		int[] a= { 2,3,2,1,0,3};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		/*Auswer
		 * [2, 3, 1, 0]
2  is in 1 position
3  is in 2 position
1  is in 4 position
0  is in 5 position
		 */
		
			for (int i = 0; i < a.length; i++) {
				set.add(a[i]);
			}
			System.out.println(set);
		for (Integer inte : set) {
			for (int j = 0; j < a.length; j++) {
				if(inte==a[j]) {
					System.out.println(inte+"  is in "+(j+1)+" position");
					break;
			}
			
			}
			
		}

	}

}
