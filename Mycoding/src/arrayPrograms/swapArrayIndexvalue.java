package arrayPrograms;
import java.util.Scanner;

public class swapArrayIndexvalue {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a1[]= {11,12,13,14,15,16,17,18,19,20};
		System.out.println("before values are:-");
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println("Type 2 index values from 0 to "+(a1.length-1));
		int index1=s.nextInt();
		int index2=s.nextInt();
		a1[index1]=a1[index1]+a1[index2];
		a1[index2]=a1[index1]-a1[index2];
		a1[index1]=a1[index1]-a1[index2];
		
		System.out.println(a1[index1]);
		System.out.println(a1[index2]);
		
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
	}

}
