package code;

public class secondDigitOfNumber {
	//WAP to print 2nd digit of a number?
	public static void main(String[] args) {
		int num1=2345;
		int num=num1;
		while(num>99) {
			
			num=num/10;
		}
		num=num%10;
		System.out.println("second Digit of "+num1+" is "+num);
	}

}
