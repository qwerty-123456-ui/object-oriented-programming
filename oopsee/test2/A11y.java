package AdvMath;
public class A11y
{
 	double x;
	public A11y(double x)
	{
		this.x=x;
	}
	public void display()
	{
		System.out.println("result:"+(Math.sin(x)+Math.cos(x)+Math.tan(x)));
	}
}
