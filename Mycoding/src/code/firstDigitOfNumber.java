package code;

public class firstDigitOfNumber {
	//WAP to print 1st digit of a number?
	public static void main(String[] args) {
		int num=2345;
		while(num>9) {
			num=num/10;
		}
		System.out.println("First digit is "+num);
	}

}
