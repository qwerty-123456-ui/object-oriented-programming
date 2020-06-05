class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("hi");
		}
		catch(Exception e)
		{
			System.out.println(10/0);
		}
		System.out.println(10/2);
	}
}

