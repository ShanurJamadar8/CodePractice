package p1;
import java.util.Scanner;
public class ProbabilityOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			char[] str1 = new char[str.length()-1];
			int m=0;
			for(int j=0;j<str.length();j++) {
				if(i!=j) {
					str1[m++]=str.charAt(j);
				}
			}
			do {
				for(int k=0;k<m/2;k++) {
					
				}
			}while(m--!=0);
		}

	}

}
