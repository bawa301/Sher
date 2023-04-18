package code;

public class palindrome {
	public static void main(String[] args) {
//Write a program to check wheather a number is palindrome or not?
		
		int num=12321;
		int copynum=num;
		int reverse=0;
		int ld;
		while(num>0) {
			ld=num%10;
			reverse=(reverse*10)+ld;
			num=num/10;
		}
		if(reverse==copynum) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}
