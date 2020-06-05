final class P
{
	final int x=0;
       final	void dis()
	{
		System.out.println("HELLO");
	}
}
class C extends P
{
	void dis()
	{
		System.out.println("Hi");
	}
}
class finaltest
{
	public static void main(String[] args)
	{
		P p=new P();
		C c=new C();
		p.x=10;
		p.dis();
		c.dis();
	}
}

