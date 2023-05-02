package StringPractice;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class CountofDuplicate {

	public static void main(String[] args) {
		String s = "TestYantra";
		String l = s.toLowerCase();
//	char[] chh = l.toCharArray();
		  LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<l.length();i++)
		{
		
		set.add(l.charAt(i));
         }
		HashMap<Integer,Character> hp= new HashMap<>();
		
		for (Character unq : set) {
			
			int count=0;
			
			for (int i = 0; i < l.length(); i++) {
				
			if(unq==l.charAt(i))	{
				
				count++;

			
			}
	
		}
		System.out.println(unq+" --->"+count);
		

	}


		
	}}
