package code;

public class demoPrime {
	//write a program to check weather a no. is prime or not? (logic in main ())
	public static void main(String[] args) {
		int num=11;
		int count=0;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not prime number");
		}
		
		
	}

}
