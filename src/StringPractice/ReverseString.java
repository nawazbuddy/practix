package StringPractice;

public class ReverseString {

	public static void main(String[] args) {

		String s = "TestYantra";

		//1
//		for (int i = s.length()-1; i >=0; i--) {
//			
//			System.out.print(s.charAt(i)+" ");
//			
//		}
	//2	
//	String rev="";
//	for (int i = s.length()-1; i >=0 ; i--) {
//		rev=rev+s.charAt(i)+" ";
//	}
//	System.out.println(rev);
		
	//3	
//		char[] ch = s.toCharArray();
//		for (int i = ch.length-1; i >=0 ; i--) {
//		System.out.print(ch[i]+" ");	
//		}
		//4
	 StringBuilder sh = new	StringBuilder(s);
		System.out.println(sh.reverse());
		
	}

}
