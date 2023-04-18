  package code;

public class demoPattern4 {
/* 
 Print-------
                *
              ***
            *****
 */
	public static void main(String[] args) {
		int n=3;     //rows
		int col=5;   //coloumn
		int space=4;
		int star=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space=space-2;
			star=star+2;
		}
				
	}
}
