class P
{
	void print()
	{
		System.out.println("Hello oops");
	}
}
class S extends P
{
	void print()
	{
		System.out.println("Hello java");
	}
}
class hello
{
	public static void main(String[] args)
	{
		P p=new P();
		p.print();
		S s=new S();
		s.print();
		P p1=new S();
		p1.print();
	}
}

