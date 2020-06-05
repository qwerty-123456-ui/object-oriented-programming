import java.util.*;
class A8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String b=sc.next();
		String a=b.toLowerCase();
		char[] A={'a','e','i','o','u'};
		char[] V={'b','f','j','p','v'};
		char[] c=a.toCharArray();
		for(int i=0;i<a.length();i++)
			for(int j=0;j<5;j++)
			{
				if(c[i]==A[j])
					c[i]=V[j];
			}
		System.out.println(String.valueOf(c));
	}
}

