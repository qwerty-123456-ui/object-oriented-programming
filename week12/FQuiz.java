import java.util.*;
class FQuiz
{
	public static void main(String []args)
	{
		int n,choice=1,c=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of questions ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter answer key ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			while(choice==1)
			{
				c=0;
				int b[]=new int[n];
				System.out.println("Enters the answers ");
				for(int i=0;i<n;i++)
					b[i]=sc.nextInt();
			        for(int j=0;j<n;j++)
				{
					if(a[j]==b[j])
						c++;
				}
				System.out.println("Number of answers correct are "+c+" and percentage of correct answers is "+ ((c*100.0)/n) + "%");
				System.out.println("Grade another quiz [Y/N]:? ");
				ch=sc.next().charAt(0);
				ch=Character.toUpperCase(ch);
				if(ch == 'Y')
					choice=1;
				else
					choice=0;
			}
	}
}

