package practice;

public class Addtiontwoarray {

	public static void main(String[] args) {
	int[] a={4,2,3,1};
	int[] b={6,4,1,7,3,8};
//o/p        6,6,4,8,3
	int[] c=new int[b.length];//create new array
	int m=0;
	for(int i=0;i<b.length;i++)
	{
		
		try {
			c[m]=a[i]+b[i];
			m++;
			System.out.println(c[i]);
		}
		catch(Exception e)
		{
			if (a.length<b.length) {
				System.out.println(b[i]);
			}
			else {
				System.out.println(a[i]);
			}
		}
		
		
	}
	
	
	
	
	}

}
