import java.util.*;
public class TestCalculator
{
	public static void main(String []args)
	{
		int t=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A & B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator c=new Calculator(a,b);
		while(t==1)
		{
		System.out.println("Enter the operation");
		char ch=sc.next().charAt(0);
		if(ch=='+')
			System.out.println("Addition is "+ c.add());
		else if(ch=='-')
                        System.out.println("Subtraction is "+ c.subtract());
                else if(ch=='*')
                        System.out.println("Multiplication is "+ c.multiply());
		else if(ch=='/')
		{
			double r=c.div();
			if(r==0)
				System.out.println("Divide by zero error ");
			else
				System.out.println("divison is "+ r);
		}
		else
			System.out.println("Error");
		System.out.println("to continue press 1 ");
	           t=sc.nextInt();
		}
		System.out.println("the total no. of operations done are "+c.c);
	}
}



                   


