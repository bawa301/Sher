package code;

public class armStrongNumber {
//	find a number is armstrong number?
		public static void main(String[] args) 
		{
			int num=371;
			int temp=num;
			int sum=0;
			int count=countD(temp);
			int ld;
			while (temp>0)
			{
				ld=temp%10;
				sum=sum+power(ld,count);
				temp=temp/10;
			}
			if (sum==num)
			{
				System.out.println("it is armstrong number");
			}
			else
			{
				System.out.println("it is not armstrong number");
			}

		}
		public static int power(int a,int b)
		{
			int p=1;
			for (int i=1;b>0;b--)
			{
				p=p*a;
			}
				return p;
		}
		public static int countD(int a)
		{
			int count=0;
			while (a>0)
			{
				a=a/10;
				count++;
			}
			return count;
		}
	}
