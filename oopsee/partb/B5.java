import java.util.*;
import static java.lang.System.*;
import java.util.regex.*;
class NameException extends Exception
{
	public NameException()
	{
		super("Write proper name ");
	}
}
class AgeException extends Exception
{
	public AgeException()
	{
		super("Age above 50 not accepted");
	}
}
class B5
{
	public static boolean stringContainsNumber( String s )
        {
                return Pattern.compile( "[0-9]" ).matcher( s ).find();
        }
	public static void main(String[] args)
	{
		Scanner c=new Scanner(System.in);
		String name;
		int age;
                out.println("Enter name");
		name=c.nextLine();
		try
		{
			if(stringContainsNumber(name))
				throw new NameException();
		}
		catch(Exception e)
		{
			System.out.println("Caught : "+e);
		}
		out.println("Enter ur age");
		age=c.nextInt();
                try
                {
                        if(age>50)
                                throw new AgeException();
                }
                catch(Exception e)
                {
                        System.out.println("Caught : "+e);
                }
		if(!stringContainsNumber(name) && age<50)
		{
			System.out.println("Name of employee is "+name +" Age is : "+age);
		}
	}
}
