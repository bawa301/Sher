package code;

public class demoPattern5 {
//	Print----------
//	*****
//	  ***
//	    *

	public static void main(String[] args) {
		int n=3;
		int space=0;
		int star=5;
		for(int i=0;i<n;i++) {
			
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space=space+2;
		}
	}

}
