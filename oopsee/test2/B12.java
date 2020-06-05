class B12
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
		t3.setPriority(8);
		t4.setPriority(5);
		t5.setPriority(10);
		t1.start();
		if(t1.isAlive())
			System.out.println("THread 1 is alive");
		else
			System.out.println("Hread 1 is not alive");
		t2.start();
		if(t2.isAlive())
                        System.out.println("THread 2 is alive");
		else
                        System.out.println("tHread 2 is not alive");
		t3.start();
		try
		{
			t3.sleep(1000);
		}
		catch(Exception e){}
                if(t3.isAlive())
                        System.out.println("THread 3 is alive");
		else
                        System.out.println("tHread 3 is not alive");
		t4.start();
                if(t4.isAlive())
                        System.out.println("THread 4 is alive");
		else
                        System.out.println("tHread 4 is not alive");
		t5.start();
		try
                {
                        t5.sleep(1000);
                }
                  catch(Exception e){}
                if(t5.isAlive())
                        System.out.println("THread 5 is alive");
		else
                        System.out.println("Hread 5 is not alive");
		}

}
