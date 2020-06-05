class Car
{
	int speed;
	double regPrice;
	String Color;
	Car(int s,double p,String c)
	{
		speed=s;
		regPrice=p;
		Color=c;
	}
	double getSalePrice()
	{
		return regPrice;
	}
	public String toString()
	{
		return "speed "+speed+" regPrice "+regPrice+" COlor " +Color;
	}
}
class Truck extends Car
{
	int weight;
	Truck(int s,double p,String c,int w)
        {
		super(s,p,c);
		weight=w;
        }       
        double getSalePrice()
        { 
		if(weight>2000)
			 return (regPrice*0.9);
		else
			return (regPrice*0.8);
        }
}
class Ford extends Car
{
        int year,md;
        Ford(int s,double p,String c,int y,int m)
        {
                super(s,p,c);
                year=y;
		md=m;
        }
        double getSalePrice()
        {
                        return (regPrice-md);
        }
}
class Sedan extends Car
{
        int length;
        Sedan(int s,double p,String c,int w)
        {
                super(s,p,c);
                length=w;
        }
        double getSalePrice()
        {
                if(length>20)
                         return (regPrice*0.95);
                else
                        return (regPrice*0.9);
        }
}
class A4
{
	public static void main(String[] args)
	{
	Truck t=new Truck(150,100000,"red",25000);
	System.out.println(t.getSalePrice());
	System.out.println(t);
	Ford t1=new Ford(150,100000,"red",25000,1000);
        System.out.println(t1.getSalePrice());
	System.out.println(t1);
	Sedan t2=new Sedan(150,100000,"red",255555);
        System.out.println(t2.getSalePrice());
	System.out.println(t2);
	}
}
