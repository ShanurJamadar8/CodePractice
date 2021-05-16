package p1;
import java.util.*;

public class Stack {
    int top ;
    final int MAX = 100;
    int [] arr;
    boolean isEmpty()
    {
        return(top<0);

    }
    public Stack()
    {
        top = -1;
        arr = new int[MAX];
    }
    boolean push(int x)
    {
        if(top > (MAX - 1))
        {
            System.out.println("Stack is overflow");
            return false;
        }
        else{
            arr[++ top] = x;
            System.out.println(x + "is pushed into the stack");
            return true;
        }
    }

    int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack is underflow");
            return 0;
        }
        else
        {
            int x = arr [top --];
            return x;
        }
    }
    int peek()
    {
        if(top < 0)
        {
            System.out.println("Stack is under flow");
            return 0;
        }
       else
       {
           int x = arr[top];
           return x;
       }

        
    }

   int display()
    {
        int count =0;
        if(top < 0)
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        else
        {
            for(int i = top ; i >= 0 ;i--)
            {
                count++;
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            return count;
        }
    }

    public static void main(String [] args) 
    {
        Stack suas = new Stack();
        int x;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        
	        System.out.println("1. For pushed item");
	        System.out.println("2. For pop item");
	        System.out.println("3. For peek item");
	        System.out.println("4. For Display item");
	        System.out.println("5. To end the operation");
	        
	        switch(sc.nextInt())
	            {
	                case 1:
	                    System.out.println("enter item to pushed into the stack");
	                    x= sc.nextInt();
	                    suas.push(x);
	                    break;
	                case 2:
	                    System.out.println(suas.pop() +"item is popped");
	                    break;
	                case 3:
	                    System.out.println(suas.peek() +"peek item is:");
	                    break;
	                case 4:
	                	int dis = suas.display();
	                	System.out.println("number of item in Stack is:"+dis);
	                	break;
	                case 5:
	                	System.exit(0);
	                default:
	                	System.out.println("wrong choice");
	            }
         	}
    }
}
