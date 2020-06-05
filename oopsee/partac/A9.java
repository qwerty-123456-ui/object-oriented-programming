class C
{
	synchronized void displayTable(int num)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{	System.out.println(num+"*"+i+"="+(num*i));
			Thread.sleep(500);
			}
		}
		catch(Exception e){}
	}
}
class T extends Thread
{
	C c;
	int n;
	T(C c,int n)
	{
		this.c=c;
		this.n=n;
	}
	public void run()
	{
		c.displayTable(n);
	}
}
class A9
{
	public static void main(String[] args)
	{
		C c=new C();
		T t1=new T(c,8);
		T t2=new T(c,9);
		t1.start();
		t2.start();
	}
}
