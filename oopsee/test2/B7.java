import java.util.*;
class ValidateTriangle extends Exception
{
	ValidateTriangle()
	{
		super("Not a valid triangle");
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
		if(a+b>c && b+c>a && a+c>b)
			System.out.println("Valid Triangle");
		else
			throw new  ValidateTriangle();
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}
