abstract class Shape
{
String color;
boolean filled;
abstract double getArea();
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
boolean isFILLED()
{
return filled;
}
String getColor()
{
return color;
}
void setFILLED(boolean b)
{
this.filled=b;
}
void setColor(String c)
{
this.color=c;
}
public String toString()
{
if(this.filled==false)
return "A Shape with color " +this.color+" and not filled";
else
return "A Shape with color " +this.color+" and filled";
}}
class Circle extends Shape
{
int r;
Circle(int r1)
{ super();
r=r1;
}
Circle(String c,boolean f,int r1)
{ super(c,f);
r=r1;
}
double getArea()
{
return 3.14*r*r;
}
void display()
{
System.out.println(isFILLED());
System.out.println(getColor());
}
void change(String c,boolean b)
{
setColor(c);
setFILLED(b);
}
}
final class Rectangle extends Shape
{
int a,b;
Rectangle(int a1,int b1)
{ super();
a=a1;
b=b1;
}
Rectangle(String c,boolean f,int a1,int b1)
{ super(c,f);
a=a1;
b=b1;
}
double getArea()
{
return a*b;}
}
/*class Square extends Rectangle
{ Square()
{
super(5,6);
}
void display()
{
System.out.println(a + " " + b);
}
}
Cannot inherit a final class
*/
public class A2p
{
public static void main(String[] args) {
/*Shape s=new Shape();
CAnnor create instance of an abstact class*/
Circle c=new Circle("blue",false,5);
Rectangle r=new Rectangle("red",true,2,4);
System.out.println(c);
System.out.println(r);
System.out.println(c.getArea());
System.out.println(r.getArea());
c.display();
c.change("brown",true);
c.display();
}
}
