package code;

public class rangeAcceptsPrimeNumber {
//design a method which accept the range and prints all the prime numbers
//in the range?
	public static void testA(int a,int b) 
	{
		int count=0;
		
		for(int i=a;i<=b;i++) 
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i+" is prime number");
			}
			else {
				count=0;
			}
			
	    }
	}
	public static void main(String[] args) 
	{
		int num1=2;
		int num2=150;
		testA(num1,num2);
		
		
	}

}
