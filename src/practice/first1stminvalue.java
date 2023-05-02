package practice;

public class first1stminvalue {

	public static void main(String[] args) {
		int[] a= {5,2,1,3};
		

		
		for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j])
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		}
		}
		for(int k=0;k<a.length;k++) {
			for(int j=0;j<a.length;j++) {
			System.out.print(a[0]+" ");
			System.out.println();
		}
			//System.out.println();
		}
		
	}

}
