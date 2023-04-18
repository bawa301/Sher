package code;

public class demo1 {

	public static void main(String[] args) {
		int num=2531;
		int ld;
		int ld1;
		int sum=0;
		while(num>9) {
			ld=num%10;
			num=num/10;
			ld1=num%10;
			sum=sum+((ld*10)+ld1);
			}
		System.out.println(sum);
		}
	}
