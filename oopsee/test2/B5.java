import java.util.*;
import java.util.regex.*;
class Name extends Exception 
{
	Name()
	{
		super("Wrong name");
	}
}
class 	Age  extends Exception
{
        Age()
        {
                super("Wrong age");
        }
}
class B5
{
	public static boolean sCN(String s)
	{
		return Pattern.compile("[0-9]").matcher(s).find();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		String s=sc.next();
		try
		{
			if(sCN(s))
				throw new Name();
		}
		catch(Exception e){
			System.out.println(e);
		}
		int i=sc.nextInt();
		try
                {
                        if(i>50 || i<0)
                                throw new Age();
                }
                catch(Exception e){
                        System.out.println(e);
                }
		if(!sCN(s) && i<50 && i>0)
		{
			System.out.println(s+"  "+i);
		}
	}
}

