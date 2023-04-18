package TwoDArray;

public class RowWiseSum {
	public static void main(String[] args) {
		int [][]a=new int [2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
	
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("Sum of "+i+" row "+sum);
		}
		
	}

}
