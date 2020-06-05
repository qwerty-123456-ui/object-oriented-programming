class CDouble
{
	public static void main(String []args)
	{
		double product=1;
		if(args.length==0)
			System.out.println("No Arguments");
		else
		{
			for(int i=0;i<2;i++)
			{
				double x=Double.parseDouble(args[i]);
				product *= x;
			}
			System.out.println("The product is "+product);
		}
	}
}

