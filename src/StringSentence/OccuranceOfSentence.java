package StringSentence;

import java.util.LinkedHashSet;

public class OccuranceOfSentence {

	public static void main(String[] args) {
		
		String s = "Welcome to to bengalaru bengalaru";
		
	 String[] chh = s.split(" ");
		  LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<chh.length;i++)
		{
		
		set.add(chh[i]);
         }
		
		for (String unq : set) {
			int count=0;
			int fl=0;
			int sl=0;
			for (int i = 0; i < chh.length; i++) {
			if(unq.equals(chh[i]))	{
				
				count++;
			}
			
			
			}
			System.out.println(unq+"  is duplicate count "+count);
			
			
		}	

	}
	

}
