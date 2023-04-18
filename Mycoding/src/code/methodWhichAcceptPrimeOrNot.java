package code;

public class methodWhichAcceptPrimeOrNot {
//design a method which accept a number and check weather it is prime or not?	
	public static int testA(int num) {
		
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num=19;
		int count=testA(num);
		if(count==0) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not prime number");
		}
	}

}
