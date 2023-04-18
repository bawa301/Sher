package code;

public class PrimeNumberAddition {
	
	public static void main(String[] args) {
		int n1=2;
		int n2=50;
		int sum=0;
		while(n1<=n2) {
		sum=sum+primeNumber(7);
		n1++;
		}
		System.out.println(sum);
	}
	public static int primeNumber(int n1) {
		int count=0;
		for(int i=2;i<n1;i++) {
			if(n1%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
		return n1;
		}
		else {
			return 0;
		}
	}

}
