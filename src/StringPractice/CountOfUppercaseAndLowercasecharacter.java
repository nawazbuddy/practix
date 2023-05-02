package StringPractice;

public class CountOfUppercaseAndLowercasecharacter {

	public static void main(String[] args) {
		
		String s="TesTYaNtRA";
		int uppercase=0;
		int lowercase=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				uppercase++;
				System.out.println(s.charAt(i));
			}
			
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				lowercase++;
			}
			
		}
		System.out.println("uppercase "+uppercase);
		
		System.out.println("lowercase "+lowercase);
		
		
		
		
		
		
		
		

	}

}
