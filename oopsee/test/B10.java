interface Cal
{
	public int res(int x,int y);
}
class B10
{
	public static void main(String[] args)
	{
		Cal c=(x,y)->(x+y);
		System.out.println("ADDITION : "+c.res(3,4));
		 Cal m=(x,y)->(x*y);
                System.out.println("MULTIPLICATION : "+m.res(5,6));
	}
}
