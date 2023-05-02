package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet set = new HashSet<>();
		
        set.add(40);
		set.add("hi");
		set.add("hello");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
				System.out.println(set.contains("hello"));
				System.out.println(set.isEmpty());
				System.out.println();
			ArrayList<Object> list = new ArrayList<Object>(set);
				list.add(7);
				list.add("bye");
				list.add(7);
				list.add(null);
				System.out.println(list);
				
				
				
				
				
				
				
	}

}
