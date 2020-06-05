import java.util.*;
import static java.lang.System.*;
class ValidateException extends Exception
{
	ValidateException()
	{
		super("Not a valid triangle");
	}
	public String toString()
	{
		return "Not a valid triangle";
	}
}
class B7 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		out.println("Enter the three sides");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		try
		{
			if(a+b>c && b+c>a && a+c>b)
				out.println("Valid triangle");
			else
				throw new ValidateException();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}

