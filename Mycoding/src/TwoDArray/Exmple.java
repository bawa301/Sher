package TwoDArray;

import java.util.Scanner;

public class Exmple {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows");
		int row=s.nextInt();
		System.out.println("Enter columns");
		int col=s.nextInt();
		
		int[][]a=new int[row][col];
		System.out.println("Enter of elements of matrix");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter row "+i +" column " +j+ " value");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Elements of matrix are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
