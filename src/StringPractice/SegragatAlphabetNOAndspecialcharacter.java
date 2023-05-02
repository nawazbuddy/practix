package StringPractice;

import java.util.Scanner;

public class SegragatAlphabetNOAndspecialcharacter {

	public static void main(String[] args) {
		for(;;) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		
	       char[] c = s.toCharArray();
	       String alpha="";
		 String num=" ";
		 String spc=" ";
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='a'&& c[i]<='z')
			{
				
				alpha=alpha+c[i];
			}
			else if(c[i]>='0'&& c[i]<='9')
			{
				num=num+c[i];
			}
			else {
				spc=spc+c[i];
			}

		}
		System.out.println(alpha+num+spc);
		
		
		}
	}

}
