package code;

public class demoPerfect {
	//write a program to find a number is perfect or not?
	public static void main(String[] args) {
	
		int num=6;
		test(num);
	}
	public static void test(int num) {
		
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("It is perfect number");
		}
		else 
		{
			System.out.println("It is not perfect number");
		}
	}

}
