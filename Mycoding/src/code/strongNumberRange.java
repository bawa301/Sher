package code;

public class strongNumberRange {
//WAP to print strong numbers in the given range?
	public static void findRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			find(i);
		}
	}
	
	public static void find(int b) {
		int num=b;
		int result = 0;
		int ld;
		while(b>0) {
			ld=b%10;
			result=result+testB(ld);
			b=b/10;
		}
		if(result==num) {
	    System.out.println(num+" is armstrong number");
		}
	}
	public static int testB(int ld) {
		int n=1;
		for(int i=1;i<=ld;i++) {
			n=n*i;
		}
		return n;
	}
	public static void main(String[] args) {
		
		int a=1;
		int b=145;
		findRange(a,b);
	}

}
