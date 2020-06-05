import java.util.*;
class Record
{
	String[] name;
	int rank[];
	int num_of_records;
	Record(int num_of_records)
	{
		this.num_of_records=num_of_records;
		name=new String[num_of_records];
                rank=new int[num_of_records];
	}
	void readvalues(Scanner sc)
	{
		for(int i=0;i<num_of_records;i++)
		{
			name[i]=sc.next();
			rank[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(int i=0;i<num_of_records;i++)
                {
                        System.out.println(name[i]+" "+rank[i]);
                }
	}
}
class Rank extends Record
{
	int index;
	Rank(int num_of_records)
	{
		super(num_of_records);
		index=0;
	}
	void highest()
	{
		int h=rank[0];
		for(int i=0;i<num_of_records;i++)
		{
			if(rank[i]<h)
			{
				h=rank[i];
				index=i;
			}
		}
	}
	public String toString()
	{
		return name[index]+" "+rank[index];
	}
}
class A8
{
	public static void main(String[] args)
	{
		Record r=new Record(5);
		Scanner sc=new Scanner(System.in);
		//r.readvalues(sc);
		//r.display();
		Rank rt=new Rank(5);
                rt.readvalues(sc);
		rt.display();
		rt.highest();
		System.out.println("top ranker");
		System.out.println(rt);
	}
}


