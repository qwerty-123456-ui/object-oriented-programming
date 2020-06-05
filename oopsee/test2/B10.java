interface Cal
{
	public int res(int x,int y);
}
class B10
{
	public static void main(String[] args)
	{
		Cal a=(x,y)->(x+y);
		System.out.println("ADDITION :"+a.res(3,4));
		 Cal m=(x,y)->(x*y);
                System.out.println("ADDITION :"+a.res(5,7));
	}
}
