class DEvenOdd
{
	public static void main(String []args)
	{
		int x=0;
		if (args.length == 0)
			System.out.println("No arguments ");
		for(int i=0;i<args.length;i++)
		{
			x=Integer.parseInt(args[i]);
			if(x%2 == 0)
				System.out.println(args[i]+" is even ");
			else
                                System.out.println(args[i]+" is odd ");
		}
	}
}

