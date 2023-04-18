package pattern;

public class D {
/*Print 7654321
	    654321 
	    54321  
	    4321   
	    321    
	    21     
	    1
*/
	public static void main(String[] args) {
		int n=7;
		int ab=7;
		int a=ab;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=n-1) {
					System.out.print(a);
					a--;
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<n) {
				ab--;
			}
			System.out.println();
			a=ab;
			
		}
	
	}

}
