package p1;
import java.util.Scanner;
public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		int min=Math.abs(arr[0]+arr[0+1]);
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(Math.abs(arr[i]+arr[j])<min) {
					min=Math.abs(arr[i]+arr[j]);
				}
			}
		}
		System.out.println(min);
	}

}

