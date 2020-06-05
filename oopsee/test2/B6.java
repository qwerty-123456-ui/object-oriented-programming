import java.util.*;
class Ms extends Thread
{
	double x,r;
	Ms(double x)
	{
		this.x=x;
	}
	public void run()
	{
		r=Math.sin(x);
	}
}
class Mc extends Thread
{
        double x,r;
        Mc(double x)
        {
                this.x=x;
        }
        public void run()
        {
                r=Math.cos(x);
        }
}
class Mt extends Thread
{
        double x,r;
        Mt(double x)
        {
                this.x=x;
        }
        public void run()
        {
                r=Math.tan(x);
        }
}
class B6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anglee");
		double x=sc.nextDouble();
		Ms s=new Ms(x);
		s.start();
		Mc c=new Mc(x);
		c.start();
		Mt t=new Mt(x);
		t.start();
		System.out.println("y=cos(x)+sin(x)+tan(x) ="+(s.r+c.r+t.r));
	}
}
