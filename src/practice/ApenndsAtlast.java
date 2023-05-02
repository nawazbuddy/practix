package practice;

public class ApenndsAtlast {

	public static void main(String[] args) {

		int[] a= { 1,0,0,5,0};//00011
	 int[] c = new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c[m]=a[i];
				m++;//position
			}
			else {
				c[n]=a[i];
				n--;
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(c[k]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
