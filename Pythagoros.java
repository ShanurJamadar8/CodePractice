package p1;
import java.util.Scanner;
public class Pythagoros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j) {
					int k=1;
					if(j+1==i) {
						k=2;
					}
					if(j+k<n && arr[i]*arr[i]==arr[j]*arr[j]+arr[j+k]*arr[j+k]) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[j+k]);
						break;
					}
					else {
						System.out.println(i+"="+j+" + "+(j+k));
					}
				}
				else {
					System.out.println(arr[i]+"=="+arr[j]);
				}
			}
		}
	}

}
