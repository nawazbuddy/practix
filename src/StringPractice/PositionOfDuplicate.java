package StringPractice;

import java.util.LinkedHashSet;

public class PositionOfDuplicate {

	public static void main(String[] args) {
		String s = "TestYantra";
		String l = s.toLowerCase();
	char[] chh = l.toCharArray();
		  LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<chh.length;i++)
		{
		
		set.add(chh[i]);
         }
		
		for (Character unq : set) {
			for (int i = 0; i < chh.length; i++) {
			if(unq==chh[i])	{
				System.out.println(unq+" unique the position "+(i+1));
			break;
			}
			}
		}	

	}

}
