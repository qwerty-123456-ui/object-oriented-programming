import java.util.*;
abstract class Shape
{
	String color;
	boolean filled;
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
	String getColor()
	{
		return color;
	}
	boolean isFilled()
	{
		return filled;
	}
	void setColor(String color)
	{
		this.color=color;
	}
	void setFilled(boolean f)
	{
		filled=f;
	}
	abstract double getArea();
	public String toString()
	{
		if(filled)
			return "A shape color is "+color+" and filled";
		else
			return "A shape color is "+color+" and unfilled";
	}
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		super();
		this.r=r;
	}
	Circle(String c,boolean f,int r)
	{
		super(c,f);
		this.r=r;
	}
	double getArea()
	{
		return Math.PI*r*r;
	}
	void change(String c,boolean b)
	{
		setColor(c);
		setFilled(b);
	}
	void display()
	{
		System.out.println(getColor());
		System.out.println(isFilled());
	}
}
class Rectangle extends Shape
{
        int a,b;
        Rectangle(int a,int b)
        {
                super();
                this.a=a;
		this.b=b;
        }
        Rectangle(String c,boolean f,int a,int b)
        {
                super(c,f);
                this.a=a;
		this.b=b;
        }
        double getArea()
        {
                return a*b;
        }
        void change(String c,boolean b)
        {
                setColor(c);
                setFilled(b);
        }
        void display()
        {
                System.out.println(getColor());
                System.out.println(isFilled());
        }
}
class A2
{
	public static void main(String[] args)
	{
		Circle c=new Circle(7);
		System.out.println(c);
		System.out.println(c.getArea());
		Circle c1=new Circle("red",false,7);
                System.out.println(c1);
                System.out.println(c1.getArea());
		c1.change("blue",true);
		c1.display();
		Rectangle r=new Rectangle("black",false,10,10);
		System.out.println(r);
	}
}




		

