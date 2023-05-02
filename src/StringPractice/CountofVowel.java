package StringPractice;

public class CountofVowel {

	public static void main(String[] args) {
		String s="mysore";
		int count=0;
		
	
		char c = 'a' ;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
				c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			
			count++;
			System.out.println(c+" "+count);
		}
		
		
	}
		System.out.println(count );
}
}
