class C
{
	synchronized void displayTable(int n)
	{
		try
		{
			for(int i=0;i<n;i++)
				System.out.println(n+"*"+i+"="+(n*i));
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}
}
class Ca extends Thread
{
	C c;
	int n;
	Ca(C c,int n)
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
		Ca ca=new Ca(c,8);
		Ca ca1=new Ca(c,9);
		ca.start();
		ca1.start();
	}
}
