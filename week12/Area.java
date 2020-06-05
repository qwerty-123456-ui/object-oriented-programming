import java.util.*;
class Area
{
	public static void main(String [] args)
	{
		double area;
		if(args.length == 0)
			System.out.println("No arguments");
		else
		{
		int a=Integer.parseInt(args[0]);
		final double pi=3.14;
		area=pi*a*a;
		System.out.println("the area  is "+area);
	}}
}



