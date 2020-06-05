import java.util.*;
class B8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] A={'a','e','i','o','u'};
		char[] V={'b','f','j','p','v'};
		String s1=s.toLowerCase();
		char[] c=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<5;j++)
				if(c[i]==A[j])
					c[i]=V[j];
		}
		System.out.println(String.valueOf(c));
	}
}

