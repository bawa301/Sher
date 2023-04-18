package Sweetie;

public class betu {

	int a=10; //Global variable //intialization
	int b; //global variable //declarartion
	
	public static void main(String[] args) {
		int a=10; //local variable
		int b=20; //local variable //declaration+initailization
		int sum=a+b;
		System.out.println(sum);
		betu.bittu();
	}
	
	public static void bittu() {
		int a=30; //local variable
		int b=50; //local variable
		
		System.out.println("Sum of 2 numbers "+(a+b));
		
	}
	
	

}
