package arrayPrograms;

public class sumOfFactorial {
	public static void main(String[] args) {
		int a1 []= {2,3,4,5};
		int sum=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
	        sum=sum+factorial(a);
		}
		System.out.println("sum of factorial of every element is "+sum);
	}
	
	public static int factorial(int n) {
		int i=1;
		int product=1;
		while(i<=n) {
			product=product*i;
			i++;
		}
		return product;
	}

}
