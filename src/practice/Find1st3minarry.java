package practice;

public class Find1st3minarry {
	public static void main(String[] args) {
		int a[] = {5,2,1,3};
		
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
		int count=a.length-1;
		for(int i=0;i<count;i++) {
		 sum=sum+a[i];
		 mul=mul*a[i];
		}
		
		System.out.println("sum= "+sum);
		System.out.println("mul= "+mul);
	}

}
