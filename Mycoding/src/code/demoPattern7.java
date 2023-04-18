package code;

public class demoPattern7 {
	public static void main(String[] args) {
//Print------------
//		*****
//		 ***
//		  *
		int n=3;
		int space=0;
		int star=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}

}
