import java.util.*;
class ValidateTriangleException extends Exception
{
	ValidateTriangleException()
	{
		super("Not a valid triangle");
	}
}
class A7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		try
		{
		if(a+b>c && a+c>b && c+b>a)
			System.out.println("Valid Triangle");
		else
			 throw new ValidateTriangleException();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}

