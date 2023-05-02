package practice;

public class sumof1st3min {

	public static void main(String[] args) {
		int a[]= {5,2,1,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		int mul=1;
		int sum=0;
		int count=a.length;
		for(int k=0;k<count;k++) {
			System.out.println(a[k]);
		 sum=sum+a[k];
		 mul=mul*a[k];
		}
		
		System.out.println("sum= "+sum);
		System.out.println("mul= "+mul);
	}

}
