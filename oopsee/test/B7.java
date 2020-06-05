import java.util.*;
class ValidateTriangleException extends Exception
{
	ValidateTriangleException()
	{
		super("not a valid triangle");
	}
}
class B7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		try
		{
		if(a+b>c && b+c>a && c+a>b)
			System.out.println("Valid triangle");
		else
			throw new ValidateTriangleException();
		}
		catch(ValidateTriangleException e)
		{System.out.println(e);
		}
	}
}
