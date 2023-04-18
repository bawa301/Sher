package code;

public class demoPattern6 {
//	print-------
//	  *
//	 ***
//	*****

	public static void main(String[] args) {
		int n=3;
		int space=2;
		int star=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
			
		}

	}

}
