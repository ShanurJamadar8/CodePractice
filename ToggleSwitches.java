package p1;
import java.util.*;
public class ToggleSwitches {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-->0) {
				int change = 0, count = 0;
				int s1 = sc.nextInt();
				int[] arr = new int[s1];
				for(int i=0;i<s1;i++) {
					arr[i] = sc.nextInt();
					if(arr[i]==1) {
						count++;
					}
				}
				
				int s2 = sc.nextInt();
				int[] q = new int[s1];
				for(int i=0;i<s2;i++) {
					q[i] = sc.nextInt();
					int prev = count;
					if(arr[q[i]-1] == 0) {
						count++;
						arr[q[i]-1] = 1;
					}
					else {
						count--;
						arr[q[i]-1] = 0;						
					}
					if((prev<=s1/2 && count>s1/2) || (prev>s1/2 && count<=s1/2)){
						change++;
					}
				}
				System.out.println(change);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
