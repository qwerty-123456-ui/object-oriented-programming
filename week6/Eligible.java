import java.util.*;
class NotEligibleToVoteException extends Exception
{
	NotEligibleToVoteException(String s)
	{
		super(s);
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

class Eligible
{
	public static void main(String[] args)
	{
		System.out.println("Enter ur age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			if(age<18 && age>=1)
				throw new  NotEligibleToVoteException("U r less than 18...so not eligible to vote  ... wait for "+(18-age)+" years");
			else if(age<1 || age>120)
				throw new InvalidAgeException("Write ur correct age ");
			else
				System.out.println("Eligible to vote");
		}
		catch(NotEligibleToVoteException e)
		{
			System.out.println("Exception raised: "+e);
		}
		catch(InvalidAgeException e)
                {
                        System.out.println("Exception raised: "+e);
                }

          }
}


