class New extends Thread//implements Runnable
{
	//Thread t;
	New()
	{
		//t=new Thread(this,"demo ");
		super("demo");
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		System.out.println("child thread :"+this);
		//start();
	}
	public void run()
	{
		try
		{
			System.out.println("child thread");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println(Thread.currentThread().isAlive());
	}
}
class runt
{
	public static void main(String[] args)
	{
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		New n=new New();
		n.setPriority(Thread.MAX_PRIORITY);
		n.start();
		try
		{
		n.join();
		}
		catch(Exception e){}
		//n.setPriority(Thread.MAX_PRIORITY);
		try
		{
			System.out.println(n.getPriority());
			System.out.println("main thread");
                        Thread.sleep(1000);
		}
		catch(InterruptedException e)
                {
                }
		System.out.println(n.isAlive());
	}
}

