package StringPractice;

import java.util.LinkedHashSet;

public class NoduplicateVowel {

	public static void main(String[] args) {
		String s="testyantra";//ea 2
//              char[] st = s.toCharArray();
//            int count=0;
//          for(int i=0;i<s.length();i++) {
//		if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u'||
//				st[i]=='A'||st[i]=='E'||st[i]=='I'||st[i]=='O'||st[i]=='U') {
//			
//			count++;
//			
//		}
//	
//		
//		}
//          System.out.println(count);
//         
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		int count =0;
		for (Character c : set) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
					c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				
				count++;
				System.out.println(c);
			}
		}
		System.out.println("The number of vowel in a String are="+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
