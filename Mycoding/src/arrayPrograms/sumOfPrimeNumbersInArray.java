package arrayPrograms;

public class sumOfPrimeNumbersInArray {
	public static void main(String[] args) {
		int [] a1= {11,12,19,8};
		int sumPrime=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			sumPrime=sumPrime+findPrime(a);
		}
		System.out.println("Sum of prime numbers in array is "+sumPrime);
	}
	public static int findPrime(int n) {
		int i=2;
		int count=0;
		int prime=0;
		while(i<n) {
			if(n%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			prime=n;
		}
		return prime;
	}

}
