import java.util.*;
class B11
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
	        String a=sc.nextLine();
	        String b=a.toUpperCase();
		System.out.println("After converting to uppercase : "+b);
		for(int i=1;i<b.length();i++)
		{
			if(b.charAt(i)==b.charAt(i-1))
				count++;
		}
		System.out.println("Count of double letters "+count);
	}
}

