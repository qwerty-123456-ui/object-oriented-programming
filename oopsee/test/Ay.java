package AdvMath;
public class Ay
{
	double x;
        public Ay(double x)
	{
		this.x=x;
	}
	public void res()
	{
		double r=Math.sin(x)+Math.cos(x)+Math.tan(x);
		System.out.println(r);
	}
}

