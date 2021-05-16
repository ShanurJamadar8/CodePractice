package p1;
import java.util.*;
public class Virtusa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] ignore = new int[n];
		int[] check = new int[n];
		int no1=0,no2=0;;
		int pos=0;
		for(int i = 0;i<m;i++) {
			pos = sc.nextInt();
			ignore[pos-1] = 1;
		}
		for(int j=0;j<k;j++) {
			pos = sc.nextInt();
			check[pos-1] = 1;
			if(ignore[pos-1]==1){
				no1++;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(ignore[i]==0 && check[i]==0) {
				no2++;
			}
		}
		System.out.println(no1 +" "+ no2);;
	}

}
