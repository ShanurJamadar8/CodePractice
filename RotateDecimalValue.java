package p1;
import java.util.*;
import java.lang.Math;

class RotateDecimalValue {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str = sc.next();

            String str1 = new String();

            int[] arr = new int[str.length()];
            
            long max=0; 
            int j=0;
            int c=0;
            for(int i=0;i<n;i++){
                long dec = (long)Long.parseLong(str,2);
                if(dec>max){
                	System.out.println("dec>max "+ i);
                    max = dec;
                    j=0;
                    c=i;
                    for(int k1=0;k1<str.length();k1++) {
                    	arr[k1]=0;
                    }
                    arr[j++]=i;
                    str1=str;
                    System.out.println("arr[0]:"+arr[0]);
                }
                else if(dec==max && str1.equals(str)){
                	System.out.println("dec==max"+i);
                	System.out.println("arr["+j+"]:"+arr[j]);
                    arr[j++]=i-c;
                    c=i;
                }
                str = str.substring(1)+str.charAt(0);
                System.out.println("str->"+str);
            }
            
            int count=0;
            boolean temp=false;
            while(k>0){
                for(int p=0;p<str.length();p++){
                	System.out.println("***arr["+p+"]:"+arr[p]);
                	if(p==0 && arr[p]==0)
                		k--;
                	if(arr[p]>0) {
                		count += arr[p];
                		System.out.println("count::"+count);
                		k--;
                	}
                    if(k==0){
                        System.out.println(count);
                        break;
                    }
                }
                count = count+ str.length()-c;
            }
        }
    }
}