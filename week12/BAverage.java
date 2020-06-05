class BAverage
{
	public static  void main(String []args)
	{
		double sum=0;
		if(args.length==0)
			System.out.println("No Arguments");
		else
		{
			for(String i : args)
			{
				int x=Integer.parseInt(i);
                                sum +=x;
			}
				System.out.println("The average is "+ (sum/(args.length)));
		}
	}
	
}

