import java.util.*;
class LowAttendanceException extends Exception
{
	LowAttendanceException(String s)
	{
		super(s);
	}
}
class LowMarksException extends Exception
{
	LowMarksException(String s)
	{
		super(s);
	}
}
class NotEligibleException extends Exception
{
	/*NotEligibleException(String s)
	{
		super(s);
	}*/
}
class seexams
{
	int m,a;
	void checkm(int m1) throws NotEligibleException
	{
		if(m1<20)
		{
			NotEligibleException e=new NotEligibleException();
	                e.initCause(new LowMarksException("marks are too less to be eligible for see ...work hard next time "));
                        throw e;
		}
		else
		{
			System.out.println("Marks are fine ");
		}
	}
	void checka(int a1) throws NotEligibleException

        {
                if(a1<80)
                {
			NotEligibleException e=new NotEligibleException();
                        e.initCause(new LowAttendanceException("attendance is too less to be eligible for see ...work hard next time "));
                        throw e;
                }
		else
                {
                        System.out.println("attendance is fine ");
                }

        }
	public static void main(String[] args)
	{
		seexams s=new seexams();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur marks and attendance");
		s.a=sc.nextInt();
	        s.m=sc.nextInt();
		try
		{
		       s.checkm(s.m);
		}
		catch(NotEligibleException e)
		{
			System.out.println("Exception raised : "+e);
			System.out.println("original cause : "+e.getCause());
		}
		try
                {
                        s.checkm(s.a);
                }
                catch(NotEligibleException e)
                {
                        System.out.println("Exception raised : "+e);
                        System.out.println("original cause : "+e.getCause());
                }


	}
}


	        	
