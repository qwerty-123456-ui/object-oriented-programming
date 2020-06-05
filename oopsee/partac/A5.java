import java.util.*;
import java.util.regex.*;
class NameException extends Exception
{
	 NameException()
	 {
		 super("Name is wrong");
	 }
}
class AgeException extends Exception
{
         AgeException()
         {
                 super("Age is wrong");
         }
}
class A5
{
	public static boolean stringContainsNumber(String s)
	{
		return Pattern.compile("[0-9]").matcher(s).find();
	}

	public static void main(String[] args)
	{
		String n="";int a=0;
		Scanner sc=new Scanner(System.in);
		try
		{
			n=sc.next();
			if(stringContainsNumber(n))
				throw new NameException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			a=sc.nextInt();
			if(a<0 || a>50)
				throw new AgeException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(!stringContainsNumber(n) && a<50 && a>0)
			System.out.println("Employee name and age is :"+n+"  "+a);
	}
}
