package StringPractice;

import java.util.LinkedHashSet;

public class PositionOfString {

	public static void main(String[] args) {
		
		String s = "TestYantra";
		char[] a = s.toCharArray();
		  LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		System.out.println(a[i]+" postion of character "+(i+1));
       }
		
		
		
		
		

	}

}
