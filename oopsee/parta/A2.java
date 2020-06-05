abstract class Shape
{
	public String color;
	public boolean filled;
	Shape()
	{
		color="green";
		filled=true;
	}
	Shape(String c,boolean f)
	{
		color=c;
		filled=f;
	}
	public void setColor(String c)
	{
		color=c;
	}
	public void setFilled(boolean f)
	{
		filled=f;
	}
	public String getColor()
	{
		return "Color is : "+color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public String toString()
	{
		if(filled)
			return "A shape with color of "+color+" and filled";
		else
			return "A shape with color of "+color+" and unfilled";
	}
	abstract double area();
}
class Circle extends Shape
{
	double r;
	Circle(String c,boolean f,double r)
	{
		super(c,f);
		this.r=r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
}
class Rectangle extends Shape
{
        double w,h;
        Rectangle(String c,boolean f,double w,double h)
        {
                super(c,f);
                this.w=w;
		this.h=h;
        }
        double area()
        {
                return w*h;
        }
}
class Square extends Rectangle
{
	Square(String c,boolean f,double a)
	{
		super(c,f,a,a);
	}
}
class A2
{
	public static void main(String[] args)
	{
		//Shape c1=new Shape();
		Circle c2=new Circle("black",false,50);
       		//System.out.println(c1);
      	        System.out.println(c2);
		Square s=new Square("blue",false,20);
		System.out.println(s);
		System.out.println(s.area());
	}
}
		



