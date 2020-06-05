class Ex extends Exception
{
	private int detail;
	Ex(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "my excption "+detail;
	}
}
class ExDemo
{
	static void compute(int a) throws Ex
	{
		System.out.println("computed :"+a);
		throw new Ex(a);
	}
	public static void main(String[] args)
	{
		try
		{
			compute(5);
		}
		catch(Ex e)
		{
			System.out.println("caught :" +e);
		}
	}
}

