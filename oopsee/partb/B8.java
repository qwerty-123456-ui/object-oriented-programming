import java.util.Scanner;

class B8
{
	public static void main(String[] args)
	{
		char A[]={'b','f','j','p','v'};
		char V[]={'a','e','i','o','u'};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		String b=a.toLowerCase();
		char ch[]=b.toCharArray();
		//StringBuffer sb=new StringBuffer(b);
		for(int i=1;i<b.length();i++)
		{
			for(int j=0;j<5;j++)
			{
				if(ch[i]==V[j])
					ch[i]=A[j];
					
			}
					
					
		}
		b=String.valueOf(ch);
		
		System.out.println("After replacing : "+b);
	}
}
