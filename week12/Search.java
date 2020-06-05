import java.util.*;
class Search
{
	public static void main(String []args)
	{
		int n,key,c=0,r=0;
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of array ");
                n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		 for(int i=0;i<a.length;i++)	  
                    	a[i]=sc.nextInt();
		System.out.println("Enter the key");
		key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key == i)
			{       
			
				 c=1;
				break;
			
			}
			else	c=0;
		}
		if(c==1)
				System.out.println("Key  found ");
		else
			  System.out.println("key not  found\n");
		}
	}
			      

