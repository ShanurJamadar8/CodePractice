package p1;
import java.util.Scanner;
public class MinimumSizeOfBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		boolean flag = false;
		int m=1;
		int row=1;
		while(!flag) {
			int l=(int)Math.pow(m,2);
			if(l<n) {
				m++;
				row+=k;
			}
			else {
				System.out.println(row);
				flag=true;
			}
		}	
	}
}