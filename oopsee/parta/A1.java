abstract class Vehicle
{
	public boolean hashelmet;
	public int yom;
	Vehicle(boolean h,int y)
	{
		hashelmet=h;
		yom=y;
        }
        abstract public void  putData(boolean h,int y);
	abstract public String getData();
}
class TwoWheeler extends Vehicle
{
	private String brand;
	protected int cost;
	int eng;
	public String color;
	TwoWheeler(boolean h,int y,String b,int c, int e,String co)
	{
		super(h,y);
		brand=b;
		cost=c;
		eng=e;
		color=co;
	}
	public String getData()
	{
		return "---"+"\nTWO WHEELER ..INFO HERE :\nHAS HELMET:"+hashelmet+"\nYEAR OF MANUFACTURE :"+yom+" \nBRAND : "+brand+"\nCOST :"+cost+"\nENGINE TYPE :"+eng+"\nCOLOR :"+color;
	}
	public void putData(boolean h,int y)//,String b,int c, int e,String co)
	{
		super.hashelmet=h;
		super.yom=y;
                /*brand=b;
                cost=c;
                eng=e;
                color=co;*/
        }
}
class MyTwoWheeler extends TwoWheeler
{
	public String ownerName;
	MyTwoWheeler(boolean h,int y,String b,int c, int e,String co,String own)
        {
                super(h,y,b,c,e,co);
		ownerName=own;
        }
	public String getData()
        {
		System.out.print(super.getData());
                return "\nOWNER :"+ownerName+"\n---";
        }
}
final class FourWheeler extends Vehicle
{
	private String brand;
        protected int cost;
        int eng;
        public String color;
        FourWheeler(boolean h,int y,String b,int c, int e,String co)
        {
                super(h,y);
                brand=b;
                cost=c;
                eng=e;
                color=co;
        }
        public String getData()
        {
                return "FOUR WHEELER ..INFO HERE :\nHAS HELMET:"+hashelmet+"\nYEAR OF MANUFACTURE :"+yom+" \nBRAND : "+brand+"\nCOST :"+cost+"\nENGINE TYPE :"+eng+"\n COLOR :"+color;
        }
        public void putData(boolean h,int y)//,String b,int c, int e,String co)
        {
                super.hashelmet=h;
                super.yom=y;
           /*     brand=b;
                cost=c;
                eng=e;
                color=co;*/
        }
}
/*class MyFourWheeler extends FourWheeler
{
}*/
class A1
{
	public static void main(String[] args)
	{
		//Vehicle v=new Vehicle();
		//v.putData();
		//System.out.println(v.yom);
		TwoWheeler t=new TwoWheeler(true,2018,"Suzuki",190000,4,"white");
		System.out.println(t.getData());
		MyTwoWheeler m=new MyTwoWheeler(true,2018,"Suzuki",190000,4,"white","ABCXYZ");
                System.out.println(m.getData());
		FourWheeler f=new FourWheeler(true,2018,"Suzuki",190000,4,"white");
                System.out.println(f.getData());
	}
}
	
