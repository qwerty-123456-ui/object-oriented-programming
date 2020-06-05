class ECall
{
	synchronized void displayENumber()
	{
		boolean q=true;
		//System.out.println("Even numbers and odd numbers not divisible by 5 are :");
		//while(q)
		//{
		for(int i=0;i<10;i++)
		{
			if((i%5)!=0  && ((i%2)==0 ))
			{
				System.out.println(i);
				//notify();
				//q=false;
			}
			 /*try
                        {
				q=false;
                                wait();
                        }
                        catch(Exception e)
                        {}*/
		}
		//}
			//notify();
		
		}
	}

class OCall
{
        synchronized void displayONumber()
        {
		boolean q=true;
		//while(q)

		//{
               // System.out.println(" odd numbers not divisible by 5 are :");
                for(int i=0;i<10;i++)
                {
                        if((i%5)!=0  && ( (i%3)==0))
			{ 
			       	System.out.println(i);
		//		notify();
			}

			/*try
			{
				q=false;
				wait();
			}
			catch(Exception e)
			{}*/
                }
		//}
		//notify();
        }
}

class ECallme extends Thread
{
	ECall c;
	public  ECallme(ECall c)
	{
		this.c=c;
	}
	public void run()
	{
		c.displayENumber();
	}
}
class OCallme extends Thread
{
        OCall c;
       public  OCallme(OCall c)
        {
                this.c=c;
        }
        public void run()
        {
                c.displayONumber();
        }
}

class TestDisplay
{
	public static void main(String[] args)
	{
		ECall ce=new ECall();
		OCall co=new OCall();
		ECallme c1=new ECallme(ce);
		OCallme c2=new OCallme(co);
		c1.start();
		c2.start();
	}
}

