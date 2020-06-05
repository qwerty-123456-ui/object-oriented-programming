class chex
{
	public static void cal()
	{
		NullPointerException np=new NullPointerException("Null");
		np.initCause(new ArithmeticException("cause here"));
		throw np;
	}
	public static void main(String[] args)
	{
		try
		{
			cal();
		}
		catch(Exception e)
		{
			System.out.println("caught"+e);
			System.out.println("original"+e.getCause());
		}
	}
}

