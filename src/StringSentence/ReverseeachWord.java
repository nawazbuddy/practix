package StringSentence;

public class ReverseeachWord {

	public static void main(String[] args) {

		String s = "Welcome to to bengalaru Bengalaru";
		 //  String re = s.toLowerCase();
	      String[] ra= s.split(" ");
	      
		for (int i = ra.length-1; i >=0; i--) {
			System.out.println(ra[i]+" ");
			String rev="";
			
				String m = ra[i];
				for (int j = m.length()-1; j>=0 ; j--) {
				rev=rev+m.charAt(j)+" ";
				}
				
				System.out.print(rev);
			System.out.println();
			
			}
		
		
		
		
		
			
			
			
		}
		
		
	}


