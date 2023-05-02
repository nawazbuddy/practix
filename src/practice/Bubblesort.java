package practice;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] a= {5,2,1,3};
		
	for(int j=0;j<a.length;j++)//iterative 
		{	
		
		
	for(int i=j+1;i<a.length;i++)	{
		
		if(a[j]>a[i])
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
	
	}	
	for(int k=0;k<a.length;k++){
		System.out.print(a[k]+" ");
	}
		
		

	}

}
