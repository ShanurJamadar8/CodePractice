package p1;
import java.util.Scanner;

public class PrimeGame {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			while(n-->0) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				
				int low = 0, high = 0;
				for(int i=l;i<=r;i++) {
					boolean isprime = true;
					if(low==0 && i!=1) {
						isprime = prime(i);
						if(isprime == true) {
							low = i;
						}
					}
					isprime = true;
					
					if(high==0 && i!=1) {
						int last = (l+r)-i;
						isprime = prime(last);
						if(isprime == true) {
							high = last;
						}							
					}
				}
				if(low==0 && high==0) {
					System.out.println(-1);
				}
				else{
					System.out.println(high-low);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();   
		}
	}
	public static boolean prime(int n) {
		for(int j=2;j<=n/2;j++) {
			if(n%j == 0) {
				return false;
			}
		}		
		return true;
	}
}
