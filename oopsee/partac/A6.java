class MS extends Thread
{
	double d,r;
	MS(double d)
	{
		this.d=d;
	}
	public void run()
	{
		r=Math.sin(d);
	}
}
class MC extends Thread
{
        double d,r;
        MC(double d)
        {
                this.d=d;
        }
        public void run()
        {
                r=Math.cos(d);
        }
}
class MT extends Thread
{
        double d,r;
        MT(double d)
        {
                this.d=d;
        }
        public void run()
        {
                r=Math.tan(d);
        }
}
class A6 
{
	public static void main(String[] args)
	{
		MS s=new MS(45.0);
		MC c=new MC(45.0);
		MT t=new MT(45.0);
		s.start();
		c.start();
		t.start();
		try
		{
			s.join();
			c.join();
			t.join();
		        System.out.println("sin(x)+cox(x)+tan(x)="+(s.r+c.r+t.r));
		}
		catch(Exception e){}
	}
}
