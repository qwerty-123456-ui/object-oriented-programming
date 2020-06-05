import java.util.*;
class Reverse
{
	public static void main(String [] args)
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the range");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<(n/2);i++)
		{
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		System.out.println("The reversed array is ");
		for(int i: a)
			System.out.println(i);
	}
}

