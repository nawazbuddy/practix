package StringSentence;

import java.util.LinkedHashSet;

public class CountSentence {

	public static void main(String[] args) {
     String s = "Welcome to to bengalaru bengalaru";
     
            String[] re= s.split(" ");
           LinkedHashSet<String> set = new LinkedHashSet<String>();
            for (int i = 0; i < re.length; i++) {
				set.add(re[i]);
				
			}
         for (String st : set) {
			
		   
     int count=0;
            for (int i = 0; i < re.length; i++) {
				if(st.equals(re[i])) {
					count++;
					
				}
			}
            System.out.println(st+" count  "+count);
         }
        
	}

}
