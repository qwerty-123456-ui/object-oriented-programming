import java.util.*;
class B11
{
	public static void main(String[] args)
	{
		int ch=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.toUpperCase();
		char c[]=s1.toCharArray();
		for(int i=0;i<(s1.length()-1);i++)
		{
			if(c[i]==c[i+1])
				ch++;
		}
		System.out.println(ch);
	}
}

