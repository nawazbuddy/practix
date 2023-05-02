package StringSentence;

public class ReverseString {

	public static void main(String[] args) {
		//1 
//		String s = "Welcome to to bengalaru bengalaru";
//		    String re = s.toLowerCase();
//          String[] ra= re.split(" ");
//          for(int i=ra.length-1;i>=0;i--)
//          {
//        	  System.out.println(ra[i]+" ");
//          }
          
      	String s = "Welcome to to bengalaru Bengalaru";
	   // String re = s.toLowerCase();
      String[] ra= s.split(" ");
      String rev="";
    		  for(int i=ra.length-1;i>=0;i--)
   	          {
  	        	  rev=rev+ra[i]+" ";
   	          }		  
      
      System.out.println(rev);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
