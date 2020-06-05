import java.util.*;
class Record
{
	String name[];
	int rank[];
	int n;
	Record(int n)
	{
		this.n=n;
		name=new String[n];
		rank=new int[n];
	}
	public void read(Scanner sc)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name and rank of student "+(i+1));
			name[i]=sc.next();
			rank[i]=sc.nextInt();
		}
	}
	public void display()
	{
		for(int i=0;i<n;i++)
                {
                        System.out.println("name and rank of student "+(i+1)+"  " +name[i]+"  "+rank[i]);
                }
	}
		
}
class Rank extends Record
{
	int i;
	Rank(int n)
	{
		super(n);
		i=0;
	}
	public void highest()
	{
		int h=rank[0];
		for(int j=0;j<n;j++)
		{
			if(rank[j]<h)
			{
				i=j;
				h=rank[j];
			}
		}
	}
	public String toString()
	{
		return name[i]+" "+rank[i];
	}
}
class A8
{
	public static void main(String[] args)
        {
		Scanner sc=new Scanner(System.in);
		Rank r=new Rank(5);
		r.read(sc);
		r.display();
		//System.out.println(r);
		r.highest();
		System.out.println(r);
	}
}
