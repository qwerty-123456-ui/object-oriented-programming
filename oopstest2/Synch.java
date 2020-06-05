class Call
{
	synchronized public void call(String m)
	{
		System.out.print("["+m);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("interrupt");
		}
		 System.out.println("]");
	}
}
class Caller implements Runnable
{
	String msg;
	Thread t;
	Call c;
	public Caller(Call t1,String s)
	{
		this.c=t1;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(t)
		{
			c.call(msg);
		}
	}
}
public class Synch
{
	public static void main(String[] args)
	{
		Call c=new Call();
		Caller o1=new Caller(c,"hello");
		Caller o2=new Caller(c,"synch");
		Caller o3=new Caller(c,"world");
		try
		{
			o1.t.join();
			o2.t.join();
			o3.t.join();
		}
		catch(InterruptedException e)
		{
		}
	}
}
