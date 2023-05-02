package set;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add(10);
		t.add(320);
		t.add(30);
		t.add(40);
        t.add(100);
        System.out.println(t);
        System.out.println(t.descendingSet());
        System.out.println(t.first());// first ele is prin
        System.out.println(t.last());//last ele prin
        System.out.println(t.higher(40));//before ele print
        System.out.println(t.headSet(40));//before eles print
        System.out.println(t.tailSet(40));//after eles print
        System.out.println(t.subSet(10,100));//b/w ele print
        
	}

}
