package p1;
import java.util.Scanner;
public class RotateString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		k%=str.length();
		for(int i=0;i<k;i++) {
			str = str.charAt(str.length()-1) + str.substring(0,str.length()-1); 
			System.out.println(str);
		}
	}
}
