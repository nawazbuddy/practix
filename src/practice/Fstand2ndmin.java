package practice;

public class Fstand2ndmin {

	public static void main(String[] args) {
		
		int[] a= {7,2,9,1};
		int fmin=a[0];
		int smin=a[0];
		for(int i=1;i<a.length;i++) {
			if(fmin<a[i])
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(smin<a[i])
			{
				smin=a[i];
			}
			
			
		}
		
		
		System.out.println(fmin+" "+smin);
		
		
		
		
		
		
		
		
		
		
		
	}

}
