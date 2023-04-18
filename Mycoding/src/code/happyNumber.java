package code;

public class happyNumber {
//	write a program to check wheather a number is happy number or not?
	public static void main(String[] args) {
		int num=13;
		testA(num);
}
	public static void testA(int num) {
		int ld;
		int sum=0;
		while(num>0) {
			ld=num%10;
			sum=sum+testB(ld);
			num=num/10;
		}
	    if(sum==1) {
	    	System.out.println("It is happy Number");
	    }
	    else if(sum==4) {
	    	System.out.println("It is unhappy number");
	    }
	    else {
	    	testA(sum);
	    }
}

	public static int testB(int ld) {
		int n=0;
		while(ld>0) {
			n=ld*ld;
			ld=ld/10;
        }
		return n;
}

}
