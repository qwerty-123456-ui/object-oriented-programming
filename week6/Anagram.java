import java.util.*;
class Anagram
{
	public static void main(String[] args)
	{
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word and 2nd word");
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()!=s2.length())
			System.out.println("IT Is NOT AN ANAGRAM");
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				
				char c1=s1.charAt(i);
				for(int j=0;j<s2.length();j++)
				{
					char c2=s2.charAt(j);
					if(c1==c2)
						k++;
				}
			}
			if(k==s1.length())
				System.out.println("an ANAGRAM");
			else
			        System.out.println("IT Is NOT AN ANAGRAM");
		}
	}
}

				
