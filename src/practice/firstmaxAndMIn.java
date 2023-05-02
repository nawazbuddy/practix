package practice;

public class firstmaxAndMIn {

	public static void main(String[] args) {
		
		int[] a= {5,2,1,3};
		
		int fmin=a[0];
		int fmax=a[0];
		for(int i=1;i<a.length;i++) {
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}
		
		
		for(int i=1;i<a.length;i++) {
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		
		System.out.println(fmin+"=minium value");
		System.out.println(fmax+"=maximum value");
		
/*
 * 1=minium value
   5=maximum value
 */
	}

}
