package practice;

public class first1stmaxsummul {

	public static void main(String[] args) {
int a[] = {5,2,1,3};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
				
				
			}
			
			
			
			
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]);
			
		}
		System.out.println();
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
	}


