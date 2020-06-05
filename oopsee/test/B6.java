class MS extends Thread
{
	double x,res;
	MS(double x)
	{
		this.x=x;
	}
	public void run()
	{
		 res=Math.sin(x);
	}
}
class MC extends Thread
{
        double x, res;
        MC(double x)
        {
                this.x=x;
        }
        public void run()
        {
                res=Math.cos(x);
        }
}
class MT extends Thread
{
        double x,res;
        MT(double x)
        {
                this.x=x;
        }
        public void run()
        {
                res=Math.tan(x);
        }
}
public class B6
{
	public static void main(String[] args)
	{
		MS s=new MS(3.14);
		MC c=new MC(3.14);
		MT t=new MT(3.14);
		s.start();
		c.start();
		t.start();
		try
		{
			s.join();
			c.join();
			t.join();
		}catch(Exception e){}
		System.out.println("THE RESULT IS "+(s.res+c.res+t.res));
	}
}


