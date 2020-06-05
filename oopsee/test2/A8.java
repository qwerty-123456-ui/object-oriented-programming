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
	void read(Scanner sc)
	{
		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
			rank[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(name[i] +"  "+rank[i]);
		}
	}
}
class Rank extends Record
{
	int i,n;
	Rank(int n)
	{
		super(n);
		i=0;
	}
	void highest()
	{
		int h=rank[0];
		for(int j=0;j<n;j++)
		{
			if(rank[i]<h)
			{
				i=j;
				h=rank[i];
			}
		}
	}
	public String toString()
	{
		return "top ranker "+name[i]+" "+rank[i];
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
		r.highest();
		System.out.println(r);
	}
}

