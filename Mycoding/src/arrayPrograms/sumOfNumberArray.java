package arrayPrograms;

public class sumOfNumberArray {

	public static void main(String[] args) {
		int a1[]= {5,10,15,20,10,20,30,40};
		int sum=0;
		for(int i=0;i<a1.length;i++) {
			int a=a1[i];
			sum=sum+a;
		}
		System.out.println("sum of numbers present in array is "+sum);

	}

}
