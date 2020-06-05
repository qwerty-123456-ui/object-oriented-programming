import java.util.*;
import static java.lang.System.*;
public class B1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		out.println("enter the no and enter the starting no");
		int n=sc.nextInt();
		int m=sc.nextInt();
		A a=new A(m);
		a.start();
		B b=new B(n);
		b.start();
	}
}
class A extends Thread
{
	int m;
	A(int m)
	{
		this.m=m;
	}
	public void run()
	{
		out.println("odd numbers are");
		//Random r=new Random();
		int n,c=0;
		while(c<3)
		{
			//n=r.nextInt();
			if(m%2!=0)
			{
				out.println(m);
				c++;
			}
			m++;
		}
		if(c==3)
		{
			try
			{
				wait();
			}
			catch(Exception e){}
		}
	}
}
class B extends Thread
{
	int n;
	B(int n)
	{
		this.n=n;
	}
	public void run()
	{
		int m=0,r;
		while(n!=0)
		{
			r=n%10;
			m=m*10+r;
			n=n/10;
		}
		out.println("Reversed is "+m);
	}
}
