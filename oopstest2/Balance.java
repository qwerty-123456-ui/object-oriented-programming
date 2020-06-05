package MyPack;
public class Balance
{
	String name;
	double b;
	public Balance(String n,double b)
	{
		name=n;
		this.b=b;
	}
	public void show()
	{
		if(b<0)
			System.out.println("--->");
		System.out.println(name +" : $ "+b);
	}
}

