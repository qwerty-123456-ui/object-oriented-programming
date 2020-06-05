import java.util.*;
import java.util.regex.*;
class Name extends Exception
{
	Name()
	{
		super("Wrong name");
	}
}
class Age extends Exception
{
	Age()
	{
		super("Age wrong");
	}
}
class B5
{
	public static boolean stringCNo(String s)
	{
		return Pattern.compile("[0-9]").matcher(s).find();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	        try
		{
			if(stringCNo(s))
				throw new Name();
		}
		catch(Exception e){
		System.out.println(e);
		}
		int a=sc.nextInt();
		try
		{
			if(a>50 || a<0)
				throw new Age();
		}
		catch(Exception e){
                System.out.println(e);
                }
                if(!stringCNo(s) && a>50 && a<0)
			System.out.println("NAME :"+s+"\n AGE :"+a);
	}
}


