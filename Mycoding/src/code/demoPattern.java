package code;

public class demoPattern {
/* print like this
   0    *                i*2+1
   1    ***     
   2    ***** 
   3    ******* 
*/
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<(i*2)+1;j++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
