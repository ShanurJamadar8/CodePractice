package p1;
import java.util.Scanner;
public class EscapeChara {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
	
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)== '/' && str.charAt(i+1)=='n' ){
				System.out.println();
				i++;
			}		
			else {
				if(i+2<str.length() && str.charAt(i+1)== '/'  && str.charAt(i+2)=='b')
					i=i+2;
				else
					if(str.charAt(i)=='/' && str.charAt(i+1)=='b')
						i++;
					else
						System.out.print(str.charAt(i));
			}
		}
	}
}
