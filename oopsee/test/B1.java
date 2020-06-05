import java.util.*;
class A extends Thread
{
	int l;
	A(int l)
	{
		this.l=l;
	}
	public void run()
	{
		int c=0;
		while(c<3)
		{
			if(l%2!=0)
			{
				System.out.println(l);
				c++;
			}
			l++;
		}
		if(c==3)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
	}
}
class B extends Thread
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public void run()
	{
		int r=0,m=0;
		while(i !=0)
		{
			r=i%10;
			m=m*10+r;
			i=i/10;
		}
		System.out.println("REverse of number :"+m);
	}
}
class B1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
                int l=sc.nextInt();
		A a=new A(l);
		a.start();
		B b=new B(1234);
		b.start();
	}
}

