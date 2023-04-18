package code;

public class examplePractise {           
	public static void main(String[] args) {
		int n=121;
		int num=n;
		int r=0;
		int ld;
		while(n>0) {
			ld=n%10;
			r=r*10+ld;
			n=n/10;
		}
		if(r==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
