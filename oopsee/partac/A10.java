interface Cal
{
	public int res(int x,int y);
}
class A10
{
	public static void main(String[] args)
	{
		Cal c=(x,y)->(x+y);
		System.out.println("ADDITION:"+c.res(3,4));

		Cal c1=(x,y)->(x*y);
		System.out.println("MULTIPLICATION:"+c1.res(4,5));
	}
}
