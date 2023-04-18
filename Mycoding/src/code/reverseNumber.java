package code;

public class reverseNumber {
	public static void main(String[] args) {
		int num=123;
		int reverse=0;
		int ld;
		while(num>0) {
			ld=num%10;
			reverse=(reverse*10)+ld;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
//Number=2531;p
//reverse=1
//reverse=(1*10)+3= 13
//reverse=(13*10)+5=135
//reverse=(135*10)+2=1352