package code;

public class assignmentDemo1 {
/*
      2531%100=31
      2531/10=253
      
      253%100=53
      253/10=25
      
      25%100=25
      25/10=2
      
      sum=31+53+25=109
*/
	
	public static void main(String[] args) {
		int num=2531;
		int ld;
		int sum=0;
		
		while(num>9) {
			ld=num%100;
			sum=sum+ld;
			num=num/10;
		}
		
		System.out.println(sum);
	}

}
