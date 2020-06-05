class CLA
{
	public static void main(String[] args)
	{
		double x=0;
		double sum=1;
		if(args.length==0)
			System.out.println("NO argumemts");
		else
			for(String i: args)
			{
				x=Double.parseDouble(i);
				System.out.println("the area is : "+ ((Math.PI)*x*x));
				sum *=x;
				if(x%2 ==0)
					System.out.println("Even");
				else
					System.out.println("ODD");
			}

				System.out.println("THe avaerage is :"+(sum));
	}
}
