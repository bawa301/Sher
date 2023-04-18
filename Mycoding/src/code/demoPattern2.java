package code;

public class demoPattern2 {
/*
	1
	1*2
	1*2*3
	1*2*3*4
	1*2*3*4*5
*/
  public static void main(String[] args) {
	int n=5;
	int a=1;
	for(int i=0;i<n;i++) {
		a=1;
		for(int j=0;j<(i*2)+1;j++) {
			if(j%2==1) {
				System.out.print("*");
			}
			else{
				System.out.print(a); 
				a++;
			}
		}
		System.out.println();
	}
}
}
