class C
{
	synchronized void displayTable(int n)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"*"+i+"="+(n*i));
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
}	
class D extends Thread
{
	C c;
	int n;
	D(C c,int n)
	{
		this.c=c;
		this.n=n;
	}
	public void run()
	{
		c.displayTable(n);
	}
}
class B9
{
	public static void main(String[] args)
	{
		C c=new C();
		D d=new D(c,8);
		D d1=new D(c,9);
		d.start();
		d1.start();
	}
}


