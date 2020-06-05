public class Calculator	
{
	int a;
	int b;
	Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static int c=0;
	public int add()
	{
		c++;
		return a+b;
	}
	public int subtract()
	{
		c++;
		return a-b;
	}
	public int multiply()
	{
		c++;
		return a*b;
	}
	public double div()
	{
		c++;
		if(b==0)
			return 0;
		else
			return (double)a/b;
	}
}
	
	
