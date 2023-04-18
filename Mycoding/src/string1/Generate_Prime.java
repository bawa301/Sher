package string1;

public class Generate_Prime {
	public static void main(String[] args) {
		int prime=0;
		int a=11;
		int []a1=new int[10];
		for(int i=0;i<a1.length;i++) {
			prime=testA(a);
			if (prime==0) {
				a++;
			   testA(a);
			}
			else {
			   a1[i]=prime;
			   a++;
			}
		}
		testB(a1);
	}
	public static int testA(int a) {
		int n=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				n++;
			}
		}
		if(n==0) {
			return a;
		}
		else {
			return 0;
		}
	}
	public static void testB(int [] a1) {
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	}

}
