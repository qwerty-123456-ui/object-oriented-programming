public class B1
{
        public static void main(String[] args)
        {
                int count=0;
		Thread1 t1;
		Thread2 t2;
                for(int i=152;true;i++)
                {
			if(i%2!=0)
			{
				count++;
                        t1=new Thread1(i);
                        t2=new Thread2(i);
		
                        t1.start();
                        t2.start();
                        try{
                                t1.join();
                                t2.join();
                        }
                        catch(Exception e){}
			
			if(count==3)
				 Thread.currentThread().stop();
			}
	        }       
        }
}
class Thread1 extends Thread
{
        int i;
	static int count=0;
        Thread1(int i)
        {
                this.i=i;
        }
        public void run()
        {
		/*count++;
                if(count==3)
                {
			Thread.currentThread().stop();
                }*/
                System.out.println("The number is : "+i);
        }
}
class Thread2 extends Thread
{
        int i;
	static int count=0;
        Thread2(int i)
        {
                this.i=i;
        }
        public void run()
        {
		/*count++;
                if(count==3)
		{		
			Thread.currentThread().stop();
		}*/
                int m=0,r=0;
                while(i!=0)
                {
                        r=i%10;
                        m=m*10+r;
                        i=i/10;
                }
                System.out.println("The number is : "+m);
        }
}
