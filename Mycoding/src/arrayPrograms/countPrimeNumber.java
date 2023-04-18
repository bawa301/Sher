package arrayPrograms;

public class countPrimeNumber {
	public static void main(String[] args) {
		int a1[]= {11,12,13,14,15,16,17,19,23};
		int countPrime=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			countPrime=countPrime+countprimeNumber(a);
		}
		System.out.println(countPrime);
	}
	public static int countprimeNumber(int n) {
		int i=2;
		int count=0;
		int c=0;
		while(i<n) {
			if(n%i==0) {
				c++;
				break;
			}
			i++;
		}
		if(c==0) {
			count=1;
		}
		return count;
	}
}

