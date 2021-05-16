package p1;
import java.util.Scanner;
public class ArrayDiagonalAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					count+=arr[i][j];
				}
				if(i+j==n-1 && i!=j) {
					count+=arr[i][j];
				}
			}
		}
		System.out.println(count);
	}
}
