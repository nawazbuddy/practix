package StringPractice;

public class SumofgivenString {

	public static void main(String[] args) {
		
		String s="b1h4ks8jks6g4";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			 
		 if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
			 int c = s.charAt(i);
				sum=sum+c-48;
			}
		}
		System.out.println(sum);

	}

}
