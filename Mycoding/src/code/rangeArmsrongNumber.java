package code;

class rangeArmsrongNumber
{
//write a program to print armstrong number in the ranges?	
	public static void main(String[] args) 
	{
		int num=100;
		int num1=371;
		findRange(num,num1);
	}
	
	public static void findRange(int a,int b) {
		for(int i=a;i<=b;i++) { 
			find(i);
		}
	}
	
	public static void find(int num) {
		int temp=num;
		int sum=0;
		int ld;
		int count=countDigit(num);
		while(num>0) {
			ld=num%10;
			sum=sum+sumFactorial(ld,count);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is armstrong number");
		}
	}
	
	public static int sumFactorial(int ld,int count) {
		int f=1;
		for(int i=1;i<=count;i++) {
			f=f*ld;
		}
		return f;
	}
	
	public static int countDigit(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
}

