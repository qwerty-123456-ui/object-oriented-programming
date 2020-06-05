class finally1
{
	static void a()
	{
		try
		{
			 System.out.println("A");
			 throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("In A's finally");
		}
	}
	static void b()
        {
                try
                {
                         System.out.println("B");
			 return;
                         //throw new RuntimeException("demo");
                }
                finally
                {
                        System.out.println("In B's finally");
                }
        }
	static void c()
        {
                try
                {
                         System.out.println("C");

                        // throw new RuntimeException("demo");
                }
                finally
                {
                        System.out.println("In C's finally");
                }
        }
	public static void main(String[] a)
	{
		try
		{
			a();
		}
		catch(Exception e){}
		b();
		c();
	}
}


