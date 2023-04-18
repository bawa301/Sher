package arrayPrograms;

public class strongNumberInArray {
	public static void main(String[] args) {
		int a1[]= {1,4,2,17,145,200};
		int countStrong=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			countStrong=countStrong+countStrongNumber(a);
		}
		System.out.println("Strong numbers present in array is "+countStrong);
	}
	public static int countStrongNumber(int n) {
		int num=n;
		int ld;
		int sum=0;
		int count=0;
		while(num>0) {
			ld=num%10;
			sum=sum+findfactorial(ld);
			num=num/10;
		}
		if(sum==n) {
			count++;
		}
		return count;
	}
	public static int findfactorial(int n) {
		int product=1;
		int i=1;
		while(i<=n) {
			product=product*i;
			i++;
		}
		return product;
	}

}
