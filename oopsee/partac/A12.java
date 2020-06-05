class A12 extends Thread
{
	public static void main(String[] args)
	{
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		Thread t4=new Thread();
		Thread t5=new Thread();
		t1.setPriority(7);
		t2.setPriority(2);
		t3.setPriority(10);
		t4.setPriority(5);
		t5.setPriority(8);
		t1.start();
		if(t1.isAlive())
			System.out.println("thread 1 alive");
		else
			System.out.println("thread 1 not alive");
		t2.start();
		if(t2.isAlive())
                        System.out.println("thread 2 alive");
                else
                        System.out.println("thread 2 not alive");
		t3.start();
		try
		{
		t3.sleep(1000);
		}catch(Exception e){}
		if(t3.isAlive())
                        System.out.println("thread 3 alive");
                else
                        System.out.println("thread 3 not alive");
		t4.start();
		if(t4.isAlive())
                        System.out.println("thread 4 alive");
                else
                        System.out.println("thread 4 not alive");
		t5.start();
		try
		{
		t5.sleep(1000);
		}catch(Exception e){}
		if(t5.isAlive())
                        System.out.println("thread 5 alive");
                else
                        System.out.println("thread 5 not alive");
	}
}

		
