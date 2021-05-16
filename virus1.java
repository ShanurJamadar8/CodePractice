package p1;
import java.util.*;
public class virus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String virus = sc.next();
		int n = sc.nextInt();
		while(n-->0) {
			String str = sc.next();
			int k = 0, count = 0;
			for(int i=0;i<virus.length();i++) {
				if(str.charAt(k) == virus.charAt(i)) {
					k++;
					count++;
				}
			}
			if(count == str.length()) {
				System.out.println("POSITIVE");
			}
			else {
				System.out.println("NEGATIVE");
			}
		}
	}
}