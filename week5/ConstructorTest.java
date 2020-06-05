class P
{
	P()
	{
		System.out.println("Constructor in parent");
	}
}
class C extends P
{
	C()
	{
		System.out.println("Constructor in child");
	}
}
class ConstructorTest
{
	public static void main(String[] args)
	{
		P p=new C();
	}
}


