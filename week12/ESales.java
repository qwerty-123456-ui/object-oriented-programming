import java.util.Scanner;
import java.lang.Math;
class ESales
{
	public static void main(String []args)
	{
		double sum=0,avg=0;
		int max=0,min=0,p1=0,p2=0,n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of salesperson ");
		n=sc.nextInt();
		int a[]=new int[n];
		max=a[0];
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		       System.out.println("Enter the sales of salesperson "+( i+1));
		       a[i]=sc.nextInt();
		       sum +=a[i];
		       if(max<a[i])
		       {
			       max=a[i];
			       p1=i+1;
		       }
		       if(a[i]<min )
		       {
			       min=a[i];
			       p2=i+1;
		       }


		}
		for(int i=0;i<n;i++)
                {
                       System.out.println("Salesperson "+ (i+1)+ " has the sales of " +(a[i]));
		}
	        System.out.println("Total sales is "+sum);
                System.out.println("Average sale is "+ (sum/n));
                System.out.println("Salesperson "+p1+" had the highest sales of "+ max);
		System.out.println("Salesperson "+p2+" has the lowest sales of "+ min);
		System.out.println("Enter the value to check who exceeded the amount?" );
		int v=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			if(a[i]>v)
			{
				System.out.println("Salesperson "+ (i+1) +" exceeded the value  "+ v);
				c++;
			}
		}
		System.out.println("The total number of salesperson who exceeded the "+ v +" are "+ c);
	}
}




                       


          

