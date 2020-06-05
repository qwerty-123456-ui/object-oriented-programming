class Car
{
	int speed;
	double regularPrice;
	String color;
	Car(int s,double p,String c)
	{
		speed=s;
		regularPrice=p;
		color=c;
	}
	double getSalePrice()
	{
		return regularPrice;
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
			return regularPrice*0.9;
		else
			return regularPrice*0.8;
	}
}
class Sedan extends Car
{
	int length;
	Sedan(int s,double p,String c,int l)
        {       
                super(s,p,c);
                length=l;
        }       
        double getSalePrice()
        {       
                if(length>20)
                        return regularPrice*0.95;
                else
                        return regularPrice*0.90;
        }
}
class Ford extends Car
{
	int year;
	int manufactureDiscount;
	Ford(int s,double p,String c,int y,int m)
        {
                super(s,p,c);
		year=y;
		manufactureDiscount=m;
	}
	double getSalePrice()
	{
		return (regularPrice-manufactureDiscount);
	}
}
class A4
{
	public static void main(String[] args)
	{
		Sedan s1=new Sedan(150,1200000,"red",25);
		System.out.println("Sale price is :"+s1.getSalePrice());
		 Sedan s2=new Sedan(150,1200000,"red",15);
                System.out.println("Sale price is :"+s2.getSalePrice());
		 Ford f1=new Ford(150,1200000,"red",25,60000);
                System.out.println("Sale price is :"+f1.getSalePrice());
		 Ford f2=new Ford(150,1200000,"red",68,300000);
                System.out.println("Sale price is :"+f2.getSalePrice());
		Car c=new Car(120,23467,"ned");
		System.out.println("Sale price is :"+c.getSalePrice());

	}
}

