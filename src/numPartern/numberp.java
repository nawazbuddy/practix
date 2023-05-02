package numPartern;

public class numberp {

	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<n;i++) {
		
		for(int j=i;j<n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=1;j<i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
		for(int k=1;k<=n;k++) {
			for(int m=1;m<k;m++) {
				System.out.print(" ");
		}
			for(int m=k;m<n;m++) {
				System.out.print(m);
			}
			for(int m=k;m<=n;m++) {
				System.out.print(m);
				
			}
		
		
			System.out.println();
			
		}		
			
	

	}

}
