import static java.lang.System.out;
class P
{
	void show()
	{
		out.println("HELLO PARENT");
	}
}
class C extends P
{
	void show()
	{
		out.println("HELLO CHILD");
	}
}
class dd
{
	public static void main(String[] args)
	{
		P p=new C();
		p.show();
	}
}
