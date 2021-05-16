package p1;
import java.util.Scanner;
public class StringDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i=0;
		System.out.print("String:");
		for(;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				break;
			}
			System.out.print(str.charAt(i));
		}
		System.out.print("\nDigit:"+str.substring(i));

	}

}
