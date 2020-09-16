import java.util.*;
class Stack
{
    int size=100;
    int arr[]=new int[size];
    int top=-1;
    public void push(int x)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else{
            arr[++top]=x;
        }
    }
    public void pop()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
		
		int n,t,d;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		d=n;
		Stack st=new Stack();
		//sta
		while(d>0)
		{
		    t=d%2;
		    st.push(t);
		    d=d/2;
		}
		System.out.println("Binary number is:-");
		st.pop();
	}
}


