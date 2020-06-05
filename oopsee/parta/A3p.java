import java.util.*;
abstract class Student
{
private String Name;
protected int ID;
double grade;
public int age;
abstract boolean isPassed(double Grade);
void setter(String name)
{
Name=name;}
String getter()
{
return Name;
}
}
class Undergrad extends Student
{
void getData()
{ Scanner sc=new Scanner(System.in);
System.out.println("Enter Name,ID,age");
setter(sc.next());
ID=sc.nextInt();
age=sc.nextInt();
}
boolean isPassed(double Grade)
{
grade=Grade;
if(grade<=70)
return false;
else
return true;
}
void display()
{
System.out.println("Name:"+getter()+"\nAge:"+age+"\nID:"+ID);
}
/*void setter(String name)
{
}
Cannot override the final setter method*/
}
class Grad extends Student
{
void getData()
{ Scanner sc=new Scanner(System.in);
System.out.println("Enter Name,ID,age");
setter(sc.next());
ID=sc.nextInt();
age=sc.nextInt();
}
boolean isPassed(double Grade)
{grade=Grade;
if(grade<=70)
return false;
else
return true;
}
void display()
{
System.out.println("Name:"+getter()+"\nAge:"+age+"\nID:"+ID);
}
}
public class A3p
{
public static void main(String[] args) {
Undergrad u=new Undergrad();
u.getData();
if(u.isPassed(65))
System.out.println("Student has passed");
else
System.out.println("Student has failed");
u.display();
Grad g=new Grad();
g.getData();
if(g.isPassed(90))
System.out.println("Student has passed");
else
System.out.println("Student has failed");
g.display();
}
}
