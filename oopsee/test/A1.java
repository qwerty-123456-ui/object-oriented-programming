import java.util.*;
abstract class Vehicle
{
	boolean hh;
	int yom;
	Vehicle(boolean hh,int yom)
	{
		this.hh=hh;
		this.yom=yom;
	}
	public abstract void getData();
	public abstract void putData();
}
class TwoWheeler extends Vehicle
{
	private String brand;
	protected int cost;
	String Eng;
	String color;
	int n;
	TwoWheeler(int n)
	{
		super(true,n);
		this.n=n;
	}
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		brand=sc.next();
                cost=sc.nextInt();
                Eng=sc.next();
                color=sc.next();
	}
	public void putData()
	{
		System.out.println("Brand "+brand+"\nCost "+cost+"\nEngine Type "+Eng+"\nColor "+color+"\nHas helmet "+hh+"\nYear of Manufacture  "+n);
	}
}
final class FourWheeler extends Vehicle
{
        private String brand;
        protected int cost;
        String Eng;
        String color;
        int n;
        FourWheeler(int n)
        {
                super(false,n);
		this.n=n;
        }
        public void getData()
        {
                Scanner sc=new Scanner(System.in);
                brand=sc.next();
                cost=sc.nextInt();
                Eng=sc.next();
                color=sc.next();
        }
        public void putData()
        {
                System.out.println("Brand "+brand+"\nCost "+cost+"\nEngine Type "+Eng+"\nColor "+color+"\nHas helmet "+hh+"\nYear of Manufacture  "+n);
	}
}
/*class A extends FourWheeler
{
	A()
	{
		super(5);
	}
}*/
class A1
{
	public static void main(String[] args)
	{
		TwoWheeler t=new TwoWheeler(1995);
		t.getData();
		t.putData();
		FourWheeler f=new FourWheeler(2007);
		f.getData();
		f.putData();
	}
}


