import java.util.*;
class B11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.toUpperCase();
		char[] c=s1.toCharArray();
		int ch=0;
		for(int i=1;i<s1.length();i++)
		{
			if(c[i]==c[i-1])
				ch++;
		}
		System.out.println(ch);
	}
}


