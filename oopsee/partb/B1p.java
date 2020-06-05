class A extends Thread
{
public void run()
{
boolean flag=false;
int c=0,i=0;
while(c<3)
{
if(i%2!=0)
{
System.out.println(i);
c++;
}
i++;
if(c==3)
{
flag=true;
break;
}
}
if(flag)
{
try {
wait();
}
catch(Exception e)
{}
}
}
}
class B extends Thread
{
int n;
B(int n)
{
this.n=n;
}
public void run()
{
int reversed = 0;
while(n != 0) {
int digit = n % 10;
reversed = reversed * 10 + digit;
n /= 10;
}
System.out.println("Reversed Number: " + reversed);
}}
public class B1p {
public static void main(String[] args) {
A a=new A();
a.start();
B b=new B(1234);
b.start();
}
}
